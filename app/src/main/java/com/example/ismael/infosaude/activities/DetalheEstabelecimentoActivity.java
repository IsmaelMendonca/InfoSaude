package com.example.ismael.infosaude.activities;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ismael.infosaude.R;
import com.example.ismael.infosaude.R2;
import com.example.ismael.infosaude.domain.EstabelecimentoDomain;
import com.example.ismael.infosaude.domain.RemedioDomain;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DetalheEstabelecimentoActivity extends AppCompatActivity {

    @BindView(R2.id.detalhe_est_codigo_cnes)
    public TextView mCodigoCnes;

    @BindView(R2.id.detalhe_est_codigo_unidade)
    public TextView mCodigoUnidade;

    @BindView(R2.id.detalhe_est_codigo_ibge)
    public TextView mCodigoIbge;

    @BindView(R2.id.detalhe_est_cnpj)
    public TextView mCnpj;

    @BindView(R2.id.detalhe_est_nome_fantasia)
    public TextView mNomeFantasia;

    @BindView(R2.id.detalhe_est_natureza)
    public TextView mNatureza;

    @BindView(R2.id.detalhe_est_tipo_unidade)
    public TextView mTipoUnidade;

    @BindView(R2.id.detalhe_est_esfera_administrativa)
    public TextView mEsferaAdministrativa;

    @BindView(R2.id.detalhe_est_vinculo_sus)
    public TextView mVinculoSus;

    @BindView(R2.id.detalhe_est_retencao)
    public TextView mRetencao;

    @BindView(R2.id.detalhe_est_fluxo_clientela)
    public TextView mFluxoClientela;

    @BindView(R2.id.detalhe_est_origem_geografica)
    public TextView mOrigemGeografica;

    @BindView(R2.id.detalhe_est_atendimento_emergencia)
    public TextView mAtendimentoEmergencia;

    @BindView(R2.id.detalhe_est_atendimento_ambulatorial)
    public TextView mAtendimentoAmbulatorial;

    @BindView(R2.id.detalhe_est_centro_cirurgico)
    public TextView mCentroCirurgico;

    @BindView(R2.id.detalhe_est_obstreta)
    public TextView mObstreta;

    @BindView(R2.id.detalhe_est_neo_natal)
    public TextView mNeoNatal;

    @BindView(R2.id.detalhe_est_dialise)
    public TextView mDialise;

    @BindView(R2.id.detalhe_est_descricao_completa)
    public TextView mDescricaoCompleta;

    @BindView(R2.id.detalhe_est_tipo_unidade_cnes)
    public TextView mTipoUnidadeCnes;

    @BindView(R2.id.detalhe_est_categoria_unidade)
    public TextView mCategoriaUnidade;

    @BindView(R2.id.detalhe_est_logradouro)
    public TextView mLogradouro;

    @BindView(R2.id.detalhe_est_numero)
    public TextView mNumero;

    @BindView(R2.id.detalhe_est_bairro)
    public TextView mBairro;

    @BindView(R2.id.detalhe_est_cidade)
    public TextView mCidade;

    @BindView(R2.id.detalhe_est_uf)
    public TextView mUf;

    @BindView(R2.id.detalhe_est_cep)
    public TextView mCep;

    @BindView(R2.id.detalhe_est_turno_atendimento)
    public TextView mTurnoAtendimento;

    @BindView(R2.id.detalhe_est_latitude)
    public TextView mLatitude;

    @BindView(R2.id.detalhe_est_longitude)
    public TextView mLongitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_estabelecimento);

        ButterKnife.bind(this);

        final Bundle extras = getIntent().getExtras();
        EstabelecimentoDomain data = (EstabelecimentoDomain) extras.get("data");

        if(data == null) return;

        mCodigoCnes.setText(String.valueOf(data.getCodCnes()));
        mCodigoUnidade.setText(data.getCodUnidade());
        mCodigoIbge.setText(String.valueOf(data.getCodIbge()));
        mCnpj.setText(data.getCnpj());
        mNomeFantasia.setText(data.getNomeFantasia());
        mNatureza.setText(data.getNatureza());
        mTipoUnidade.setText(data.getTipoUnidade());
        mEsferaAdministrativa.setText(data.getEsferaAdministrativa());
        mVinculoSus.setText(data.getVinculoSus());
        mRetencao.setText(data.getRetencao());
        mFluxoClientela.setText(data.getFluxoClientela());
        mOrigemGeografica.setText(data.getOrigemGeografica());
        mAtendimentoEmergencia.setText(data.getTemAtendimentoUrgencia());
        mAtendimentoAmbulatorial.setText(data.getTemAtendimentoAmbulatorial());
        mCentroCirurgico.setText(data.getTemCentroCirurgico());
        mObstreta.setText(data.getTemObstetra());
        mNeoNatal.setText(data.getTemNeoNatal());
        mDialise.setText(data.getTemDialise());
        mDescricaoCompleta.setText(data.getDescricaoCompleta());
        mTipoUnidadeCnes.setText(data.getTipoUnidadeCnes());
        mCategoriaUnidade.setText(data.getCategoriaUnidade());
        mLogradouro.setText(data.getLogradouro());
        mNumero.setText(data.getNumero());
        mBairro.setText(data.getBairro());
        mCidade.setText(data.getCidade());
        mUf.setText(data.getUf());
        mCep.setText(data.getCep());
        mTurnoAtendimento.setText(data.getTurnoAtendimento());
        mLatitude.setText(String.valueOf(data.getLat()));
        mLongitude.setText(String.valueOf(data.getLongX()));
    }

    @OnClick(R2.id.detalhe_est_localizacao)
    public void irParaMapa() {

    }
}
