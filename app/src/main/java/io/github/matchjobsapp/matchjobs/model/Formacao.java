package io.github.matchjobsapp.matchjobs.model;

import java.util.Date;

class Formacao extends AbstractModel<Long>{

    private TipoFormacao tipoFormacao;
    private String formacao;
    private Date dataInicio;
    private Date dataConclusao;

    public TipoFormacao getTipoFormacao() {
        return tipoFormacao;
    }

    public void setTipoFormacao(TipoFormacao tipoFormacao) {
        this.tipoFormacao = tipoFormacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    @Override
    public String toString() {
        return "Formacao{" +
                "tipoFormacao=" + tipoFormacao +
                ", formacao='" + formacao + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataConclusao=" + dataConclusao +
                '}';
    }
}
