package Exe01;

import java.util.Scanner;

public class ParouImpar02 {
    public static void receberValores(){
        Scanner leitor = new Scanner(System.in);
        int contador = 0;
        while (contador < 10){
            System.out.println("\nDigite um numero: ");
            int numero = leitor.nextInt();
            if (numero % 2 == 0){
                System.out.println("\nÉ par!!");
            } else {
                System.out.println("\nÉ impar!!");
            }
        }
    }

    public static void main(String[] args) {
        receberValores();
    }
}
