// Projeto funcional - 2 / 5 - Verificação de Número de Conta Bancária
import java.util.Scanner;
public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Leia a entrada do usuário como uma string representando o número da conta
            System.out.println("Digite o número da conta bancária:");
            String numeroConta = scanner.next();

            // Chame o método verificarNumeroConta, passando o número da conta como argumento
            verificarNumeroConta(numeroConta);

            // Imprime que o número de conta é válido
            System.out.println("Número de conta válido.");

        } catch (IllegalArgumentException e) {
            // Captura a exceção do tipo IllegalArgumentException, que pode ser lançada pelo método verificarNumeroConta
            // Aqui é impressa uma mensagem de erro, mostrando a mensagem associada à exceção
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos
    private static void verificarNumeroConta(String numeroConta) {
        // Verifica se o número da conta tem exatamente 8 dígitos
        if (numeroConta.length() != 8) {
            // Implementa uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos
            throw new IllegalArgumentException("Número de conta inválido. Digite exatamente 8 dígitos.");
        }
    }
}
