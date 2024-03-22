import java.util.Scanner;

public class Exe06 {
    public void Exer06(Scanner leitor) {

        System.out.println("Digite a temperatura atual para ser convertida em Fahrenheit: ");
        double C = leitor.nextDouble();

        double F = (9 * C + 160) / 5;
        System.out.println("A temperatura atual corresponde a " + F + " Fahrenheit");

    }

}
