package br.com.edwi.jpa.relacionamentos.entities;

import br.com.edwi.jpa.relacionamentos.converter.TipoContratoConverter;
import br.com.edwi.jpa.relacionamentos.converter.TipoEnteConsignanteConverter;
import br.com.edwi.jpa.relacionamentos.enums.TipoContratoEnum;
import br.com.edwi.jpa.relacionamentos.enums.TipoEnteConsignanteEnum;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "identificador_contrato")
@IdClass(SolicitacaoKey.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class IdentificadorContratoEntity {

    @Id
    private Integer id;

    @Id
    @Column(name = "numero_portabilidade", columnDefinition = "DECIMAL(21)")
    private BigDecimal numeroPortabilidade;

    @Id
    @Column(name = "data_insercao")
    private LocalDateTime dataInsercao;

    @NotNull(message = "Codigo Contrato Original não pode ser nulo")
    @Size(min = 40, max = 40, message = "Codigo Contrato Original deve ter exatamente 40 caractéres.")
    @Column(name = "codigo_contrato_original", columnDefinition = "CHAR(40)")
    private String codigoContratoOriginal;

    @NotNull(message = "CNPJ Base IF Credora não pode ser nulo")
    @Pattern(regexp = "^[0-9]{8}", message = "CNPJ Base IF Credora é um CNPJ Base, portanto deve ter 8 dígitos")
    @Column(name = "cnpj_base_if_credora_original")
    private Integer cnpjBaseIfCredoraOriginal;

    @NotNull(message = "Tipo Contrato não pode ser nulo")
    @Convert(converter = TipoContratoConverter.class)
    @Column(name = "tipo_contrato", columnDefinition = "CHAR(4)")
    private TipoContratoEnum tipoContrato;

    @NotNull(message = "Tipo Ente Consignante não pode ser nulo")
    @Convert(converter = TipoEnteConsignanteConverter.class)
    @Column(name = "tipo_ente_consignante")
    private TipoEnteConsignanteEnum tipoEnteConsignante;

    @Pattern(regexp = "^[0-9]{14}", message = "CNPJ Correspondente Bancário deve ter 14 dígitos")
    @NotNull(message = "CNPJ Correspondente Bancário não pode ser nulo")
    @Column(name = "cnpj_correspondente_bancario")
    private Long cnpjCorrespondenteBancario;

    @OneToOne(mappedBy = "identificadorContrato")
    @MapsId
    @ToString.Exclude
    @JsonManagedReference
    private SolicitacaoEntity solicitacao;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    @JoinColumn(name = "numero_portabilidade", referencedColumnName = "numero_portabilidade")
    @JoinColumn(name = "data_insercao", referencedColumnName = "data_insercao")
    @MapsId
    @ToString.Exclude
    @JsonBackReference
    private PropostaEntity proposta;
}