package br.com.zup;

import java.sql.SQLOutput;

public class Exercicio2 {
    public static void main(String[] args) {

        // Definindo Variáveis
        int nota1 = 8;
        int nota2 = 10;
        int nota3 = 9;
        int nota4 = 5;

        // Criando o sistema de média
        int soma = nota1 + nota2 + nota3 + nota4;
        int media = soma / 4;

        // Dando essa informação ao usuário
        System.out.println("Suas notas bimestrais são respectivamente: " + nota1 + ", " + nota2 + ", " + nota3 + " e " + nota4);
        System.out.println("Sua média este ano é de: " + media);
    }
}
