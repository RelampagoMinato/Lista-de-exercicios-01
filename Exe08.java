import java.util.Scanner;

public class Exe08 {
    public void Exer08(Scanner leitor) {
        System.out.println("Digite um número: ");
        int a = leitor.nextInt();

        if (a >= 50) {
            System.out.println("O número digitado é maior ou igual a 50. ");
        } else {
            System.out.println("O número digitado é menor do que 50. ");
        }
    }

}
