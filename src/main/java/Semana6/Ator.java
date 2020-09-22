package Semana6;


import java.util.List;
import java.util.ArrayList;


public class Ator {
    private String nome;
    private  List <Papel> papeis;
    private List <Filme> filmes;
    private Filme filme;

    public Ator (String nome){
        this.nome = nome;

    }

    public boolean atuouNoAno (int ano){
        if (filme.getAno() == ano){
            return true;
        }else{
            return false;
        }
    }

    public List <Filme> getFilme (){
        return  filmes;
    }

    public String getNome() {
        return nome;
    }
}
