package br.com.edwi.jpa.relacionamentos.exceptions;

public class CodigoMoedaInvalidoException extends RuntimeException {

    public CodigoMoedaInvalidoException(String message) {
        super("message");
    }
}