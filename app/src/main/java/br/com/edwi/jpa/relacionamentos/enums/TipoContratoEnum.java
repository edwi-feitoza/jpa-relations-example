package br.com.edwi.jpa.relacionamentos.enums;

import br.com.edwi.jpa.relacionamentos.exceptions.TipoContratoInvalidoException;

public enum TipoContratoEnum {

    CREDITO_CONSIGNADO("0202", "Crédito Consignado"),
    CREDITO_PESSOAL("0203", "Crédito Pessoal sem consignação em folha de pagamento"),
    IMOBILIARIO_0211("0211", "Imobiliário"),
    IMOBILIARIO_0299("0299", "Imobiliário"),
    VEICULO("0401", "Veículo"),
    IMOBILIARIO_SFH("0901", "Imobiliário – Financiamento Habitacional – SFH"),
    IMOBILIARIO_HIPOTECARIA("0902", "Imobiliário – Financiamento Habitacional – Carteira Hipotecária"),
    IMOBILIARIO_0903("0903", "Imobiliário" );

    private String codigo;
    private String descricao;

    TipoContratoEnum(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoContratoEnum tipoContrato(String codigo) {
        switch (codigo) {
            case "0202": return TipoContratoEnum.CREDITO_CONSIGNADO;
            case "0203": return TipoContratoEnum.CREDITO_PESSOAL;
            case "0211": return TipoContratoEnum.IMOBILIARIO_0211;
            case "0299": return TipoContratoEnum.IMOBILIARIO_0299;
            case "0401": return TipoContratoEnum.VEICULO;
            case "0901": return TipoContratoEnum.IMOBILIARIO_SFH;
            case "0902": return TipoContratoEnum.IMOBILIARIO_HIPOTECARIA;
            case "0903": return TipoContratoEnum.IMOBILIARIO_0903;
            default: throw new TipoContratoInvalidoException("Nenhum Tipo de Contrato encontrado com o código [" + codigo + "].");
        }
    }
}