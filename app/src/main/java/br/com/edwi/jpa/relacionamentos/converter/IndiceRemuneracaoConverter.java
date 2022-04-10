package br.com.edwi.jpa.relacionamentos.converter;

import br.com.edwi.jpa.relacionamentos.enums.IndiceRemuneracaoEnum;
import javax.persistence.AttributeConverter;

public class IndiceRemuneracaoConverter implements AttributeConverter<IndiceRemuneracaoEnum, Short> {
    @Override
    public Short convertToDatabaseColumn(IndiceRemuneracaoEnum indiceRemuneracaoEnum) {
        return indiceRemuneracaoEnum.getCodigo();
    }

    @Override
    public IndiceRemuneracaoEnum convertToEntityAttribute(Short codigo) {
        return IndiceRemuneracaoEnum.indiceRemuneracao(codigo);
    }
}