import java.util.Scanner;

public class Exe01 {
    public void verificarNumero(Scanner scanner) {
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        if(numero > 10) {
            System.out.println("Número maior do que 10!");
        } else {
            System.out.println("Número menor ou igual a 10!");
        }
    }
}
