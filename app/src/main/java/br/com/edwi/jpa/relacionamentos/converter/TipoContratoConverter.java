package br.com.edwi.jpa.relacionamentos.converter;

import br.com.edwi.jpa.relacionamentos.enums.TipoContratoEnum;
import javax.persistence.AttributeConverter;

public class TipoContratoConverter implements AttributeConverter<TipoContratoEnum, String> {
    @Override
    public String convertToDatabaseColumn(TipoContratoEnum tipoContratoEnum) {
        return tipoContratoEnum.getCodigo();
    }

    @Override
    public TipoContratoEnum convertToEntityAttribute(String tipoContrato) {
        return TipoContratoEnum.tipoContrato(tipoContrato);
    }
}
