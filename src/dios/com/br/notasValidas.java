package dios.com.br;
import java.util.Scanner;
public class notasValidas {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double nota;
        System.out.print("Insira uma nota em 0 e 10: ");
        nota = scan.nextDouble();

        while(nota < 0 || nota > 10  ){

            System.out.print("VALOR INVÁLIDO! Insira um valor válido entre 0 e 10: ");
            nota = scan.nextDouble();
        }

        System.out.print("Nota digitada: " + nota);

    }
}
