package br.com.edwi.jpa.relacionamentos.dtos;

import br.com.edwi.jpa.relacionamentos.enums.UfEnum;
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
public class EnderecoCartaDto {

    private Integer id;
    private BigDecimal numeroPortabilidade;
    private LocalDateTime dataInsercao;
    private String logradouro;
    private String complemento;
    private String numero;
    private String cidade;
    private UfEnum uf;
    private String cep;
}