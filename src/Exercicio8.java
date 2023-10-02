import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        String op;
        Scanner s = new Scanner(System.in);

        System.out.println("Informe se você é PCD, gestante, idoso: ");
        op = s.nextLine().toLowerCase();
        //leitor e conversor para caixa baixa

        if(op.contains("pcd") || op.contains("gestante") || op.contains("idos")){
            System.out.println("Você tem direito à fila preferencial!");
        }else{
            System.out.println("Você pertence à fila normal!");
        }
    }
}
