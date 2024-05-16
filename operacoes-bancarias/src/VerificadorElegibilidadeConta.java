//  Projeto Funcional -- 3 / 5 - Operações Bancárias Simples com Switch

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua data de nascimento (AAAA-MM-DD):");
        String dataNascimentoStr = scanner.nextLine();

        // Convertendo a entrada do usuário para um objeto LocalDate
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);

        // Obtendo a data atual
        LocalDate dataAtual = LocalDate.now();

        // Calculando a idade do cliente
        int idade = Period.between(dataNascimento, dataAtual).getYears();

        // Verificando se o cliente é elegível
        if (idade >= 18) {
            System.out.println("Parabéns! Você é elegível para criar uma conta bancária.");
        } else {
            System.out.println("Desculpe, você não tem idade suficiente para criar uma conta bancária.");
        }

        // Fechamos o objeto Scanner para liberar os recursos
        scanner.close();
    }
}
