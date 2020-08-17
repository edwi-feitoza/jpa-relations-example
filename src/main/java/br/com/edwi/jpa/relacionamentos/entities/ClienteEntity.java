package br.com.edwi.jpa.relacionamentos.entities;

import br.com.edwi.jpa.relacionamentos.enums.TipoPessoaEnum;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "cliente")
@IdClass(SolicitacaoKey.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class ClienteEntity {

    @Id
    private Integer id;

    @Id
    @Column(name = "numero_portabilidade", columnDefinition = "DECIMAL(21)")
    private BigDecimal numeroPortabilidade;

    @Id
    @Column(name = "data_insercao")
    private LocalDateTime dataInsercao;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", columnDefinition = "CHAR(1)")
    private TipoPessoaEnum tipoCliente;

    @NotNull(message = "CNPJ CPF não pode ser nulo")
    @Size(min = 11, max = 14, message = "CNPJ CPF deve ter entre 11 e 14 caractéres")
    @Column(name = "cnpj_cpf")
    private String cnpjCpf;

    @NotNull(message = "NOME não pode ser nulo")
    @Size(min = 1, max = 80, message = "NOME deve ter entre 1 e 80 caractéres")
    @Column(name = "nome")
    private String nome;

    @NotNull(message = "TELEFONE não pode ser nulo")
    @Size(min = 10, max = 13, message = "TELEFONE deve ter entre 10 e 13 caractéres")
    @Column(name = "telefone")
    private String telefone;

    @Size(min = 5, max = 80, message = "EMAIL deve ter entre 5 e 80 caractéres")
    @Email(message = "EMAIL deve conter um e-mail válido")
    @Column(name = "email")
    private String email;

    @OneToOne(mappedBy = "cliente", fetch = FetchType.LAZY)
    @LazyToOne(LazyToOneOption.NO_PROXY)
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
    private EnderecoCartaEntity enderecoCarta;
}