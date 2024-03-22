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

        // Fechando o scanner após o uso
        leitor.close();
    }
}
