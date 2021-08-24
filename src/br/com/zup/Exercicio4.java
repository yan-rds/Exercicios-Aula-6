package br.com.zup;

public class Exercicio4 {
    public static void main(String[] args) {

        // Definindo Variáveis
        double horasTrabalhadas = 36.5;
        double salarioPorHora = 10;
        // Calculando o salário
        double salario = horasTrabalhadas * salarioPorHora;

        //Dando essa informação ao usuário
        System.out.println("Esse mês você trabalhou " + horasTrabalhadas + " horas, com um salário de R$" + salarioPorHora + " por hora.");
        System.out.println("Seu salário será R$" + salario);
    }
}
