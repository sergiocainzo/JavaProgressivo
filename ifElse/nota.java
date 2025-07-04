package ifElse;

import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        // Atributos
        Scanner scan = new Scanner(System.in);

        System.out.println(
                "Crie um programa que receba uma nota e checa se você passou direto, ficou de recuperação ou foi reprovado na matéria, e exiba tal mensagem:\nA regra é a seguinte:\nNota 7 ou acima: passou direto\nEntre 5 - 7: tem direito de fazer uma prova de recuperação\nAbaixo de 5> reprovado direto");

        System.out.println("--------------");
        System.out.print("Informe a nota: ");
        float nota = scan.nextFloat();
        if (nota >= 7) {
            System.out.println("Passou direto");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Tem direito de fazer uma prova de recuperação");
        } else {
            System.out.println("Reprovado direto");
        }
    }
}
