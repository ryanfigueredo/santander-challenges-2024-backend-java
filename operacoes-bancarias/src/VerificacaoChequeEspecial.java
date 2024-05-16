// Funcional -- 4 / 5 - Verificação de Cheque Especial

import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificacaoChequeEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o saldo disponível na conta:");
            double saldo = scanner.nextDouble();

            System.out.println("Digite o valor do saque:");
            double saque = scanner.nextDouble();

            double limiteChequeEspecial = 500;

            // Verifica se o saque não ultrapassa o saldo disponível na conta
            if (saque <= saldo) {
                System.out.println("Transação realizada com sucesso.");
            } else {
                double saldoTotal = saldo + limiteChequeEspecial;
                // Verifica se o saque ultrapassa o limite do cheque especial, mas não o saldo total disponível
                if (saque <= saldoTotal) {
                    System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
                } else {
                    // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial
                    System.out.println("Transação não realizada. Limite do cheque especial excedido.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira um valor numérico válido.");
        } finally {
            // Fechamos o objeto Scanner para liberar os recursos
            scanner.close();
        }
    }
}
