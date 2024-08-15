package ROBSON_DE_LIMA.primeirob.listas.listaDois;
import java.util.Scanner;

public class calculadora {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calcularPrecoTotal(scanner);
                    break;
                case 2:
                    calcularTroco(scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }

    public static void calcularPrecoTotal(Scanner scanner) {
        System.out.print("Digite a quantidade de plantas: ");
        int quantidade = scanner.nextInt();
        System.out.print("Digite o preço unitário da planta: ");
        float precoUnitario = scanner.nextFloat();
        if (quantidade >= 10) {
            float precoTotal = (float) ((quantidade * precoUnitario)-((quantidade * precoUnitario)*0.05));  
            System.out.printf("O preço total é: R$ %.2f%n", precoTotal);        
        }
        else {
            float precoTotal = quantidade * precoUnitario;
            System.out.printf("O preço total é: R$ %.2f%n", precoTotal);
        }
        
    }

    public static void calcularTroco(Scanner scanner) {
        System.out.print("Digite o valor recebido: ");
        float valorRecebido = scanner.nextFloat();
        System.out.print("Digite o valor total da compra: ");
        float valorTotal = scanner.nextFloat();

        float troco = valorRecebido - valorTotal;
        System.out.printf("O troco é: R$ %.2f%n", troco);
    }
}
