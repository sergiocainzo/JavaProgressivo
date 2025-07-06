package ifElse;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        // Atributos
        Scanner scan = new Scanner(System.in);
        int valor;

        System.out.println("Escreva um programa em JAVA que recebe um inteiro e diga se é PAR ou IMPAR");
        System.out.println("");
        System.out.print("Informe um número: ");
        valor = scan.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Este número é PAR");
        } else {
            System.out.println("Este número é IMPAR");
        }

        scan.close();

    }
}
