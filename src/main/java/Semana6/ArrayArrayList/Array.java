package Semana6.ArrayArrayList;


import java.util.List;
import java.util.ArrayList;

    public class Array {


        public static void main(String[] args) {
            //     Tipo    nome []  =  tamanho[numero]
            String palavras [] = new String[3];

            // Criando uma lista
            List <String> palavras1 = new ArrayList <String>();

            // Adcionando valores no ArrayList
            palavras1.add("Ola");
            palavras1.add("mundo");

            // Para pegar valores
            System.out.println(palavras1);
            System.out.println(palavras1.get(0));

            palavras1.size(); //Retornar a quantidade de elementos dentro do Array
            for (int i = 0; i < palavras1.size(); i ++){ // Percorre todo ArrayList .size() vai até o tamanho
                System.out.println(palavras1.get(i));// pega cada posição do array e imprime;
            }

            //Outra maneira
            for (String palavra : palavras1){ //Para cada "palavra" do ArrayList palavras faça
                System.out.println(palavra);
            }
        }
    }

