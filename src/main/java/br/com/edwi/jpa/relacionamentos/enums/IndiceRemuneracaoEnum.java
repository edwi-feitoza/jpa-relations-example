package br.com.edwi.jpa.relacionamentos.enums;

import br.com.edwi.jpa.relacionamentos.exceptions.IndiceRemuneracaoException;

public enum  IndiceRemuneracaoEnum {

    ITDR(Short.valueOf("1"), "ITRD"),
    IDTR(Short.valueOf("2"), "IDTR"),
    UFIR_DIARIA(Short.valueOf("3"), "UFIR Diaria"),
    UFIRM_MENSAL(Short.valueOf("4"), "UFIRM Mensal"),
    FAJ_TR(Short.valueOf("5"), "FAJ-TR"),
    TR(Short.valueOf("6"), "TR"),
    IGPM(Short.valueOf("7"), "IGPM"),
    CDI(Short.valueOf("8"), "CDI"),
    PERCENTUAL_CDI(Short.valueOf("9"), "Percentual do CDI"),
    OUTROS(Short.valueOf("99"), "Outros");

    private Short codigo;
    private String descricao;


    IndiceRemuneracaoEnum(Short codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Short getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndiceRemuneracaoEnum indiceRemuneracao(Short codigo) {
        switch (codigo) {
            case 1: return IndiceRemuneracaoEnum.ITDR;
            case 2: return IndiceRemuneracaoEnum.IDTR;
            case 3: return IndiceRemuneracaoEnum.UFIR_DIARIA;
            case 4: return IndiceRemuneracaoEnum.UFIRM_MENSAL;
            case 5: return IndiceRemuneracaoEnum.FAJ_TR;
            case 6: return IndiceRemuneracaoEnum.TR;
            case 7: return IndiceRemuneracaoEnum.IGPM;
            case 8: return IndiceRemuneracaoEnum.CDI;
            case 9: return IndiceRemuneracaoEnum.PERCENTUAL_CDI;
            case 99: return IndiceRemuneracaoEnum.OUTROS;
            default: throw new IndiceRemuneracaoException("Nenhum Indice Remuneracao encontrado com o código [" + codigo + "].");
        }
    }
}