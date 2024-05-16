import java.util.Scanner;

public class TesteSimulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 
            int opcao = scanner.nextInt(); 
        // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
        
        switch (opcao) {
               case 1: //DEPOSITAR
                   double saldoProv = scanner.nextDouble();
                   saldo += saldoProv;
                   System.out.println("Saldo atual: "+saldo);
                   break;
               case 2: // SACAR
                   double saldoRetirada = scanner.nextDouble();
                   if( saldoRetirada <= saldo){
                       saldo -= saldoRetirada;
                       System.out.println("Saldo atual: "+saldo);
                   }else {
                       System.out.println("Saldo insuficiente.");
                   }
                   break;
               case 3: // CONSULTAR SALDO
                   System.out.println("Saldo atual: "+saldo);
                   break;
               case 0:
                   System.out.println("Programa encerrado.");
                   return;
        // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }
        }
    }
}