package br.com.edwi.jpa.relacionamentos.converter;

import br.com.edwi.jpa.relacionamentos.enums.CodigoMoedaEnum;
import javax.persistence.AttributeConverter;

public class CodigoMoedaConverter implements AttributeConverter<CodigoMoedaEnum, Short> {
    @Override
    public Short convertToDatabaseColumn(CodigoMoedaEnum codigoMoedaEnum) {
        return codigoMoedaEnum.getCodigo();
    }

    @Override
    public CodigoMoedaEnum convertToEntityAttribute(Short codigo) {
        return CodigoMoedaEnum.codigoMoeda(codigo);
    }
}