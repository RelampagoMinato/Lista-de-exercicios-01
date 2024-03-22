import java.util.Scanner;

public class Exe05 {
    public void Exer05(Scanner leitor) {
        System.out.println("Digite uma variável A: ");
        int numeroA = leitor.nextInt();

        System.out.println("Digite outra variável B: ");
        int numeroB = leitor.nextInt();

        int novoB = numeroA;
        int novoA = numeroB;

        System.out.println("A variável A é: " + numeroA);
        System.out.println("A variável B é: " + numeroB);
        System.out.println("A variável A com valor trocado é: " + novoA);
        System.out.println("A variável A com valor trocado é: " + novoB);

    }

}
