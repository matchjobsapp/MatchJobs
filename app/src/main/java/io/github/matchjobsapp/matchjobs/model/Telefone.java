package io.github.matchjobsapp.matchjobs.model;

class Telefone extends AbstractModel<Long>{

    private Integer numero;
    private Integer ddd;
    private TipoTelefone descricao;
    private Boolean whatsapp;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public TipoTelefone getDescricao() {
        return descricao;
    }

    public void setDescricao(TipoTelefone descricao) {
        this.descricao = descricao;
    }

    public Boolean getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(Boolean whatsapp) {
        this.whatsapp = whatsapp;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "numero=" + numero +
                ", ddd=" + ddd +
                ", descricao=" + descricao +
                ", whatsapp=" + whatsapp +
                '}';
    }
}
