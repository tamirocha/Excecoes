package org.example;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);                             //Estou chamando o construtor da classe Exception, passando uma mensagem como parametro.A mensagem esta na superclass ContaCorrente.

    }
}
