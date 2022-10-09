package Exe01;

import java.util.Scanner;

public class SalarioFunc03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "";
        while (nome != "fim"){
            System.out.println("Digite seu nome: ");
            nome = leitor.nextLine();
            if (nome == "fim"){
                break;
            }
            System.out.println("Digite seu salario: ");
            int salario = leitor.nextInt();
            if (salario < 500){
                System.out.println("Infelizmente você não foi contemplado com esse aumento :(");
            } else {
                int aumento = (int) (salario * 0.2);
                System.out.println("Seu novo salario é " + (salario + aumento));
            }

        }
    }
}
