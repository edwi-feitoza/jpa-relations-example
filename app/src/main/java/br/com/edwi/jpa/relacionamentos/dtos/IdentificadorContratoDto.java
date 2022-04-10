package br.com.edwi.jpa.relacionamentos.dtos;

import br.com.edwi.jpa.relacionamentos.enums.TipoContratoEnum;
import br.com.edwi.jpa.relacionamentos.enums.TipoEnteConsignanteEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IdentificadorContratoDto {
    private Integer id;
    private BigDecimal numeroPortabilidade;
    private LocalDateTime dataInsercao;
    private String codigoContratoOriginal;
    private Integer cnpjBaseIfCredoraOriginal;
    private TipoContratoEnum tipoContrato;
    private TipoEnteConsignanteEnum tipoEnteConsignante;
    private Long cnpjCorrespondenteBancario;
    private PropostaDto proposta;
}