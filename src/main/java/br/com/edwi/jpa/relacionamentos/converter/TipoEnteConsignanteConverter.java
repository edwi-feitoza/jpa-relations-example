package br.com.edwi.jpa.relacionamentos.converter;

import br.com.edwi.jpa.relacionamentos.enums.TipoEnteConsignanteEnum;

import javax.persistence.AttributeConverter;

public class TipoEnteConsignanteConverter implements AttributeConverter<TipoEnteConsignanteEnum, Short> {
    @Override
    public Short convertToDatabaseColumn(TipoEnteConsignanteEnum tipoEnteConsignanteEnum) {
        return tipoEnteConsignanteEnum.getCodigo();
    }

    @Override
    public TipoEnteConsignanteEnum convertToEntityAttribute(Short codigo) {
        return TipoEnteConsignanteEnum.tipoEnteConsignante(codigo);
    }
}