package br.com.edwi.jpa.relacionamentos.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "solicitacao")
@IdClass(SolicitacaoKey.class)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SolicitacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Id
    @Column(name = "numero_portabilidade")
    private BigDecimal numeroPortabilidade;

    @Id
    @Column(name = "data_insercao")
    private LocalDateTime dataInsercao;

    @NotNull(message = "Identificador Participante Administrado não pode ser nulo")
    @Pattern(regexp = "^[0-9]{8}]", message = "Identificador Participante Administrado é um CNPJ Base, portanto deve ter 8 dígitos")
    @Column(name = "identificador_participante_administrado")
    private Integer identificadorParticipanteAdministrado;

    @NotNull(message = "Identificador IF Proponente não pode ser nulo")
    @Pattern(regexp = "^[0-9]{8}]", message = "Identificador IF Proponente é um CNPJ Base, portanto deve ter 8 dígitos")
    @Column(name = "identificador_if_proponente")
    private Integer identificadorIfProponente;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    @JoinColumn(name = "numero_portabilidade", referencedColumnName = "numero_portabilidade")
    @JoinColumn(name = "data_insercao", referencedColumnName = "data_insercao")
    @MapsId
    @ToString.Exclude
    @JsonBackReference
    private ClienteEntity cliente;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    @JoinColumn(name = "numero_portabilidade", referencedColumnName = "numero_portabilidade")
    @JoinColumn(name = "data_insercao", referencedColumnName = "data_insercao")
    @MapsId
    @ToString.Exclude
    @JsonBackReference
    private IdentificadorContratoEntity identificadorContrato;
}