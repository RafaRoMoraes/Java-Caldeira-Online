import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe um número:");

        int num1 = s.nextInt();

        System.out.println("Informe outro número:");

        int num2 = s.nextInt();

        System.out.println("O primeiro número informado foi "+num1+" e o segundo numero foi "+num2);
    }
}
