package io.github.matchjobsapp.matchjobs.model;

import java.util.List;

/**
 * @Author: Bruna L. Guanabara
 * brunal.guanabara@gmail.com
 * Project: MatchJobs
 * Date: 22/10/2018
 */
public class Vaga extends AbstractModel<Long>{
    private NivelHierarquico nivelHierarquico;
    private String cargo;
    private String descricao;
    private Float salario;

    public NivelHierarquico getNivelHierarquico() {
        return nivelHierarquico;
    }

    public void setNivelHierarquico(NivelHierarquico nivelHierarquico) {
        this.nivelHierarquico = nivelHierarquico;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Vaga{" +
                "nivelHierarquico=" + nivelHierarquico +
                ", cargo='" + cargo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", salario=" + salario +
                '}';
    }
}
