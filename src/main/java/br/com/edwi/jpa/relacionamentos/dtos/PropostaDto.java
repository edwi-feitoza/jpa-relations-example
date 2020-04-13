package br.com.edwi.jpa.relacionamentos.dtos;

import br.com.edwi.jpa.relacionamentos.enums.CodigoMoedaEnum;
import br.com.edwi.jpa.relacionamentos.enums.IndiceRemuneracaoEnum;
import br.com.edwi.jpa.relacionamentos.enums.RegimeAmortizacaoEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PropostaDto {

    private Integer id;
    private BigDecimal numeroPortabilidade;
    private LocalDateTime dataInsercao;
    private LocalDate dataReferenciaSaldoDevedorContabil;
    private BigDecimal valorSaldoDevedorContabil;
    private BigDecimal taxaJurosNominal;
    private BigDecimal taxaJurosEfetivo;
    private BigDecimal taxaCet;
    private CodigoMoedaEnum codigoMoeda;
    private IndiceRemuneracaoEnum indiceRemuneracao;
    private RegimeAmortizacaoEnum regimeAmortizacao;
    private LocalDate dataContratacao;
    private Integer quantidadeTotalParcelas;
    private BigDecimal valorFaceParcelas;
    private LocalDate dataVencimentoPrimeiraParcela;
    private LocalDate dataVencimentoUltimaParcela;
}
