package Exe01;

import java.util.Scanner;

public class Pousada07 {
    public static void main(String[] args) {
        boolean cadastro_cliente = true;
        int valor_diaria = 40;
        int total = 0;

        while (cadastro_cliente) {
            Scanner ficha = new Scanner(System.in);
            System.out.print("Nome do hóspede: ");
            String nome = ficha.next();
            System.out.print("Diárias: ");
            float diaria = ficha.nextFloat();
            float conta;
            if (diaria < 10.0F) {
                conta = diaria * (float) valor_diaria + diaria * 15.0F;
                total = (int) ((float) total + conta);
                System.out.println("Valor da hospedagem: R$ " + conta);
            } else {
                conta = diaria * (float) valor_diaria + diaria * 8.0F;
                total = (int) ((float) total + conta);
                System.out.println("Valor da hospedagem: R$ " + conta);
            }

            Scanner cadastrar = new Scanner(System.in);
            System.out.println("Deseja cadastrar outro hóspede? Digite 'SIM' para cotinuar  ou 'NAO' para finalizar o programa: ");
            String novo = cadastrar.next();
            if (novo.equals("SIM".toUpperCase())) {
                cadastro_cliente = true;
            } else {
                cadastro_cliente = false;
                System.out.println("Total arrecadado pela pousada: R$ " + total);
                System.out.println("Programa finalizado");
            }
        }
    }
}

