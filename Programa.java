import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        // Instanciando um Scanner para ser compartilhado entre os métodos
        Scanner scanner = new Scanner(System.in);

        // Instanciando Exe01
        Exe01 exe01 = new Exe01();
        exe01.verificarNumero(scanner);

        // Instanciando Exe02
        Exe02 exe02 = new Exe02();
        exe02.somarNumeros(scanner);

        // Fechando o scanner após o uso
        scanner.close();
    }
}
