package com.example.ismael.infosaude.activities;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ismael.infosaude.utils.AppUtils;
import com.example.ismael.infosaude.R;
import com.example.ismael.infosaude.R2;
import com.example.ismael.infosaude.domain.RemedioDomain;
import com.example.ismael.infosaude.interfaces.IRemedioCallback;
import com.example.ismael.infosaude.services.IRemedioService;
import com.example.ismael.infosaude.singletons.ConfigurationsProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class BuscaRemedioActivity extends BaseActivity implements IRemedioCallback {
    @BindView(R2.id.rv_lista_farmacia)
    RecyclerView mListaFarmacia;
    @BindView(R2.id.bt_mostrar_busca)
    Button mMostrarBusca;
    @BindView(R2.id.ll_busca_container)
    LinearLayout mBuscaContainer;
    @BindView(R2.id.et_nome_remedio)
    EditText mNomeRemedio;
    @BindView(R2.id.et_quantidade_itens)
    EditText mQuantidadeItens;
    @BindView(R2.id.bt_buscar_remedio)
    Button mBuscarRemedio;

    private final static int INTERNET_PERMISSION_CODE = 21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca_remedio);

        ButterKnife.bind(this);
    }

    @OnClick(R2.id.bt_mostrar_busca)
    public void toggleContainerVisibility() {
        if(mBuscaContainer.getVisibility() == View.VISIBLE)
            mBuscaContainer.setVisibility(View.GONE);
        else
            mBuscaContainer.setVisibility(View.VISIBLE);
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);

        requestPermissions();
    }

    private void requestPermissions() {
        if(ActivityCompat.checkSelfPermission(this, android.Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.INTERNET}, INTERNET_PERMISSION_CODE);
        }
    }

    @OnClick(R2.id.bt_buscar_remedio)
    public void callService() {

        closeDialog();
        createProgressDialog(getString(R.string.alert_doing_request), getString(R.string.alert_loading), this);

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl(ConfigurationsProperties.getInstance().getmBaseUrl()).
                addConverterFactory(JacksonConverterFactory.create(new ObjectMapper())).
                build();

        IRemedioService remedioService = retrofit.create(IRemedioService.class);

        Map<String, String> urlParameters = new HashMap<>();

        if(!AppUtils.isEmpty(mNomeRemedio.getText()))
            urlParameters.put("produto", mNomeRemedio.getText().toString());

        if(!AppUtils.isEmpty(mQuantidadeItens.getText()))
            urlParameters.put("quantidade", mQuantidadeItens.getText().toString());

        Call<List<RemedioDomain>> call = remedioService.getRemedio(urlParameters);
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<List<RemedioDomain>> call, Response<List<RemedioDomain>> response) {

        if(response.body() == null || response.body().isEmpty())
            return;

        List<RemedioDomain> data = response.body();

        RemedioAdapter adapter = new RemedioAdapter(data, this);
        mListaFarmacia.setAdapter(adapter);
        RecyclerView.LayoutManager layout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mListaFarmacia.setLayoutManager(layout);

        closeDialog();
    }

    @Override
    public void onFailure(Call<List<RemedioDomain>> call, Throwable t) {
        closeDialog();
    }


    class RemedioAdapter extends RecyclerView.Adapter<RemedioAdapter.RemedioItemHolder> {

        private List<RemedioDomain> mSource;
        private Context mContext;

        public RemedioAdapter(List<RemedioDomain> source, Context context) {
            mSource = source;
            mContext = context;
        }

        @Override
        public RemedioItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_remedio, parent, false);
            RemedioItemHolder itemViewHolder = new RemedioItemHolder(view);
            return itemViewHolder;
        }

        @Override
        public void onBindViewHolder(RemedioItemHolder holder, int position) {
            if(position >= mSource.size())
                return;

            final RemedioDomain data = mSource.get(position);

            holder.mNomeRemedio.setText(data.getProduto());
            holder.mUltimaAlteracao.setText(data.getUltimaAlteracao());
            holder.mNomeLaboratorio.setText(data.getLaboratorio());
            holder.mRootContainer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, DetalheRemedioActivity.class);
                    intent.putExtra("data", data);
                    startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount() {
            return mSource.size();
        }

        class RemedioItemHolder extends RecyclerView.ViewHolder {

            public TextView mNomeRemedio;
            public TextView mUltimaAlteracao;
            public TextView mNomeLaboratorio;
            public LinearLayout mRootContainer;

            public RemedioItemHolder(View view) {
                super(view);

                mNomeLaboratorio = (TextView) view.findViewById(R.id.tv_nome_farmacia);
                mNomeRemedio = (TextView) view.findViewById(R.id.tv_nome_remedio);
                mUltimaAlteracao = (TextView) view.findViewById(R.id.tv_data_alteracao);
                mRootContainer = (LinearLayout) view.findViewById(R.id.ll_root_container);
            }
        }
    }
}
