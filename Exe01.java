import java.util.Scanner;

public class Exe01 {
    public void verificarNumero(Scanner leitor) {
        System.out.println("Digite um número:");
        int numero = leitor.nextInt();

        if(numero > 10) {
            System.out.println("Número maior do que 10!");
        } else {
            System.out.println("Número menor ou igual a 10!");
        }
    }
}
