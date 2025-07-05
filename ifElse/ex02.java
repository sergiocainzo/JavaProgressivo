package ifElse;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        // Atributos
        Scanner scan = new Scanner(System.in);
        int valor, maior = 0, menor = 0;

        System.out.println(
                "Faça um programa que receba três inteiros e diga qual deles é o maior e qual é o menor. Consegue criar mais de uma solução?");

        // Lógica para maior e menor
        for (int i = 0; i < 3; i++) {
            System.out.printf("Número %s: ", i + 1);
            valor = scan.nextInt();
            if (i == 0) {
                maior = valor;
                menor = valor;
            } else {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
            }
        }

        // exibição
        System.out.printf("Maior: %s\n", maior);
        System.out.printf("Menor: %s\n", menor);

    }
}
