import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        int idade;
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a sua idade: ");
        idade = s.nextInt();

        if(idade<16){
            System.out.println("Não é possível votar");
        }else if(idade<18 || idade>65){
            System.out.println("O seu voto é facultativo");
        }else{
            System.out.println("O seu voto é obrigatório");
        }
        //validação da idade
    }
}
