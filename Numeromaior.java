package MaiorNumero;
import java.util.Scanner;
//Escreva um programa que entre com um número e o imprima caso seja maior do que 20.
public class Numeromaior {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n1;
        System.out.println("Digite um número");
        n1 = ler.nextInt();
        if(n1 > 20){
            System.out.println("O numero é maior que 20");
        }
    }
}
