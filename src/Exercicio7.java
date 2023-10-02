import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int idade;
        double salario;

        System.out.println("Informe a sua idade: ");
        idade = s.nextInt();
        if(idade<18){
            System.out.println("Com a sua idade não é possível fazer um consórcio!");
            //validação da idade
        }else{
            System.out.println("Informe o seu salário: ");
            salario = s.nextDouble();
            if(salario<2000.00){
                System.out.println("Com o seu salário não é possível fazer um consórcio!");
                //validação do salário
            }else{
                System.out.println("Foi possível fazer o consórcio do carro!");
            }
        }
    }
}
