package br.com.edwi.jpa.relacionamentos.enums;

import br.com.edwi.jpa.relacionamentos.exceptions.RegimeAmortizacaoException;

public enum RegimeAmortizacaoEnum {

    PRICE(Short.valueOf("1"), "PRICE"),
    SAC(Short.valueOf("2"), "SAC"),
    SACRE(Short.valueOf("3"), "SACRE"),
    OUTROS(Short.valueOf("99"), "Outros");

    private Short codigo;
    private String descricao;

    RegimeAmortizacaoEnum(Short codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Short getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static RegimeAmortizacaoEnum regimeAmortizacao(Short codigo) {
        switch (codigo) {
            case 1: return RegimeAmortizacaoEnum.PRICE;
            case 2: return RegimeAmortizacaoEnum.SAC;
            case 3: return RegimeAmortizacaoEnum.SACRE;
            case 99: return RegimeAmortizacaoEnum.OUTROS;
            default: throw new RegimeAmortizacaoException("Nenhum Regime Amortizacao encontrado com o código [" + codigo + "].");
        }
    }
}