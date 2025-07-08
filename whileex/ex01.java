package whileex;

public class ex01 {
    public static void main(String[] args) {
        // Atributos
        int index = 0;

        System.out.println("Escreva um programa em Java que mostre todos os números impares entre 1-100");

        System.out.println("");
        System.out.println("Segue todos os números IMPARES entre 1 - 100:");

        // Lógica
        while (index <= 100) {

            if (index % 2 != 0) {
                System.out.printf("%s -> ",index);
            }
            index++;
        }
        System.out.println("Sem mais números impares.");
        System.out.println("Fim da aplicação.");
    }
}
