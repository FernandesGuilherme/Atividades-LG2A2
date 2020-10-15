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
        this.papeis = new ArrayList<>();
    }
    public boolean atuouNoAno(int ano){
        for(Papel papel : this.papeis){
            if (papel.getFilme().getAno() == ano)
                return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }
    public void addPapel(Papel papel) {
        this.papeis.add(papel);
    }
    public List<Filme> getFilmes(){
        List<Filme> lista = new ArrayList<>();
        for(Papel papel : this.papeis) {
            if(papel.getAtor() == this.papeis)
                lista.add(papel.getFilme());
        }
        return lista;
    }

}
