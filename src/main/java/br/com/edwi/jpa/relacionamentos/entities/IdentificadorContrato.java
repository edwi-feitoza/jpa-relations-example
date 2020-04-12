package br.com.edwi.jpa.relacionamentos.entities;

import br.com.edwi.jpa.relacionamentos.converter.TipoContratoConverter;
import br.com.edwi.jpa.relacionamentos.converter.TipoEnteConsignanteConverter;
import br.com.edwi.jpa.relacionamentos.enums.TipoContratoEnum;
import br.com.edwi.jpa.relacionamentos.enums.TipoEnteConsignanteEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
@Data
public class IdentificadorContrato {

    @Id
    private Integer id;

    @Id
    @Column(name = "numero_portabilidade")
    private BigDecimal numeroPortabilidade;

    @Id
    @Column(name = "data_insercao")
    private LocalDateTime dataInsercao;

    @NotNull(message = "Codigo Contrato Original não pode ser nulo")
    @Size(min = 40, max = 40, message = "Codigo Contrato Original deve ter exatamente 40 caractéres.")
    @Column(name = "codigo_contrato_original", columnDefinition = "bpchar(1)")
    private String codigoContratoOriginal;

    @NotNull(message = "CNPJ Base IF Credora não pode ser nulo")
    @Pattern(regexp = "^[0-9]{8}", message = "CNPJ Base IF Credora é um CNPJ Base, portanto deve ter 8 dígitos")
    @Column(name = "cnpj_base_if_credora_original")
    private Integer cnpjBaseIfCredoraOriginal;

    @NotNull(message = "Tipo Contrato não pode ser nulo")
    @Convert(converter = TipoContratoConverter.class)
    @Column(name = "tipo_contrato", columnDefinition = "bpchar(1)")
    private TipoContratoEnum tipoContrato;

    @NotNull(message = "Tipo Ente Consignante não pode ser nulo")
    @Convert(converter = TipoEnteConsignanteConverter.class)
    @Column(name = "tipo_ente_consignante")
    private TipoEnteConsignanteEnum tipoEnteConsignante;

    @Pattern(regexp = "^[0-9]{14}", message = "CNPJ Correspondente Bancário deve ter 14 dígitos")
    @NotNull(message = "CNPJ Correspondente Bancário não pode ser nulo")
    @Column(name = "cnpj_correspondente_bancario")
    private Long cnpjCorrespondenteBancario;
}
