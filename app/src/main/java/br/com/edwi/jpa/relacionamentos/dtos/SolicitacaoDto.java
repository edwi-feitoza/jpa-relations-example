package br.com.edwi.jpa.relacionamentos.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SolicitacaoDto {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("numero_portabilidade")
    private BigDecimal numeroPortabilidade;

    @JsonProperty("data_insercao")
    private LocalDateTime dataInsercao;

    @JsonProperty("identificador_participante_administrado")
    private Integer identificadorParticipanteAdministrado;

    @JsonProperty("identificador_if_proponente")
    private Integer identificadorIfProponente;

    @JsonProperty("cliente")
    @ToString.Exclude
    private ClienteDto cliente;

    @JsonProperty("identificador_contrato")
    @ToString.Exclude
    private IdentificadorContratoDto identificadorContrato;
}
