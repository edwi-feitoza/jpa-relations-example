package br.com.edwi.jpa.relacionamentos.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "contrato_custodia")
@IdClass(ContratoCustodiaKey.class)
public class ContratoCustodiaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "pk_sequence")
    @SequenceGenerator(name = "pk_sequence", sequenceName = "contrato_custodia_id_contrato_seq", allocationSize = 1)
    @Column(name = "id_contrato")
    private Integer idContrato;

    @Id
    @Column(name = "id_qualquer_bosta")
    private String idQualquerBosta;

    @Id
    @Column(name = "data_insercao")
    private LocalDateTime dataInsercao;

    @Column(name = "campo_contrato_um")
    private String campoContratoUm;

    @Column(name = "campo_contrato_dois")
    private String campoContratoDois;

    @Column(name = "campo_contrato_tres")
    private String campoContratoTres;

    public ContratoCustodiaEntity() {}

    public ContratoCustodiaEntity(String idQualquerBosta, LocalDateTime dataInsercao, String campoContratoUm, String campoContratoDois, String campoContratoTres) {
        this.idQualquerBosta = idQualquerBosta;
        this.dataInsercao = dataInsercao;
        this.campoContratoUm = campoContratoUm;
        this.campoContratoDois = campoContratoDois;
        this.campoContratoTres = campoContratoTres;
    }

    public Integer getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Integer idContrato) {
        this.idContrato = idContrato;
    }

    public String getIdQualquerBosta() {
        return idQualquerBosta;
    }

    public void setIdQualquerBosta(String idQualquerBosta) {
        this.idQualquerBosta = idQualquerBosta;
    }

    public LocalDateTime getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(LocalDateTime dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

    public String getCampoContratoUm() {
        return campoContratoUm;
    }

    public void setCampoContratoUm(String campoContratoUm) {
        this.campoContratoUm = campoContratoUm;
    }

    public String getCampoContratoDois() {
        return campoContratoDois;
    }

    public void setCampoContratoDois(String campoContratoDois) {
        this.campoContratoDois = campoContratoDois;
    }

    public String getCampoContratoTres() {
        return campoContratoTres;
    }

    public void setCampoContratoTres(String campoContratoTres) {
        this.campoContratoTres = campoContratoTres;
    }

  /*  public ClienteCustodiaEntity getCliente() {
        return cliente;
    }

    public void setCliente(ClienteCustodiaEntity cliente) {
        this.cliente = cliente;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContratoCustodiaEntity that = (ContratoCustodiaEntity) o;
        return Objects.equals(idContrato, that.idContrato) &&
                Objects.equals(idQualquerBosta, that.idQualquerBosta) &&
                Objects.equals(dataInsercao, that.dataInsercao) &&
                Objects.equals(campoContratoUm, that.campoContratoUm) &&
                Objects.equals(campoContratoDois, that.campoContratoDois) &&
                Objects.equals(campoContratoTres, that.campoContratoTres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idContrato, idQualquerBosta, dataInsercao, campoContratoUm, campoContratoDois, campoContratoTres);
    }

    @Override
    public String toString() {
        return "ContratoCustodiaEntity{" +
                "idContrato=" + idContrato +
                ", idQualquerBosta='" + idQualquerBosta + '\'' +
                ", dataInsercao=" + dataInsercao +
                ", campoContratoUm='" + campoContratoUm + '\'' +
                ", campoContratoDois='" + campoContratoDois + '\'' +
                ", campoContratoTres='" + campoContratoTres + '\'' +
                '}';
    }
}