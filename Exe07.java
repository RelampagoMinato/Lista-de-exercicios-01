import java.util.Scanner;

public class Exe07 {
    public void Exer07(Scanner leitor) {
        System.out.println("Digite um número: ");
        double A = leitor.nextDouble();

        if (A >= 100 && A <= 200) {
            System.out.println("O número digitado esta entre o intervalo de 100 a 200. ");
        } else {
            System.out.println("O número digitado esta fora do intervalo de 100 a 200. ");
        }
    }

}
