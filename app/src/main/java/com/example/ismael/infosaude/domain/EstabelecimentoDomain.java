package com.example.ismael.infosaude.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by Ismael on 09/07/2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class EstabelecimentoDomain implements Serializable {

    /**
     * codCnes : 3402126
     * codUnidade : 2211003402126
     * codIbge : 221100
     * cnpj : 03809885000162
     * nomeFantasia : CLINICA DERMATOLOGICA DR JOSE GOMES SILVA
     * natureza : Empresa
     * tipoUnidade : CLINICA ESPECIALIZADA
     * esferaAdministrativa : Privada
     * vinculoSus : Não
     * retencao : Unidade Privada Lucrativa***
     * fluxoClientela : Atendimento de demanda espontânea
     * origemGeografica : CNES_GEO
     * temAtendimentoUrgencia : Não
     * temAtendimentoAmbulatorial : Sim
     * temCentroCirurgico : Não
     * temObstetra : Não
     * temNeoNatal : Não
     * temDialise : Sim
     * descricaoCompleta : CLINICA DERMATOLOGICA DR JOSE GOMES DA SILVA  EMPRESA PRIVADA     MEDICO DERMATOLOGISTA
     * tipoUnidadeCnes : CLINICA ESPECIALIZADA/AMBULATORIO DE ESPECIALIDADE
     * categoriaUnidade : CLÍNICA
     * logradouro : RUA FELIX PACHECO
     * numero : 1716
     * bairro : CENTRO
     * cidade : TERESINA
     * uf : PI
     * cep : 64001160
     * telefone : (86)2214464
     * turnoAtendimento : Atendimento nos turnos da manhã e à tarde.
     * lat : -5.09163
     * long : -42.80948
     */

    @JsonProperty("codCnes")
    private int codCnes;
    @JsonProperty("codUnidade")
    private String codUnidade;
    @JsonProperty("codIbge")
    private int codIbge;
    @JsonProperty("cnpj")
    private String cnpj;
    @JsonProperty("nomeFantasia")
    private String nomeFantasia;
    @JsonProperty("natureza")
    private String natureza;
    @JsonProperty("tipoUnidade")
    private String tipoUnidade;
    @JsonProperty("esferaAdministrativa")
    private String esferaAdministrativa;
    @JsonProperty("vinculoSus")
    private String vinculoSus;
    @JsonProperty("retencao")
    private String retencao;
    @JsonProperty("fluxoClientela")
    private String fluxoClientela;
    @JsonProperty("origemGeografica")
    private String origemGeografica;
    @JsonProperty("temAtendimentoUrgencia")
    private String temAtendimentoUrgencia;
    @JsonProperty("temAtendimentoAmbulatorial")
    private String temAtendimentoAmbulatorial;
    @JsonProperty("temCentroCirurgico")
    private String temCentroCirurgico;
    @JsonProperty("temObstetra")
    private String temObstetra;
    @JsonProperty("temNeoNatal")
    private String temNeoNatal;
    @JsonProperty("temDialise")
    private String temDialise;
    @JsonProperty("descricaoCompleta")
    private String descricaoCompleta;
    @JsonProperty("tipoUnidadeCnes")
    private String tipoUnidadeCnes;
    @JsonProperty("categoriaUnidade")
    private String categoriaUnidade;
    @JsonProperty("logradouro")
    private String logradouro;
    @JsonProperty("numero")
    private String numero;
    @JsonProperty("bairro")
    private String bairro;
    @JsonProperty("cidade")
    private String cidade;
    @JsonProperty("uf")
    private String uf;
    @JsonProperty("cep")
    private String cep;
    @JsonProperty("telefone")
    private String telefone;
    @JsonProperty("turnoAtendimento")
    private String turnoAtendimento;
    @JsonProperty("lat")
    private double lat;
    @JsonProperty("long")
    private double longX;

    public int getCodCnes() {
        return codCnes;
    }

    public void setCodCnes(int codCnes) {
        this.codCnes = codCnes;
    }

    public String getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(String codUnidade) {
        this.codUnidade = codUnidade;
    }

    public int getCodIbge() {
        return codIbge;
    }

    public void setCodIbge(int codIbge) {
        this.codIbge = codIbge;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getNatureza() {
        return natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }

    public String getTipoUnidade() {
        return tipoUnidade;
    }

    public void setTipoUnidade(String tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }

    public String getEsferaAdministrativa() {
        return esferaAdministrativa;
    }

    public void setEsferaAdministrativa(String esferaAdministrativa) {
        this.esferaAdministrativa = esferaAdministrativa;
    }

    public String getVinculoSus() {
        return vinculoSus;
    }

    public void setVinculoSus(String vinculoSus) {
        this.vinculoSus = vinculoSus;
    }

    public String getRetencao() {
        return retencao;
    }

    public void setRetencao(String retencao) {
        this.retencao = retencao;
    }

    public String getFluxoClientela() {
        return fluxoClientela;
    }

    public void setFluxoClientela(String fluxoClientela) {
        this.fluxoClientela = fluxoClientela;
    }

    public String getOrigemGeografica() {
        return origemGeografica;
    }

    public void setOrigemGeografica(String origemGeografica) {
        this.origemGeografica = origemGeografica;
    }

    public String getTemAtendimentoUrgencia() {
        return temAtendimentoUrgencia;
    }

    public void setTemAtendimentoUrgencia(String temAtendimentoUrgencia) {
        this.temAtendimentoUrgencia = temAtendimentoUrgencia;
    }

    public String getTemAtendimentoAmbulatorial() {
        return temAtendimentoAmbulatorial;
    }

    public void setTemAtendimentoAmbulatorial(String temAtendimentoAmbulatorial) {
        this.temAtendimentoAmbulatorial = temAtendimentoAmbulatorial;
    }

    public String getTemCentroCirurgico() {
        return temCentroCirurgico;
    }

    public void setTemCentroCirurgico(String temCentroCirurgico) {
        this.temCentroCirurgico = temCentroCirurgico;
    }

    public String getTemObstetra() {
        return temObstetra;
    }

    public void setTemObstetra(String temObstetra) {
        this.temObstetra = temObstetra;
    }

    public String getTemNeoNatal() {
        return temNeoNatal;
    }

    public void setTemNeoNatal(String temNeoNatal) {
        this.temNeoNatal = temNeoNatal;
    }

    public String getTemDialise() {
        return temDialise;
    }

    public void setTemDialise(String temDialise) {
        this.temDialise = temDialise;
    }

    public String getDescricaoCompleta() {
        return descricaoCompleta;
    }

    public void setDescricaoCompleta(String descricaoCompleta) {
        this.descricaoCompleta = descricaoCompleta;
    }

    public String getTipoUnidadeCnes() {
        return tipoUnidadeCnes;
    }

    public void setTipoUnidadeCnes(String tipoUnidadeCnes) {
        this.tipoUnidadeCnes = tipoUnidadeCnes;
    }

    public String getCategoriaUnidade() {
        return categoriaUnidade;
    }

    public void setCategoriaUnidade(String categoriaUnidade) {
        this.categoriaUnidade = categoriaUnidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTurnoAtendimento() {
        return turnoAtendimento;
    }

    public void setTurnoAtendimento(String turnoAtendimento) {
        this.turnoAtendimento = turnoAtendimento;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLongX() {
        return longX;
    }

    public void setLongX(double longX) {
        this.longX = longX;
    }
}
