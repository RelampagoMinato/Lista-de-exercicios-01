import java.util.Scanner;

public class Exe01 {
    public void Exercicio01(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = leitor.nextInt();
        leitor.close();

        if (numero > 10) {
            System.out.println("Número maior do que 10!");
        } else {
            System.out.println("Número menor ou igual a 10!");
        }
    }

}
