package ifElse;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        // Atributos
        Scanner scan = new Scanner(System.in);
        double raio, diametro, comprimento, area;

        System.out.println(
                "Escreva um programa que receba o raio de uma circinferência e mostre o diâmetro, comprimento e área desta.");

        System.out.println("");
        System.out.print("Raio: ");
        raio = scan.nextFloat();

        // Lógica
        diametro = 2 * raio;
        comprimento = 2 * Math.PI * raio;
        area = Math.PI * Math.pow(raio, 2);

        // Exibição
        System.out.println("Diametro: " + diametro);
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Área: " + area);

    }
}
