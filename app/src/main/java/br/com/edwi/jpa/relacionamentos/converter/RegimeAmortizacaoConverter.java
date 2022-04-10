package br.com.edwi.jpa.relacionamentos.converter;

import br.com.edwi.jpa.relacionamentos.enums.RegimeAmortizacaoEnum;
import javax.persistence.AttributeConverter;

public class RegimeAmortizacaoConverter implements AttributeConverter<RegimeAmortizacaoEnum, Short> {
    @Override
    public Short convertToDatabaseColumn(RegimeAmortizacaoEnum regimeAmortizacaoEnum) {
        return regimeAmortizacaoEnum.getCodigo();
    }

    @Override
    public RegimeAmortizacaoEnum convertToEntityAttribute(Short codigo) {
        return RegimeAmortizacaoEnum.regimeAmortizacao(codigo);
    }
}