package br.com.edwi.jpa.relacionamentos.enums;

import br.com.edwi.jpa.relacionamentos.exceptions.CodigoMoedaInvalidoException;

public enum  CodigoMoedaEnum {

    DOLAR_AMERICANO_COMERCIAL(Short.valueOf("2"), "Dolar Americano Comercial (Venda)"),
    DOLAR_AMERICANO_TURISMO(Short.valueOf("3"), "Dolar Americano Turismo"),
    REAL(Short.valueOf("9"), "Real"),
    EURO(Short.valueOf("14"), "EURO"),
    CRUZEIRO_REAL(Short.valueOf("15"), "Cruzeiro Real");

    private Short codigo;
    private String descricao;

    CodigoMoedaEnum(Short codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Short getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CodigoMoedaEnum codigoMoeda(Short codigo) {
        switch (codigo) {
            case 2: return CodigoMoedaEnum.DOLAR_AMERICANO_COMERCIAL;
            case 3: return CodigoMoedaEnum.DOLAR_AMERICANO_TURISMO;
            case 9: return CodigoMoedaEnum.REAL;
            case 14: return CodigoMoedaEnum.EURO;
            case 15: return CodigoMoedaEnum.CRUZEIRO_REAL;
            default: throw new CodigoMoedaInvalidoException("Nenhum Codigo Moeda encontrado com o código [" + codigo + "].");
        }
    }
}