package br.com.edwi.jpa.relacionamentos.entities;

import br.com.edwi.jpa.relacionamentos.converter.CodigoMoedaConverter;
import br.com.edwi.jpa.relacionamentos.converter.IndiceRemuneracaoConverter;
import br.com.edwi.jpa.relacionamentos.converter.RegimeAmortizacaoConverter;
import br.com.edwi.jpa.relacionamentos.enums.CodigoMoedaEnum;
import br.com.edwi.jpa.relacionamentos.enums.IndiceRemuneracaoEnum;
import br.com.edwi.jpa.relacionamentos.enums.RegimeAmortizacaoEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "proposta")
@IdClass(SolicitacaoKey.class)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PropostaEntity {

    @Id
    private Integer id;

    @Id
    @Column(name = "numero_portabilidade")
    private BigDecimal numeroPortabilidade;

    @Id
    @Column(name = "data_insercao")
    private LocalDateTime dataInsercao;

    @NotNull(message = "DATA REFERENCIA SALDO DEVEDOR CONTABIL não pode ser nulo")
    @Column(name = "data_referencia_saldo_devedor_contabil")
    private LocalDate dataReferenciaSaldoDevedorContabil;

    @Digits(integer = 19, fraction = 2, message = "VALOR SALDO DEVEDOR CONTABIL deve ter no máximo 19 casas antes da vírgula e 2 casas depois")
    @NotNull(message = "VALOR SALDO DEVEDOR CONTABIL não pode ser nulo")
    @Column(name = "valor_saldo_devedor_contabil")
    private BigDecimal valorSaldoDevedorContabil;

    @Digits(integer = 3, fraction = 2, message = "TAXA JUROS NOMINAL deve ter no máximo 3 casas antes da vírgula e 2 casas depois")
    @NotNull(message = "TAXA JUROS NOMINAL não pode ser nulo")
    @Column(name = "taxa_juros_nominal")
    private BigDecimal taxaJurosNominal;

    @Digits(integer = 3, fraction = 2, message = "TAXA JUROS efetivo deve ter no máximo 3 casas antes da vírgula e 2 casas depois")
    @NotNull(message = "TAXA JUROS EFETIVO não pode ser nulo")
    @Column(name = "taxa_juros_efetivo")
    private BigDecimal taxaJurosEfetivo;

    @Digits(integer = 3, fraction = 2, message = "TAXA CET deve ter no máximo 3 casas antes da vírgula e 2 casas depois")
    @NotNull(message = "TAXA CET não pode ser nulo")
    @Column(name = "taxa_cet")
    private BigDecimal taxaCet;

    @NotNull(message = "CODIGO MOEDA não pode ser nulo")
    @Convert(converter = CodigoMoedaConverter.class)
    @Column(name = "codigo_moeda")
    private CodigoMoedaEnum codigoMoeda;

    @Convert(converter = IndiceRemuneracaoConverter.class)
    @Column(name = "indice_remuneracao")
    private IndiceRemuneracaoEnum indiceRemuneracao;

    @Convert(converter = RegimeAmortizacaoConverter.class)
    @Column(name = "regime_amortizacao")
    private RegimeAmortizacaoEnum regimeAmortizacao;

    @NotNull(message = "DATA CONTRATACAO não pode ser nulo")
    @Column(name = "data_contratacao")
    private LocalDate dataContratacao;

    @NotNull(message = "QUANTIDADE TOTAL DE PARCELAS não pode ser nulo")
    @Max(value = 999999999, message = "QUANTIDADE TOTAL DE PARCELAS dever no máximo 9 dígitos")
    @Column(name = "quantidade_total_parcelas")
    private Integer quantidadeTotalParcelas;

    @Digits(integer = 19, fraction = 2, message = "VALOR FACE PARCELA deve ter no máximo 19 casas antes da vírgula e 2 casas depois")
    @NotNull(message = "VALOR FACE PARCELA não pode ser nulo")
    @Column(name = "valor_face_parcelas")
    private BigDecimal valorFaceParcelas;

    @NotNull(message = "DATA VENCIMENTO PRIMEIRA PARCELA não pode ser nulo")
    @Column(name = "data_vencimento_primeira_parcela")
    private LocalDate dataVencimentoPrimeiraParcela;

    @NotNull(message = "DATA VENCIMENTO ULTIMA PARCELA não pode ser nulo")
    @Column(name = "data_vencimento_ultima_parcela")
    private LocalDate dataVencimentoUltimaParcela;
}