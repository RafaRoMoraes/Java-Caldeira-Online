import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        int numM, numMn;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");

        int num1 = s.nextInt();

        System.out.println("Informe o segundo número:");

        int num2 = s.nextInt();

        System.out.println("Informe o terceiro número:");

        int num3 = s.nextInt();

        if(num1>num2 && num1>num3){
            numM = num1;
        }else if(num2>num1 && num2>num3){
                numM = num2;
        }else{
            numM = num3;
        }
        //localizador do maior número

        if(num1<num2 && num1<num3){
            numMn = num1;
        }else if(num2<num1 && num2<num3){
            numMn = num2;
        }else{
            numMn = num3;
        }
        //localizador do menor número

        System.out.println("O maior número é "+numM);
        System.out.println("O menor número é "+numMn);
        System.out.println("A média aritmética é "+ ((num1+num2+num3)/3));
        //média feita diretamente sem usar variável
    }
}
