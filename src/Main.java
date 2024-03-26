import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Character char01 = 'A';

        while(char01 <= 'Z'){
            System.out.println(char01);
            char01++;
        }
        System.out.println("-------------------------------------------");
        int num = 2;
        int exponente = 0;
        while (exponente <= 9) {
            System.out.println("2 elevado a la "+exponente+" es igual a: " +Math.pow(num,exponente));
            exponente++;
        }
        System.out.println("-------------------------------------------");

        String letraOculta = "C";
        String letraIngresada = "null";

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Adivine la letra\n");
            letraIngresada = input.next();
        } while (!letraIngresada.equalsIgnoreCase(letraOculta));
        System.out.println("Genial! Adivinó la letra y esta era la: "+letraOculta );

    }
}