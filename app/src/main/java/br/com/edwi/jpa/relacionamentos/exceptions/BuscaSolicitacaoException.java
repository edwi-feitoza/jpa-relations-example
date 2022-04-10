package br.com.edwi.jpa.relacionamentos.exceptions;

public class BuscaSolicitacaoException  extends RuntimeException{
    public  BuscaSolicitacaoException(String message) {
        super(message);
    }
}