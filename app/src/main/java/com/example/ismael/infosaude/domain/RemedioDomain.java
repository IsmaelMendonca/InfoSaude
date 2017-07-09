package com.example.ismael.infosaude.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by allanalves on 28/06/17.
 */

public class RemedioDomain implements Serializable {

    @JsonProperty("codBarraEan")
    private String mCodBarraEan;
    @JsonProperty("principioAtivo")
    private String mPrincipioAtivo;
    @JsonProperty("cnpj")
    private String mCnpj;
    @JsonProperty("laboratorio")
    private String mLaboratorio;
    @JsonProperty("codGgrem")
    private String mCodGgrem;
    @JsonProperty("registro")
    private String mRegistro;
    @JsonProperty("produto")
    private String mProduto;
    @JsonProperty("apresentacao")
    private String mApresentacao;
    @JsonProperty("classeTerapeutica")
    private String mClasseTerapeutica;
    @JsonProperty("precoLiberado")
    private String mPrecoLiberado;
    @JsonProperty("pf0")
    private double mPf0;
    @JsonProperty("pf12")
    private double mPf12;
    @JsonProperty("pf17")
    private double mPf17;
    @JsonProperty("pf17Alc")
    private double mPf17Alc;
    @JsonProperty("pf175")
    private double mPf175;
    @JsonProperty("pf175Alc")
    private double mPf175Alc;
    @JsonProperty("pf18")
    private double mPf18;
    @JsonProperty("pf18Alc")
    private double mPf18Alc;
    @JsonProperty("pf20")
    private double mPf20;
    @JsonProperty("pmc0")
    private double mPmc0;
    @JsonProperty("pmc12")
    private double mPmc12;
    @JsonProperty("pmc17")
    private double mPmc17;
    @JsonProperty("pmc17Alc")
    private double mPmc17Alc;
    @JsonProperty("pmc175")
    private double mPmc175;
    @JsonProperty("pmc175Alc")
    private double mPmc175Alc;
    @JsonProperty("pmc18")
    private double mPmc18;
    @JsonProperty("pmc18Alc")
    private double mPmc18Alc;
    @JsonProperty("pmc20")
    private double mPmc20;
    @JsonProperty("restricao")
    private String mRestricao;
    @JsonProperty("cap")
    private String mCap;
    @JsonProperty("confaz87")
    private String mConfaz87;
    @JsonProperty("cod")
    private long mCod;
    @JsonProperty("ultimaAlteracao")
    private String mUltimaAlteracao;

    public String getCodBarraEan() {
        return mCodBarraEan;
    }

    public void setCodBarraEan(String codBarraEan) {
        mCodBarraEan = codBarraEan;
    }

    public String getPrincipioAtivo() {
        return mPrincipioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        mPrincipioAtivo = principioAtivo;
    }

    public String getCnpj() {
        return mCnpj;
    }

    public void setCnpj(String cnpj) {
        mCnpj = cnpj;
    }

    public String getLaboratorio() {
        return mLaboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        mLaboratorio = laboratorio;
    }

    public String getCodGgrem() {
        return mCodGgrem;
    }

    public void setCodGgrem(String codGgrem) {
        mCodGgrem = codGgrem;
    }

    public String getRegistro() {
        return mRegistro;
    }

    public void setRegistro(String registro) {
        mRegistro = registro;
    }

    public String getProduto() {
        return mProduto;
    }

    public void setProduto(String produto) {
        mProduto = produto;
    }

    public String getApresentacao() {
        return mApresentacao;
    }

    public void setApresentacao(String apresentacao) {
        mApresentacao = apresentacao;
    }

    public String getClasseTerapeutica() {
        return mClasseTerapeutica;
    }

    public void setClasseTerapeutica(String classeTerapeutica) {
        mClasseTerapeutica = classeTerapeutica;
    }

    public String getPrecoLiberado() {
        return mPrecoLiberado;
    }

    public void setPrecoLiberado(String precoLiberado) {
        mPrecoLiberado = precoLiberado;
    }

    public double getPf0() {
        return mPf0;
    }

    public void setPf0(double pf0) {
        mPf0 = pf0;
    }

    public double getPf12() {
        return mPf12;
    }

    public void setPf12(double pf12) {
        mPf12 = pf12;
    }

    public double getPf17() {
        return mPf17;
    }

    public void setPf17(double pf17) {
        mPf17 = pf17;
    }

    public double getPf17Alc() {
        return mPf17Alc;
    }

    public void setPf17Alc(double pf17Alc) {
        mPf17Alc = pf17Alc;
    }

    public double getPf175() {
        return mPf175;
    }

    public void setPf175(double pf175) {
        mPf175 = pf175;
    }

    public double getPf175Alc() {
        return mPf175Alc;
    }

    public void setPf175Alc(double pf175Alc) {
        mPf175Alc = pf175Alc;
    }

    public double getPf18() {
        return mPf18;
    }

    public void setPf18(double pf18) {
        mPf18 = pf18;
    }

    public double getPf18Alc() {
        return mPf18Alc;
    }

    public void setPf18Alc(double pf18Alc) {
        mPf18Alc = pf18Alc;
    }

    public double getPf20() {
        return mPf20;
    }

    public void setPf20(double pf20) {
        mPf20 = pf20;
    }

    public double getPmc0() {
        return mPmc0;
    }

    public void setPmc0(double pmc0) {
        mPmc0 = pmc0;
    }

    public double getPmc12() {
        return mPmc12;
    }

    public void setPmc12(double pmc12) {
        mPmc12 = pmc12;
    }

    public double getPmc17() {
        return mPmc17;
    }

    public void setPmc17(double pmc17) {
        mPmc17 = pmc17;
    }

    public double getPmc17Alc() {
        return mPmc17Alc;
    }

    public void setPmc17Alc(double pmc17Alc) {
        mPmc17Alc = pmc17Alc;
    }

    public double getPmc175() {
        return mPmc175;
    }

    public void setPmc175(double pmc175) {
        mPmc175 = pmc175;
    }

    public double getPmc175Alc() {
        return mPmc175Alc;
    }

    public void setPmc175Alc(double pmc175Alc) {
        mPmc175Alc = pmc175Alc;
    }

    public double getPmc18() {
        return mPmc18;
    }

    public void setPmc18(double pmc18) {
        mPmc18 = pmc18;
    }

    public double getPmc18Alc() {
        return mPmc18Alc;
    }

    public void setPmc18Alc(double pmc18Alc) {
        mPmc18Alc = pmc18Alc;
    }

    public double getPmc20() {
        return mPmc20;
    }

    public void setPmc20(double pmc20) {
        mPmc20 = pmc20;
    }

    public String getRestricao() {
        return mRestricao;
    }

    public void setRestricao(String restricao) {
        mRestricao = restricao;
    }

    public String getCap() {
        return mCap;
    }

    public void setCap(String cap) {
        mCap = cap;
    }

    public String getConfaz87() {
        return mConfaz87;
    }

    public void setConfaz87(String confaz87) {
        mConfaz87 = confaz87;
    }

    public long getCod() {
        return mCod;
    }

    public void setCod(long cod) {
        mCod = cod;
    }

    public String getUltimaAlteracao() {
        return mUltimaAlteracao;
    }

    public void setUltimaAlteracao(String ultimaAlteracao) {
        mUltimaAlteracao = ultimaAlteracao;
    }
}
