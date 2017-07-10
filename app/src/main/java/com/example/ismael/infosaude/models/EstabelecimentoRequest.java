package com.example.ismael.infosaude.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by Ismael on 24/03/2017.
 */

public class EstabelecimentoRequest implements Serializable {
    @JsonProperty("municipio")
    private String mMunicipio;
    @JsonProperty("uf")
    private String mUf;
    @JsonProperty("nomeFantasia")
    private String mNomeFantasia;
    @JsonProperty("categoria")
    private String mCategoria;
    @JsonProperty("especialidade")
    private String mEspecialidade;
    @JsonProperty("vinculoSus")
    private Integer mVinculoSus;
    @JsonProperty("retencao")
    private Integer mRetencao;
    @JsonProperty("campos")
    private Integer mCampos;
    @JsonProperty("pagina")
    private Integer mPagina;
    @JsonProperty("quantidade")
    private Integer mQuantidade;

    public String getMunicipio() {
        return mMunicipio;
    }

    public void setMunicipio(String municipio) {
        mMunicipio = municipio;
    }

    public String getUf() {
        return mUf;
    }

    public void setUf(String uf) {
        mUf = uf;
    }

    public String getNomeFantasia() {
        return mNomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        mNomeFantasia = nomeFantasia;
    }

    public String getCategoria() {
        return mCategoria;
    }

    public void setCategoria(String categoria) {
        mCategoria = categoria;
    }

    public String getEspecialidade() {
        return mEspecialidade;
    }

    public void setEspecialidade(String especialidade) {
        mEspecialidade = especialidade;
    }

    public Integer getVinculoSus() {
        return mVinculoSus;
    }

    public void setVinculoSus(Integer vinculoSus) {
        mVinculoSus = vinculoSus;
    }

    public Integer getRetencao() {
        return mRetencao;
    }

    public void setRetencao(Integer retencao) {
        mRetencao = retencao;
    }

    public Integer getCampos() {
        return mCampos;
    }

    public void setCampos(Integer campos) {
        mCampos = campos;
    }

    public Integer getPagina() {
        return mPagina;
    }

    public void setPagina(Integer pagina) {
        mPagina = pagina;
    }

    public Integer getQuantidade() {
        return mQuantidade;
    }

    public void setQuantidade(Integer quantidade) {
        mQuantidade = quantidade;
    }
}
