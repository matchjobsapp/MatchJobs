package io.github.matchjobsapp.matchjobs.model;

import java.util.Date;
/**
 * ╭────────────────────────────────────────────────────╮
 * │                                                    │
 * │   @author: Ivam H. M. Santos                       │
 * │   https://www.linkedin.com/in/ivamsantos           |
 * |   ivamks@gmail.com                                 |
 * |   Project: MatchJobs                               |
 * |   Create at 21/10/18                               │
 * │                                                    │
 * ╰────────────────────────────────────────────────────╯
 */
public class Formacao extends AbstractModel<Long>{

    private TipoFormacao tipoFormacao;
    private String formacao;
    private Date dataInicio;
    private Date dataConclusao;
    private String instituicao;

    @Override
    public String toString() {
        return "Formacao{" +
                "tipoFormacao=" + tipoFormacao +
                ", formacao='" + formacao + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataConclusao=" + dataConclusao +
                ", instituicao='" + instituicao + '\'' +
                '}';
    }

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

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
}
