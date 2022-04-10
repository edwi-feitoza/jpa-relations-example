package br.com.edwi.jpa.relacionamentos.dtos;

import br.com.edwi.jpa.relacionamentos.entities.EnderecoCartaEntity;
import br.com.edwi.jpa.relacionamentos.enums.TipoPessoaEnum;
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
public class ClienteDto {

    private Integer id;
    private BigDecimal numeroPortabilidade;
    private LocalDateTime dataInsercao;
    private TipoPessoaEnum tipoCliente;
    private String cnpjCpf;
    private String nome;
    private String telefone;
    private String email;
    private EnderecoCartaDto enderecoCarta;
}
