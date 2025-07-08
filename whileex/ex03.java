package whileex;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        System.out.println(
                "Escreva um aplicativo em JAVA que receba um número inteiro e mostre os números pares e impares(separados), de 1 até o inteiro informado.");

        // Atributos
        Scanner scan = new Scanner(System.in);
        int valor, impares = 1, pares = 1;

        System.out.print("Digite um valor: ");
        valor = scan.nextInt();

        System.out.println("Números PARES:");
        while (pares <= valor) {

            if (pares % 2 == 0) {
                System.out.printf(" %s -> ", pares);
            }
            pares++;
        }
        System.out.println("Fim");
        System.out.println("");
        System.out.println("Números IMPARES:");
        while (impares <= valor) {
            if (impares % 2 != 0) {
                System.out.printf(" %s -> ", impares);
            }
            impares++;
        }
        System.out.println("Fim");
        scan.close();

    }
}
