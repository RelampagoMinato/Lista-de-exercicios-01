import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Exe01 exe01 = new Exe01();
        exe01.verificarNumero(leitor);

        Exe02 exe02 = new Exe02();
        exe02.somarNumeros(leitor);

        Exe03 exe03 = new Exe03();
        exe03.exer03(leitor);

        Exe04 exe04 = new Exe04();
        exe04.calcularOperacoes(leitor);

        Exe05 exe05 = new Exe05();
        exe05.Exer05(leitor);

        Exe06 exe06 = new Exe06();
        exe06.Exer06(leitor);

        Exe07 exe07 = new Exe07();
        exe07.Exer07(leitor);

        leitor.close();
    }
}
