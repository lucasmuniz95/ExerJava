package Exe01;

import java.util.Scanner;

public class PrefeituraJp05 {
    public static void main(String[] args) {
        var salarioBruto= 0;
        var valorPrestacao = 0;
        var valorMaxPrest = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        salarioBruto = leitor.nextInt();

        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Quanto você quer pagar por prestação? ");
        valorPrestacao = leitor2.nextInt();

        valorMaxPrest = (30 * salarioBruto) / 100;

        if (valorPrestacao < valorMaxPrest ){
            System.out.println("Seu empréstimo foi aprovado!!!!");
        } else {
            System.out.println("Seu empréstimo foi recusado pois o valor da parcela fica acima de 30% do seu salario.");
        }
    }
}
