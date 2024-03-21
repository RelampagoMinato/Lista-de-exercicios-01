import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        // Instanciando um Scanner para ser compartilhado entre os métodos
        Scanner leitor = new Scanner(System.in);

        // Instanciando Exe01
        Exe01 exe01 = new Exe01();
        exe01.verificarNumero(leitor);

        // Instanciando Exe02
        Exe02 exe02 = new Exe02();
        exe02.somarNumeros(leitor);

        // Instanciando Exe03
        Exe03 exe03 = new Exe03();
        exe03.exer03(leitor);

        // Fechando o scanner após o uso
        leitor.close();
    }
}
