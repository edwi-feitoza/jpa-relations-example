package br.com.edwi.jpa.relacionamentos.exceptions;

public class TipoContratoInvalidoException  extends RuntimeException {

    public TipoContratoInvalidoException(String message) {
        super("message");
    }
}