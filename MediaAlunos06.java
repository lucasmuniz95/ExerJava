package Exe01;

import java.util.Scanner;

public class MediaAlunos06 {
    public static void main(String[] args) {
        int aluno = 1;
        int aprovados = 0;
        int exame = 0;
        int reprovados = 0;
        int classe_media = 0;
        int total_aluno = 0;
        int total = 0;

        for(int i = 0; i < 6; ++i) {
            Scanner nota = new Scanner(System.in);
            int var10001 = aluno++;
            System.out.println("Aluno: " + var10001);
            System.out.println("Primeira nota: ");
            float nota1 = nota.nextFloat();
            System.out.println("Segunda nota: ");
            float nota2 = nota.nextFloat();
            float media = (nota1 + nota2) / 2.0F;
            System.out.println("Média: " + media);
            classe_media = (int)((float)classe_media + nota1 + nota2);
            ++total_aluno;
            int media_alunos = classe_media / total_aluno;
            total = media_alunos;
            if (media < 3.0F) {
                System.out.println("Reprovado");
                ++reprovados;
            } else if (media >= 3.0F & media <= 7.0F) {
                System.out.println("Exame");
                ++exame;
            } else {
                System.out.println("Aprovado");
                ++aprovados;
            }
        }

        System.out.println("Total alunos aprovados: " + aprovados);
        System.out.println("Total alunos reprovados: " + reprovados);
        System.out.println("Total alunos em exame: " + exame);
        System.out.println("Médida da classe: " + total);
    }
}
