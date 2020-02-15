package br.com.edwi.jpa.relacionamentos.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "cliente_custodia")
@IdClass(ContratoCustodiaKey.class)
public class ClienteCustodiaEntity {

    @Id
    @Column(name = "id_contrato")
    private Integer idContrato;

    @Id
    @Column(name = "id_qualquer_bosta")
    private String idQualquerBosta;

    @Id
    @Column(name = "data_insercao")
    private LocalDateTime dataInsercao;

    @Column(name = "campo_cliente_um")
    private String campoClienteUm;

    @Column(name = "campo_cliente_dois")
    private String campoClienteDois;

    @Column(name = "campo_cliente_tres")
    private String campoClienteTres;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_contrato", referencedColumnName = "id_contrato")
    @JoinColumn(name = "id_qualquer_bosta", referencedColumnName = "id_qualquer_bosta")
    @JoinColumn(name = "data_insercao", referencedColumnName = "data_insercao")
    @MapsId
    private ContratoCustodiaEntity contrato;

    public ClienteCustodiaEntity (){ }

    public ClienteCustodiaEntity(Integer idContrato, String idQualquerBosta, LocalDateTime dataInsercao, String campoClienteUm, String campoClienteDois, String campoClienteTres, ContratoCustodiaEntity contrato) {
        this.idContrato = idContrato;
        this.idQualquerBosta = idQualquerBosta;
        this.dataInsercao = dataInsercao;
        this.campoClienteUm = campoClienteUm;
        this.campoClienteDois = campoClienteDois;
        this.campoClienteTres = campoClienteTres;
        this.contrato = contrato;
    }

    public Integer getIdContrato() { return idContrato; }

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

    public String getCampoClienteUm() {
        return campoClienteUm;
    }

    public void setCampoClienteUm(String campoClienteUm) {
        this.campoClienteUm = campoClienteUm;
    }

    public String getCampoClienteDois() {
        return campoClienteDois;
    }

    public void setCampoClienteDois(String campoClienteDois) {
        this.campoClienteDois = campoClienteDois;
    }

    public String getCampoClienteTres() {
        return campoClienteTres;
    }

    public void setCampoClienteTres(String campoClienteTres) {
        this.campoClienteTres = campoClienteTres;
    }

    public ContratoCustodiaEntity getContrato() {
        return contrato;
    }

    public void setContrato(ContratoCustodiaEntity contrato) {
        this.contrato = contrato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteCustodiaEntity that = (ClienteCustodiaEntity) o;
        return Objects.equals(idContrato, that.idContrato) &&
                Objects.equals(idQualquerBosta, that.idQualquerBosta) &&
                Objects.equals(dataInsercao, that.dataInsercao) &&
                Objects.equals(campoClienteUm, that.campoClienteUm) &&
                Objects.equals(campoClienteDois, that.campoClienteDois) &&
                Objects.equals(campoClienteTres, that.campoClienteTres) &&
                Objects.equals(contrato, that.contrato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idContrato, idQualquerBosta, dataInsercao, campoClienteUm, campoClienteDois, campoClienteTres, contrato);
    }

    @Override
    public String toString() {
        return "ClienteCustodiaEntity{" +
                "idContrato=" + idContrato +
                ", idQualquerBosta='" + idQualquerBosta + '\'' +
                ", dataInsercao=" + dataInsercao +
                ", campoClienteUm='" + campoClienteUm + '\'' +
                ", campoClienteDois='" + campoClienteDois + '\'' +
                ", campoClienteTres='" + campoClienteTres + '\'' +
                ", contrato=" + contrato +
                '}';
    }
}