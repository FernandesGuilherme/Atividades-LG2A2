package Semana6;


import java.util.List;
import java.util.ArrayList;


public class Ator {
    private String nome;
    private  List <Papel> papeis;
    private List <Filme> filmes;

    public Ator (String nome, Papel papel){
        this.papeis = new ArrayList<>();
        this.papeis.add(papel);
        this.nome = nome;

    }
    public Ator (String nome){
        this.nome = nome;
    }

    public boolean atuouNoAno (int ano){
        return true;
    }
    public List <Filme> getFilme (){
        return  filmes;
    }

    public String getNome() {
        return nome;
    }
}
