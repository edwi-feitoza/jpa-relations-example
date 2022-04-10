package br.com.edwi.jpa.relacionamentos.enums;

import br.com.edwi.jpa.relacionamentos.exceptions.TipoEnteConsignanteException;

public enum TipoEnteConsignanteEnum {

    INSS(Short.valueOf("1"), "Consignado (INSS)"),
    EMPRESA_PRIVADA(Short.valueOf("2"), "Consignado (Empresa Privada)"),
    ORGAO_PUBLICO(Short.valueOf("3"), "Consignado (Órgão Público)");

    private Short codigo;
    private String descricao;

    TipoEnteConsignanteEnum(Short codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Short getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoEnteConsignanteEnum tipoEnteConsignante(Short codigo) {
        switch (codigo) {
            case 1 : return TipoEnteConsignanteEnum.INSS;
            case 2 : return TipoEnteConsignanteEnum.EMPRESA_PRIVADA;
            case 3 : return TipoEnteConsignanteEnum.ORGAO_PUBLICO;
            default: throw  new TipoEnteConsignanteException("Nenhum Tipo de Ente Consignante encontrado com o código [" + codigo + "].");
        }
    }
}