package Semana6;


import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private int ano;
    private List<Ator> papeis;
    private  Ator atores;

    public Filme (String nome,String titulo ,int ano){
        this.titulo = titulo;
        this.ano = ano;
        this.papeis = new ArrayList<Ator>();
    }

    //Deve adicionar um novo papel na lista de papeis do filme e garantir que o filme tenha apenas um protagonista
    public  void addPapel (Ator ator, Boolean nome, boolean protagonista){
           papeis.add(ator);


    }
    //Deve retornar um lista de atores que participaram do filme
    public List<Ator> getAtores (){
        return papeis;
    }
    public String getTitulo (){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<Ator> getPapeis() {
        return papeis;
    }

    public void setPapeis(List<Ator> papeis) {
        this.papeis = papeis;
    }
}
