package com.example.ismael.infosaude.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.example.ismael.infosaude.R;
import com.example.ismael.infosaude.R2;
import com.example.ismael.infosaude.domain.RemedioDomain;

import butterknife.BindView;

public class DetalheRemedioActivity extends BaseActivity {

    @BindView(R2.id.detalhe_nome_remedio)
    public TextView mNomeRemedio;

    @BindView(R2.id.detalhe_principio_ativo)
    public TextView mPrincipioAtivo;

    @BindView(R2.id.detalhe_apresentacao)
    public TextView mApresentacao;

    @BindView(R2.id.detalhe_classe_terapeutica)
    public TextView mClasseTerapeutica;

    @BindView(R2.id.detalhe_laboratorio)
    public TextView mLaboratorio;

    @BindView(R2.id.detalhe_cnpj)
    public TextView mCnpj;

    @BindView(R2.id.detalhe_registro)
    public TextView mRegistro;

    @BindView(R2.id.detalhe_codigo_barra)
    public TextView mCodigoBarras;

    @BindView(R2.id.detalhe_restricao)
    public TextView mRestricao;

    @BindView(R2.id.detalhe_ultima_alteracao)
    public TextView mUltimaAlteracao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_remedio);

        final Bundle extras = getIntent().getExtras();
        RemedioDomain data = (RemedioDomain) extras.get("data");

        if(data == null) return;

        mNomeRemedio.setText(data.getProduto());
        mPrincipioAtivo.setText(data.getPrincipioAtivo());
        mApresentacao.setText(data.getApresentacao());
        mClasseTerapeutica.setText(data.getClasseTerapeutica());
        mLaboratorio.setText(data.getLaboratorio());
        mCnpj.setText(data.getCnpj());
        mRegistro.setText(data.getRegistro());
        mCodigoBarras.setText(data.getCodBarraEan());
        mRestricao.setText(data.getRestricao());
        mUltimaAlteracao.setText(data.getUltimaAlteracao());
    }
}
