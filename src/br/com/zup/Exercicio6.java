package br.com.zup;

public class Exercicio6 {
    public static void main(String[] args) {

        // Definindo Variáveis
        double horasTrabalhadas = 36.5;
        double salarioPorHora = 10;
        // Calculando o salário sem impostos
        double salario = horasTrabalhadas * salarioPorHora;
        // Calculando impostos
        double inss = salario * 0.08;
        double sindicato = salario * 0.05;
        double impostoDeRenda = salario * 0.11;
        //Calculando o salario liquido
        double salarioLiquido = salario - inss - sindicato - impostoDeRenda;

        //Dando essa informação ao usuário
        System.out.println("Esse mês você trabalhou " + horasTrabalhadas + " horas, com um salário de R$" + salarioPorHora + " por hora.");
        System.out.println("Seu salário sem impostos seria R$" + salario);
        System.out.println("Foi descontado R$" + inss + " referente ao INSS e R$" + sindicato + " referente ao sindicato" );
        System.out.println("Seu salário líquido será de R$" + salarioLiquido);

    }
}