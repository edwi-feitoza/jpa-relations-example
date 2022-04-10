package br.com.edwi.jpa.relacionamentos;

public class Teste {

    public static void main(String[] args) {
        Integer teste1 = 2222;
        Integer teste2 = 2222;
        Boolean iguaisReferencia = teste1 == teste2;
        Boolean iguaisValor = teste1.equals(teste2);
        System.out.println("Verifica se são iguais: " + iguaisReferencia);
        System.out.println("Verifica se são iguais: " + iguaisValor);
    }
}
