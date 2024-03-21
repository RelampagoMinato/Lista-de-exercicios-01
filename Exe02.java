import java.util.Scanner;

public class Exe02 {
    public void somarNumeros(Scanner scanner) {
        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        System.out.println("A soma dos números é: " + soma);
    }
}
