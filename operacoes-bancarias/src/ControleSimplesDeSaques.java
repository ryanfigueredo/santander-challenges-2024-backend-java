// Funcional -- 5 / 5 - Controle de Saques

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o limite diário de saque:");
            double limiteDiario = scanner.nextDouble();

            // Loop infinito para iterar sobre os saques
            while (true) {
                // Solicita ao usuário o valor do saque
                System.out.println("Digite o valor do saque (0 para encerrar):");
                double saque = scanner.nextDouble();

                // Verifica se o valor do saque é zero, encerrando as transações
                if (saque == 0) {
                    System.out.println("Transações encerradas.");
                    break;
                } else {
                    // Verifica se o valor do saque é válido
                    if (saque <= 0) {
                        System.out.println("Valor do saque inválido. Digite um valor positivo.");
                        continue;
                    }

                    // Verifica se o valor do saque ultrapassa o limite diário
                    if (saque > limiteDiario) {
                        System.out.println("Limite diário de saque atingido. Transações encerradas.");
                        break;
                    }

                    // Subtrai o valor do saque do limite diário
                    limiteDiario -= saque;
                    System.out.println("Saque realizado. Limite restante: " + String.format("%.1f", limiteDiario));
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira um valor numérico válido.");
        } finally {
            // Fecha o Scanner para evitar vazamento de recursos
            scanner.close();
        }
    }
}
