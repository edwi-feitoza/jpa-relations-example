package br.com.edwi.jpa.relacionamentos.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class ContratoCustodiaKey implements Serializable {

    private static final long serialVersionUID = -1544072770855623149L;

    private Integer idContrato;
    private String idQualquerBosta;
    private LocalDateTime dataInsercao;

    public ContratoCustodiaKey(Integer idContrato, String idQualquerBosta, LocalDateTime dataInsercao) {
        this.idContrato = idContrato;
        this.idQualquerBosta = idQualquerBosta;
        this.dataInsercao = dataInsercao;
    }

    public ContratoCustodiaKey() { }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContratoCustodiaKey that = (ContratoCustodiaKey) o;
        return Objects.equals(idContrato, that.idContrato) &&
                Objects.equals(idQualquerBosta, that.idQualquerBosta) &&
                Objects.equals(dataInsercao, that.dataInsercao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idContrato, idQualquerBosta, dataInsercao);
    }

    @Override
    public String toString() {
        return "ContratoCustodiaKey{" +
                "idContrato=" + idContrato +
                ", idQualquerBosta='" + idQualquerBosta + '\'' +
                ", dataInsercao=" + dataInsercao +
                '}';
    }
}