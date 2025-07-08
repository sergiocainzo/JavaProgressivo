package whileex;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        System.out.println(
                "Escreva um programa em Java que solicite 10 números ao usuário, através de um laço While, e ao final, mostre qual destes números é o maior.");

        // Atributos
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int valor, index = 1;

        while (index <= 5) {
            System.out.printf("Digite o %s valor: ", index);
            valor = scan.nextInt();
            numeros.add(valor);
            index++;
        }

        OptionalInt maior = numeros.stream().mapToInt(Integer::intValue).max();


        System.out.println("-----------------------");
        System.out.println("Exibindo os números da Lista");
        System.out.println(numeros);
        System.out.println("-----------------------");
        System.out.printf("O Maior número é: %s\n",maior.getAsInt());

    }
}
