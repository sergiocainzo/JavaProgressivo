package whileex;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        System.out.println("Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele.\nEm seguida, através de um laço While, pede ao usuário para que entre com as notas de todos os alunos da sala, um por um.\nPor fim, o programa mostra a média da turma.");

        // Atributos
        Scanner scan = new Scanner(System.in); 
        List<Integer> notasDosAlunos = new ArrayList<>();
        int qtd_alunos =0, notas, index=1, index2 = 1;
        
        System.out.print("Quantos alunos existem na sala: ");
        qtd_alunos = scan.nextInt();

        // Lógica
        while (index <= qtd_alunos) {
            System.out.printf("%sº nota: ", index);
            notas = scan.nextInt();
            notasDosAlunos.add(notas);
            index++;
        }

        System.out.println("Notas do aluno: ");
        for (Integer nota : notasDosAlunos) {
            System.out.printf("Nota %s: %s \n",index2,nota);
            index2++;
        }
        OptionalDouble media = notasDosAlunos.stream().mapToDouble(Integer::intValue).average();

        System.out.println("\nA média é: " +media.getAsDouble());






    }
}
