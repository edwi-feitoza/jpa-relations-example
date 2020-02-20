package br.com.edwi.jpa.relacionamentos.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "produto_custodia")
public class ProdutoCustodiaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "pk_sequence_produto")
    @SequenceGenerator(name = "pk_sequence_produto", sequenceName = "produto_custodia_id_produto_seq", allocationSize = 1)
    @Column(name = "id_produto")
    private Integer id;

    @Column(name = "campo_produto_um")
    private String campoProdutoUm;

    @Column(name = "campo_produto_dois")
    private String campoProdutoDois;

    @Column(name = "campo_produto_tres")
    private String campoProdutoTres;

    public ProdutoCustodiaEntity() {
    }

    public Integer getId() {
        return id;
    }

    public String getCampoProdutoUm() {
        return campoProdutoUm;
    }

    public String getCampoProdutoDois() {
        return campoProdutoDois;
    }

    public String getCampoProdutoTres() {
        return campoProdutoTres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdutoCustodiaEntity that = (ProdutoCustodiaEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(campoProdutoUm, that.campoProdutoUm) &&
                Objects.equals(campoProdutoDois, that.campoProdutoDois) &&
                Objects.equals(campoProdutoTres, that.campoProdutoTres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, campoProdutoUm, campoProdutoDois, campoProdutoTres);
    }

    @Override
    public String toString() {
        return "ProdutoCustodiaEntity{" +
                "id=" + id +
                ", campoProdutoUm='" + campoProdutoUm + '\'' +
                ", campoProdutoDois='" + campoProdutoDois + '\'' +
                ", campoProdutoTres='" + campoProdutoTres + '\'' +
                '}';
    }
}