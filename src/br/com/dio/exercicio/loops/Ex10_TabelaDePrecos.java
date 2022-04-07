package br.com.dio.exercicio.loops;

/*O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99, com cerca de 10 caixas. Para agilizar
o cálculo de quanto cada cliente deve pagar ele desenvolveu um tabela que contém o número de itens que o cliente
 comprou e ao lado o valor da conta. Desta forma a atendente do caixa precisa apenas contar quantos itens o cliente
 está levando e olhar na tabela de preços. Você foi contratado para desenvolver o programa que monta esta tabela de
  preços, que conterá os preços de 1 até 50 produtos, conforme o exemplo abaixo:

        Lojas Quase Dois - Tabela de preços
        1 - R$ 1.99
        2 - R$ 3.98
        ...
        50 - R$ 99.50 */


public class Ex10_TabelaDePrecos {

    public static void main(String[] args) {

        double precoTotal = 1.99;

        System.out.println(" -------------------");

        for (int i = 1; i <=50; i++) {

            System.out.println(i + "-" + "R$" + precoTotal*i);
        }
        System.out.println(" ----------------------");

       /* O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a metodologia
       da tabelinha, que já é um sucesso na sua loja de 1,99. Você foi contratado para desenvolver o
        programa que monta a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão
        informado pelo usuário, conforme o exemplo abaixo:

         Preço do pão: R$ 0.18
        Panificadora Pão de Ontem - Tabela de preços
        1 - R$ 0.18
        2 - R$ 0.36
        ...
        50 - R$ 9.00*/

        System.out.println("---------------------");
        System.out.println("Preço total dos Paes: ");

        double precoTotalDoPao = 0.18;

        for (int i =1; i <=50; i++) {

            System.out.println(i + "-" + "R$" + precoTotalDoPao*i);
        }

        System.out.println("----------------------");
    }

}
