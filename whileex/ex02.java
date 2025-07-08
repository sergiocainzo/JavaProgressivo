package whileex;

public class ex02 {
    public static void main(String[] args) {
        System.out.println("Escreva um aplicativo em JAVA que mostre os números PARES de 1 - 100");

        // Atributos
        int index = 1;

        System.out.println("Segue os números pares entre 1-100:");
        while (index <= 100) {
            if (index %2==0) {
                System.out.printf("%s -> ", index);
            }
            index++;
        }
        System.out.println("FIM <-");
        System.out.println("Fim da aplicação");
    }
}
