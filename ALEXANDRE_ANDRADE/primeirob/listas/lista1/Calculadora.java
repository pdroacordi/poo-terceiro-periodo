package primeirob.listas.lista1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Olá Gabrielinha!\nQual opereção voce quer realizar?\n" +
                    "[1] - Calcular Preço Total\n[2] - Calcular Troco\n[3] - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o preço unitário da planta:");
                    double precoUnitario = sc.nextDouble();

                    System.out.println("Digite a quantidade de plantas:");
                    int quantidade = sc.nextInt();

                    double precoTotal = precoUnitario * quantidade;
                    System.out.printf("O preço total é R$ %.2f\n", precoTotal);
                    break;
                case 2:
                    System.out.println("Digite o valor pago:");
                    double valorPago = sc.nextDouble();

                    System.out.println("Digite o preço total:");
                    double precoTotal2 = sc.nextDouble();

                    double troco = valorPago - precoTotal2;
                    System.out.printf("O troco é R$ %.2f\n", troco);
                    break;
                case 3:
                    System.out.println("Até Logo  Gabrielinha!");
                    break;
                default:
                    System.out.println("Quebro a calculadora, Gabrielinha!");
            }
            System.out.println();
        } while (opcao != 3);
        sc.close();
    }
}