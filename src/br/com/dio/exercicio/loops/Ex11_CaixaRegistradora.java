package br.com.dio.exercicio.loops;


/*O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99
 e agora possui uma loja de conveniências. Faça um programa que implemente
 uma caixa registradora rudimentar. O programa deverá receber um número
 desconhecido de valores referentes aos preços das mercadorias.
 Um valor zero deve ser informado pelo operador para indicar o final da compra.
  O programa deve então mostrar o total da compra e perguntar o valor em dinheiro
   que o cliente forneceu, para então calcular e mostrar o valor do troco.
   Após esta operação, o programa deverá voltar ao ponto inicial, para registrar
    a próxima compra. A saída deve ser conforme o exemplo abaixo:

        Lojas Tabajara
        Produto 1: R$ 2.20
        Produto 2: R$ 5.80
        Produto 3: R$ 0
        Total: R$ 9.00
        Dinheiro: R$ 20.00
        Troco: R$ 11.00
        ...*/


import java.util.Scanner;

public class Ex11_CaixaRegistradora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();

        while (true) {

            boolean registro = false;
            double valorDoProduto = 0;
            double valorTotal = 0;
            double recebido = 0;
            int count = 0;


            while (!registro) {
                System.out.println("Produto" + (count +1) + ":" + "\t" +"R$");
                valorDoProduto = scan.nextDouble();

                if (valorDoProduto == 0)
                    registro = true;

                else valorTotal += valorDoProduto;
                count++;


            }

            System.out.println("Valor total da compra: R$ " + valorTotal);
            System.out.println("Valor recebido: R$ " );
            recebido = scan.nextDouble();
            System.out.println("Troco: R$ " + (recebido-valorTotal));
        }

    }
}

