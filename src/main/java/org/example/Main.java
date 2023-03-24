package org.example;

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(100);

        try {                                           // tente
            cc.depositar(-10);
            // Várias linhas de códigos...
        } catch(IllegalArgumentException e) {             // vai tentar capiturar todas as excessões que definimos
            System.out.println("Você executou uma operação ilegal: " + e.getMessage());
        }


    }
}
