package Exe01;

import java.util.Scanner;

public class CreditosGlacticos01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do credito: ");
        float creditoGalatico = leitor.nextFloat();

        System.out.println("Digite o valor do percentual de aumento:");
        float percentual = leitor.nextFloat();

        percentual = (percentual/100);
        float valorAumento = (percentual * creditoGalatico);
        System.out.println("O valor do aumento é: " + valorAumento);

    }
}
