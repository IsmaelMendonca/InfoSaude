package com.example.ismael.infosaude.activities;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ismael.infosaude.R;
import com.example.ismael.infosaude.R2;
import com.example.ismael.infosaude.domain.EstabelecimentoDomain;
import com.example.ismael.infosaude.domain.RemedioDomain;
import com.example.ismael.infosaude.interfaces.IEstabelecimentoCallback;
import com.example.ismael.infosaude.services.IEstabelecimentoService;
import com.example.ismael.infosaude.services.IRemedioService;
import com.example.ismael.infosaude.singletons.ConfigurationsProperties;
import com.example.ismael.infosaude.utils.AppUtils;
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

public class BuscaEstabelecimentoActivity extends BaseActivity implements IEstabelecimentoCallback {

    @BindView(R2.id.rv_lista_estabelecimento)
    RecyclerView mListaEstabelecimento;
    @BindView(R2.id.bt_est_mostrar_busca)
    Button mMostrarBusca;
    @BindView(R2.id.ll_est_busca_container)
    LinearLayout mBuscaContainer;
    @BindView(R2.id.et_est_nome_estabelecimento)
    EditText mNomeEstabelecimento;
    //TODO: COLOCAR SPINNER AQUI
    @BindView(R2.id.et_est_categoria)
    EditText mCategoria;
    @BindView(R2.id.et_est_especialidade)
    EditText mEspecialidade;
    @BindView(R2.id.et_est_municipio)
    EditText mMunicipio;
    @BindView(R2.id.et_est_uf)
    EditText mUf;
    @BindView(R2.id.et_est_quantidade_itens)
    EditText mQuantidadeItens;
    @BindView(R2.id.bt_buscar_estabelecimento)
    Button mBuscarEstabelecimento;

    private final static int INTERNET_PERMISSION_CODE = 21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca_estabelecimento);
        ButterKnife.bind(this);
    }

    @OnClick(R2.id.bt_est_mostrar_busca)
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

    @OnClick(R2.id.bt_buscar_estabelecimento)
    public void callService() {
        closeDialog();
        createProgressDialog(getString(R.string.alert_doing_request), getString(R.string.alert_loading), this);

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl(ConfigurationsProperties.getInstance().getmBaseUrl()).
                addConverterFactory(JacksonConverterFactory.create(new ObjectMapper())).
                build();

        IEstabelecimentoService remedioService = retrofit.create(IEstabelecimentoService.class);

        Map<String, String> urlParameters = new HashMap<>();

        if(!AppUtils.isEmpty(mMunicipio.getText()))
            urlParameters.put("municipio", mMunicipio.getText().toString());

        if(!AppUtils.isEmpty(mUf.getText()))
            urlParameters.put("uf", mUf.getText().toString());

        if(!AppUtils.isEmpty(mNomeEstabelecimento.getText()))
            urlParameters.put("nomeFantasia", mNomeEstabelecimento.getText().toString());

        if(!AppUtils.isEmpty(mCategoria.getText()))
            urlParameters.put("categoria", mCategoria.getText().toString());

        if(!AppUtils.isEmpty(mEspecialidade.getText()))
            urlParameters.put("especialidade", mEspecialidade.getText().toString());

        if(!AppUtils.isEmpty(mQuantidadeItens.getText()))
            urlParameters.put("quantidade", mQuantidadeItens.getText().toString());

        Call<List<EstabelecimentoDomain>> call = remedioService.getEstabelecimento(urlParameters);
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<List<EstabelecimentoDomain>> call, Response<List<EstabelecimentoDomain>> response) {
        if(response.body() == null || response.body().isEmpty())
            return;

        List<EstabelecimentoDomain> data = response.body();

        EstabelecimentoAdapter adapter = new EstabelecimentoAdapter(data, this);
        mListaEstabelecimento.setAdapter(adapter);
        RecyclerView.LayoutManager layout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mListaEstabelecimento.setLayoutManager(layout);

        closeDialog();
    }

    @Override
    public void onFailure(Call<List<EstabelecimentoDomain>> call, Throwable t) {
        closeDialog();
    }


    class EstabelecimentoAdapter extends RecyclerView.Adapter<EstabelecimentoAdapter.EstabelecimentoItemHolder> {

        private List<EstabelecimentoDomain> mSource;
        private Context mContext;

        public EstabelecimentoAdapter(List<EstabelecimentoDomain> source, Context context) {
            mSource = source;
            mContext = context;
        }

        @Override
        public EstabelecimentoAdapter.EstabelecimentoItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_estabelecimento, parent, false);
            EstabelecimentoItemHolder itemViewHolder = new EstabelecimentoItemHolder(view);
            return itemViewHolder;
        }

        @Override
        public void onBindViewHolder(EstabelecimentoItemHolder holder, int position) {
            if(position >= mSource.size())
                return;

            final EstabelecimentoDomain data = mSource.get(position);

            holder.mNomeEstabelecimento.setText(data.getNomeFantasia());
            holder.mCnpj.setText(data.getCnpj());
            holder.mTelefone.setText(data.getTelefone());
            holder.mRootContainer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, DetalheEstabelecimentoActivity.class);
                    intent.putExtra("data", data);
                    startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount() {
            return mSource.size();
        }

        class EstabelecimentoItemHolder extends RecyclerView.ViewHolder {

            public TextView mNomeEstabelecimento;
            public TextView mCnpj;
            public TextView mTelefone;
            public LinearLayout mRootContainer;

            public EstabelecimentoItemHolder(View view) {
                super(view);

                mNomeEstabelecimento = (TextView) view.findViewById(R.id.tv_est_nome_estabelecimento);
                mCnpj = (TextView) view.findViewById(R.id.tv_est_cnpj);
                mTelefone = (TextView) view.findViewById(R.id.tv_est_telefone);
                mRootContainer = (LinearLayout) view.findViewById(R.id.ll_est_root_container);
            }
        }
    }
}
