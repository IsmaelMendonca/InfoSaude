package com.example.ismael.infosaude.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by Ismael on 24/03/2017.
 */

public class RemedioRequest implements Serializable {
    @JsonProperty("produto")
    private String mProduto;
    @JsonProperty("codBarraEan")
    private String mCodBarraEan;
    @JsonProperty("apresentacao")
    private String mApresentacao;
    @JsonProperty("principioAtivo")
    private String mPrincipioAtivo;
    @JsonProperty("campos")
    private String mCampos;
    @JsonProperty("pagina")
    private Integer mPagina;
    @JsonProperty("quantidade")
    private Integer mQuantidade;

    public String getProduto() {
        return mProduto;
    }

    public void setProduto(String produto) {
        mProduto = produto;
    }

    public String getCodBarraEan() {
        return mCodBarraEan;
    }

    public void setCodBarraEan(String codBarraEan) {
        mCodBarraEan = codBarraEan;
    }

    public String getApresentacao() {
        return mApresentacao;
    }

    public void setApresentacao(String apresentacao) {
        mApresentacao = apresentacao;
    }

    public String getPrincipioAtivo() {
        return mPrincipioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        mPrincipioAtivo = principioAtivo;
    }

    public String getCampos() {
        return mCampos;
    }

    public void setCampos(String campos) {
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
