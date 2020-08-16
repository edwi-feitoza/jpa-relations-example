package br.com.edwi.jpa.relacionamentos.entities.test;

import br.com.edwi.jpa.relacionamentos.entities.ClienteEntity;
import br.com.edwi.jpa.relacionamentos.entities.EnderecoCartaEntity;
import br.com.edwi.jpa.relacionamentos.entities.SolicitacaoEntity;
import br.com.edwi.jpa.relacionamentos.enums.UfEnum;
import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.filters.FilterPackageInfo;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.rule.impl.*;
import com.openpojo.validation.test.impl.GetterTester;
import com.openpojo.validation.test.impl.SerializableTester;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import static com.openpojo.validation.affirm.Affirm.affirmEquals;

public class EntitiesTest {

    private static final Integer EXPECTED_CLASS_COUNT = 7;
    private static final String ENTITIES_PACKAGE = "br.com.edwi.jpa.relacionamentos.entities";

    @Test
    public void deveRetornarSeteEntitiesParaTestar() {
        List<PojoClass> entities = PojoClassFactory.getPojoClasses(ENTITIES_PACKAGE, new FilterPackageInfo());
        PojoClass pojoClass = entities.get(0);
        affirmEquals("Classes foram adicionadas ou removidas?", EXPECTED_CLASS_COUNT, entities.size());
    }

    @Test
    public void deveValidarEstruturasEComportamentosDasEntities() {
        Validator validator = ValidatorBuilder.create()
                .with(new SerializableMustHaveSerialVersionUIDRule())
//                .with(new SerializableTester())
                .with(new GetterMustExistRule())
                .with(new GetterTester())
                .with(new NoPrimitivesRule())
                .with(new NoPublicFieldsRule())
                .with(new EqualsAndHashCodeMatchRule())
                .with(new NoStaticExceptFinalRule())
                .build();
        validator.validate(ENTITIES_PACKAGE, new FilterPackageInfo());
    }

    @Test
    public void deveTestarEquals() {
        EqualsVerifier.forClass(ClienteEntity.class)
                .withPrefabValues(SolicitacaoEntity.class, new SolicitacaoEntity(Integer.valueOf(1),
                                BigDecimal.TEN,
                                LocalDateTime.now(),
                                Integer.valueOf(1),
                                Integer.valueOf(1),
                                null,
                                null),
                        new SolicitacaoEntity(Integer.valueOf(2),
                                BigDecimal.TEN,
                                LocalDateTime.now(),
                                Integer.valueOf(1),
                                Integer.valueOf(1),
                                null,
                                null))
                .withPrefabValues(EnderecoCartaEntity.class, new EnderecoCartaEntity(Integer.valueOf(1),
                                BigDecimal.TEN,
                                LocalDateTime.now(),
                                "teste",
                                "teste",
                                "teste",
                                "teste",
                                UfEnum.SP,
                                "teste",
                                null),
                        new EnderecoCartaEntity(Integer.valueOf(1),
                                BigDecimal.TEN,
                                LocalDateTime.now(),
                                "teste",
                                "teste",
                                "teste",
                                "teste",
                                UfEnum.SP,
                                "teste",
                                null))
                .verify();
    }
}