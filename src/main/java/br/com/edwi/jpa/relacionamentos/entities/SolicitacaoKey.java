package br.com.edwi.jpa.relacionamentos.entities;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class SolicitacaoKey implements Serializable {

    private static final long serialVersionUID = -1910587627779863475L;

    private Integer id;
    private BigDecimal numeroPortabilidade;
    private LocalDateTime dataInsercao;
}
