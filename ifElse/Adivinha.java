package ifElse;

import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        // Atributos
        Scanner scan = new Scanner(System.in); // Scanner para coletar dados da console
        Random randomGenerator = new Random(); // Gerador de número randômico
        int num_aleatorio = randomGenerator.nextInt(10) + 1; // Variável que GERA o inteiro até 10
        int valorDigitado, qtd_chances = 1; // Atributos de valorDigitado = valor digitado pelo usuário
                                            // qtd_chances = tentativas feitas pelo usuário

        System.out.println(
                "Escreva um aplicativo JAVA que gere um número aleatório inteiro entre 1 - 10, e atraves de testes condicionais, você tem que adivinhar que número é esse.");

        System.out.println("Teste: " + num_aleatorio);
        System.out.print("Digite um número: [1-10] ");
        valorDigitado = scan.nextInt();
        while (valorDigitado != num_aleatorio) {
            if (valorDigitado > 10 || valorDigitado < 0) {
                System.out.println("Número inválido. Tente novamente");
                System.out.print("Digite um número: [1-10] ");
                valorDigitado = scan.nextInt();
            } else {
                System.out.println("Quase, jogue novamnete!");
                System.out.print("Digite um número: [1-10] ");
                valorDigitado = scan.nextInt();
                qtd_chances++;
            }
        }

        System.out.printf("Parabéns, você acertou na %d tentativa.\n", qtd_chances);

        scan.close();

    }
}
