// Projeto funcional - 1 / 5 - Operações Bancárias Simples com Switch
import java.util.Scanner;
public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 
            // Exibindo as opções para o usuário
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("0 - Encerrar programa");
            System.out.print("Opção: ");
            
            // Lendo a opção do usuário
            int opcao = scanner.nextInt(); 
            
            // Implementando as operações com base na opção escolhida pelo usuário
            switch (opcao) {
                case 1: // DEPOSITAR
                    System.out.print("Digite o valor a ser depositado: ");
                    double saldoDeposito = scanner.nextDouble();
                    saldo += saldoDeposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2: // SACAR
                    System.out.print("Digite o valor a ser sacado: ");
                    double saldoSaque = scanner.nextDouble();
                    if (saldoSaque <= saldo) {
                        saldo -= saldoSaque;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3: // CONSULTAR SALDO
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0: // ENCERRAR PROGRAMA
                    System.out.println("Programa encerrado.");
                    return;
                default: // OPÇÃO INVÁLIDA
                    System.out.println("Opção inválida. Tente novamente."); 
            }
        }
    }
}
