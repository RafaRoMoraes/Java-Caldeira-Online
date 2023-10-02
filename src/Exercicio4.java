import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        double salarioM, salarioU, result;
        String resultS;

        salarioM = 1320;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe o seu salário atual: ");

        salarioU = s.nextInt();

        result = salarioU/salarioM;
        
        resultS = String.format("%.2f", result);
        //limitador do ponto flutuante para apenas duas casas decimais

        System.out.println("Seu salário tem "+ resultS +" salários mínimos!");
    }
}
