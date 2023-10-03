import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        int op;
        Scanner s = new Scanner(System.in);

        //menu
        System.out.println("--Sistema de fila--");
        System.out.println("1-PCD(Pessoa com Deficiência)");
        System.out.println("2-Gestante");
        System.out.println("3-Idoso(a)");
        System.out.println("4-Nenhuma das anteriores");
        op = s.nextInt();

        while(op<1 || op>4){
            //validação para caso dado seja diferente dos válidos
            System.out.println("Dado incorreto");
            System.out.println("--Sistema de fila--");
            System.out.println("1-PCD(Pessoa com Deficiência)");
            System.out.println("2-Gestante");
            System.out.println("3-Idoso(a)");
            System.out.println("4-Nenhuma das anteriores");
            op = s.nextInt();
        }

        switch (op){
            case 1:
            case 2:
            case 3:
                System.out.println("Você tem direito a fila preferencial!");
                break;
            default:
                System.out.println("Você não tem direito a fila preferencial!");
                break;
        }
    }
}
