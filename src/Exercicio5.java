import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        int hora, min, seg, segD;

        segD = 86400;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe que horas são: ");
        hora = s.nextInt();

        if(hora>25 || hora<0){
            System.out.println("A hora está incorreta!!!");
        }else{
            System.out.println("Informe a minutagem de agora: ");
            min = s.nextInt();
            if(min<0 || min>60){
                System.out.println("Os minutos estão incorretos!!!");
            }else if(hora==24 && min>0){
                System.out.println("Os dados estão incorretos");
            }else{
                System.out.println("Informe os segundos de agora: ");
                seg = s.nextInt();

                seg = seg+(min*60)+(3600*hora);

                System.out.println("Se passaram "+seg+" segundos a partir da meia noite!");
                System.out.println("Faltam "+(segD-seg)+" segundos para a próxima meia noite");
            }
        }
    }
}