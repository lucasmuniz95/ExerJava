package Exe01;

import java.util.List;
import java.util.ArrayList;

public class Pacientes {
    String nome;

    char sexo;

    int idade;

    double peso;
    double altura;

    public Pacientes(String _nome, char _sexo, double _peso, int _idade, double _altura){
        nome = _nome;
        sexo = _sexo;
        peso = _peso;
        idade = _idade;
        altura = _altura;
    }

    public static int media_idade_homens(List<Pacientes> pacientes){
        int media = 0;
        int quantidade = 0;

        for(Pacientes homens : pacientes){
            if(homens.sexo == 'm'){
                quantidade++;
                media += homens.idade;
            }
        }
        return (media / quantidade);
    }

    public static int quantidade_mulheres_altura_peso(List<Pacientes> pacientes){
        int quantidade = 0;

        for(Pacientes mulheres : pacientes){
            if(mulheres.sexo == 'f'){
                if((mulheres.altura >= 1.60 && mulheres.altura <= 1.70) && mulheres.peso > 70){
                    quantidade++;
                }
            }
        }
        return quantidade;
    }

    public static int pessoas_idade_entre_18_25(List<Pacientes> pacientes){
        int quantidade = 0;

        for(Pacientes pessoa : pacientes){
            if(pessoa.idade >= 18 && pessoa.idade <= 25){
                quantidade++;
            }
        }
        return quantidade;
    }

    public static String paciente_mais_velho(List<Pacientes> pacientes){
        Pacientes anciao = new Pacientes("", 'm', 0, 0, 0);


        for(Pacientes pessoa : pacientes){
            if(anciao.idade < pessoa.idade){
                anciao = pessoa;
            }
        }
        return anciao.nome;
    }

    public static String mulher_mais_baixa(List<Pacientes> pacientes){
        Pacientes baixinha = new Pacientes("", 'f', 0, 0, 2.00);

        for(Pacientes pessoa : pacientes){
            if(pessoa.sexo == 'f'){
                if(pessoa.altura < baixinha.altura){
                    baixinha = pessoa;
                }
            }
        }
        return baixinha.nome;
    }


    public static void main(String[] args){
        List<Pacientes> pacientes = new ArrayList<Pacientes>();

        pacientes.add( new Pacientes("Gustavo Muniz", 'm', 110.8, 55, 1.90) );
        pacientes.add( new Pacientes("Elaine Pereira", 'f', 70, 40, 1.65) );
        pacientes.add( new Pacientes("Lucas Muniz", 'm', 80, 60, 1.70) );
        pacientes.add( new Pacientes("Luana Muniz", 'f', 60, 70, 1.67) );
        pacientes.add( new Pacientes("Fabiola Muniz", 'f', 50, 20, 1.55) );
        pacientes.add( new Pacientes("Jefferson Muniz", 'm', 75, 79, 1.85) );

        System.out.println("Quantidade de pacientes = " + pacientes.size());

        System.out.println("A media de idade dos homens = " + media_idade_homens(pacientes));

        System.out.println("A quantidade de mulheres com altura entre 1.60 e 1.70 e peso maior que 70Kg = " + quantidade_mulheres_altura_peso(pacientes));

        System.out.println("A quantidade de pessoas com idade entre 18 e 25 = " + pessoas_idade_entre_18_25(pacientes));

        System.out.println("O nome do paciente mais velho = " + paciente_mais_velho(pacientes));

        System.out.println("O nome da mulher mais baixa = " + mulher_mais_baixa(pacientes));

    }

}