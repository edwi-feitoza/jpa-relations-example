package br.com.edwi.jpa.relacionamentos.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "bulk_insert")
@IdClass(SolicitacaoKey.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class BulkEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Id
    @Column(name = "numero_portabilidade", columnDefinition = "DECIMAL(21)")
    private BigDecimal numeroPortabilidade;

    @Id
    @Column(name = "data_insercao")
    private LocalDateTime dataInsercao;

    @Column(name = "identificador_participante_administrado")
    private Integer identificadorParticipanteAdministrado;

    @Column(name = "identificador_if_proponente")
    private Integer identificadorIfProponente;

    @Version
    @Column(name = "versao")
    private Long versao;
}