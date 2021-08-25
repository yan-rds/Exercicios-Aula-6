package br.com.zup;
        // Desafio do exercício 3 da lista de exercícios da aula 01 de Java.
        // Neste desafio usei apenas os conhecimentos enisnados na aula 01 de Java, à exceção da operaçao matemática módulo (%)
public class ExercicioComplementar2 {
    public static void main(String[] args) {

        // Definindo Variáveis simples
        double areaTotal = 200;
        double galaoLitros = 3.6;
        int lataLitros = 18;
        int coberturaPorLitro = 6;
        int lataPreco = 80;
        int galaoPreco = 25;

        // Definindo variáveis compostas
        double coberturaLata = lataLitros * coberturaPorLitro;
        double coberturaGalao = galaoLitros * coberturaPorLitro;

        // Cálculos usando lata
                // Problemática dessa parte: Não é possivel vender 4,787878 latas (exemplo). É necessário arredondar para cima pra podermos precificar
        double latasNecessarias = areaTotal / coberturaLata; // Essa variável não possui arredondamento (pergunta 1 do exercício)
        double areaRestanteLata = areaTotal % coberturaLata; // Essa variável separa o valor inteiro da lata, do resto
        double quantidadeDeLatas = (areaTotal- areaRestanteLata) / coberturaLata; // Essa variável me diz quantas latas "cabem" na areaTotal, sem decimar.
        double restanteUltimaLata = coberturaLata - areaRestanteLata; // Essa variável me diz quantos m² faltou pintar após a variável acima
        double ultimaLata = (areaRestanteLata + restanteUltimaLata) / coberturaLata; // Essa variável "Preenche" o restante necessário pra arredondarmos o valor decimal para cima.
        double totalDeLatas = quantidadeDeLatas + ultimaLata; // Após "preencher" a ultima lata, essa variável nos dá o total que deve ser vendido
        double precoTotalLata = totalDeLatas * lataPreco;

        // Calculo usando galão
                // Basicamente o mesmo conceito das Latas, agora aplicado às variáveis do galão
        double galoesNecessarios = areaTotal / coberturaGalao;
        double areaRestanteGalao = areaTotal % coberturaGalao;
        double quantidadeDeGaloes = (areaTotal - areaRestanteGalao) / coberturaGalao;
        double restanteUltimoGalao = coberturaGalao - areaRestanteGalao;
        double ultimoGalao = (areaRestanteGalao + restanteUltimoGalao) / coberturaGalao;
        double totalDeGaloes = quantidadeDeGaloes + ultimoGalao;
        double precoTotalGalao = totalDeGaloes * galaoPreco;


        // Variáveis pra terceira parte
                // A Problemática dessa parte é utilizar a quantidade máxima de latas inteiras, e preencher o restante com galões, arredondando pra cima o numero de galões no final pra darmos o preço correto.
        // A partir daqui, as próximas variáveis serão para arredondarmos pra cima, por isso são iguais as anteriores, mas com _preenchimento para identificação
        double areaRestanteGalao_preenchimento = areaRestanteLata % coberturaGalao;
        double quantidadeDeGaloes_preenchimento = (areaRestanteLata - areaRestanteGalao_preenchimento) / coberturaGalao;
        double restanteUltimoGalao_preenchimento = coberturaGalao - areaRestanteGalao_preenchimento;
        double ultimoGalao_preenchimento = (areaRestanteGalao_preenchimento + restanteUltimoGalao_preenchimento) / coberturaGalao;
        double totalDeGaloes_preenchimento = quantidadeDeGaloes_preenchimento + ultimoGalao_preenchimento;
        double precoTotalLata_preenchimento = quantidadeDeLatas * lataPreco;
        double precoTotalGalao_preenchimento = totalDeGaloes_preenchimento * galaoPreco;
        double totalDaCompra_preenchimento = precoTotalGalao_preenchimento + precoTotalLata_preenchimento;


        // Dando informações ao usuário
        System.out.println("Tendo em vista que você quer pintar " + areaTotal + "m², utilizando uma lata de " + lataLitros + " litros, será necessário utilizar " + latasNecessarias + " Latas de tinta. Logo, voce precisará comprar " + totalDeLatas + " latas de tinta. Como a unidade hoje está a R$" + lataPreco + " o total dará R$" + precoTotalLata);
        System.out.println("Agora se quiser utilizar nossos galões de " + galaoLitros + " litros, serão necessários " + galoesNecessarios + " destes galões. Tendo visto, você precisará comprar " + totalDeGaloes + " galões pra cobrir toda esta área. A unidade deles hoje está R$" + galaoPreco + ", totalizando pra você R$" + precoTotalGalao );
        System.out.println("Para te darmos o melhor custo benefício e com o objetivo de evitarmos desperdício, calculamos pra você a melhor combinação de compra. Ela é:");
        System.out.println(quantidadeDeLatas + " latas, custando R$" + precoTotalLata_preenchimento + " e para completar sua pintura serão necessários " + totalDeGaloes_preenchimento + " galões, custando R$" + precoTotalGalao_preenchimento + ". Optando por este pacote o total da sua compra será R$" + totalDaCompra_preenchimento);

    }
}
