package br.com.edwi.jpa.relacionamentos.entities;

import br.com.edwi.jpa.relacionamentos.enums.UfEnum;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "endereco_carta")
@IdClass(SolicitacaoKey.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class EnderecoCartaEntity {

    @Id
    private Integer id;

    @Id
    @Column(name = "numero_portabilidade", columnDefinition = "DECIMAL(21)")
    private BigDecimal numeroPortabilidade;

    @Id
    @Column(name = "data_insercao")
    private LocalDateTime dataInsercao;

    @NotNull(message = "LOGRADOURO não pode ser nulo")
    @Size(min = 1, max = 200, message = "LOGRADOURO deve ter no mínimo 1 caractére e no máximo 200 caractéres")
    @Column(name = "logradouro")
    private String logradouro;

    @NotNull(message = "COMPLEMENTO não pode ser nulo")
    @Size(min = 1, max = 200, message = "COMPLEMENTO deve ter no mínimo 1 caractére e no máximo 200 caractéres")
    @Column(name = "complemento")
    private String complemento;

    @NotNull(message = "NUMERO não pode ser nulo")
    @Size( max = 200, message = "NUMERO deve ter no máximo 9 caractéres")
    @Column(name = "numero")
    private String numero;

    @NotNull(message = "CIDADE não pode ser nulo")
    @Size(min = 1, max = 50, message = "CIDADE deve ter no mínimo 1 caractére e no máximo 50 caractéres")
    @Column(name = "cidade")
    private String cidade;

    @Enumerated(EnumType.STRING)
    @Column(name = "uf", columnDefinition = "CHAR(2)")
    private UfEnum uf;

    @NotNull(message = "CEP não pode ser nulo")
    @Size(min = 7, max = 50, message = "CEP deve ter no mínimo 7 caractéres e no máximo 8 caractéres")
    @Column(name = "cep")
    private String cep;

    @OneToOne(mappedBy = "enderecoCarta", fetch = FetchType.LAZY)
    @LazyToOne(LazyToOneOption.NO_PROXY)
    @MapsId
    @ToString.Exclude
    @JsonManagedReference
    private ClienteEntity cliente;
}