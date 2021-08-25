package br.com.zup;

public class ExercicioComplementar1 {
    public static void main(String[] args) {

        // Definindo variáveis
        double pesoTotal = 78;
        double pesoSemMulta = 50;
        double excesso = pesoTotal - pesoSemMulta;
        double valorDaMulta = 4;
        double multa = excesso * valorDaMulta;

        // Informando ao usuário
        System.out.println("Hoje você pescou " + pesoTotal + " quilos de peixe");
        System.out.println("O peso excedido foi de " + excesso + ", sendo cobrado R$" + valorDaMulta + " por quilo excedido");
        System.out.println("O valor da multa a pagar é de R$" + multa);

    }
}
