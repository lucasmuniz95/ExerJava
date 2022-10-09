package Exe01;

import java.util.Scanner;
public class Gasolina04 {
    public static void main(String[] args) {
        Scanner gasolina = new Scanner(System.in);
        System.out.println("Informe o total de litros de gasolina para abastecimento: ");
        float litragem_gasolina = gasolina.nextFloat();
        double preco_gasolina = 2.5;
        double abastecimento = (double)litragem_gasolina * preco_gasolina;
        int num_refri = 2;
        int preco_refri = 3;
        int total_refri = num_refri * preco_refri;
        double total = (double)total_refri + abastecimento;
        System.out.println("Total litros gasolina: " + litragem_gasolina);
        System.out.println("Valor do litro: " + preco_gasolina);
        System.out.println("Total abastecimento: " + abastecimento);
        System.out.println("Unidades de refrigerante: " + num_refri);
        System.out.println("Valor unitário: R$ " + preco_refri);
        System.out.println("Valor total de bebidas: R$ " + total_refri);
        System.out.println("Valor final: R$ " + total);
    }
}
