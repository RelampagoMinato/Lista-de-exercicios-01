import java.util.Scanner;

public class Exe03 {
    public void exer03(Scanner leitor) {
        System.out.println("Digite o valor de A:");
        int a = leitor.nextInt();

        System.out.println("Digite o valor de B:");
        int b = leitor.nextInt();

        // Verifica se os números são distintos
        if (a != b) {
            // Verifica qual número é maior
            if (a > b) {
                System.out.println("O valor de A (" + a + ") é maior que o valor de B (" + b + ").");
            } else {
                System.out.println("O valor de B (" + b + ") é maior que o valor de A (" + a + ").");
            }
        } else {
            System.out.println("A sequência de números informada é inválida, pois os números são iguais.");
        }
    }
}
