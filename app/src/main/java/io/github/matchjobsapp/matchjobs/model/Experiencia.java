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
public class Experiencia extends AbstractModel<Long>{
    private Empresa empresa;
    private String cargo;
    private Date dataAdmissao;
    private Date dateDemissao;
    private Float salario;
    private String descricao;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Date getDateDemissao() {
        return dateDemissao;
    }

    public void setDateDemissao(Date dateDemissao) {
        this.dateDemissao = dateDemissao;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
