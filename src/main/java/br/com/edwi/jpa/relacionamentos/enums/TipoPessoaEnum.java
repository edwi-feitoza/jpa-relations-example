package br.com.edwi.jpa.relacionamentos.enums;

public enum TipoPessoaEnum {
    F("Pessoa Física"),
    J("Pessoa Jurídica");

    private String descricao;

    TipoPessoaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}