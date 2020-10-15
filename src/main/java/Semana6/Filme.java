package Semana6;


import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private int ano;
    private List<Papel> papeis;
    private  Ator atores;

    public Filme (String nome,String titulo ,int ano){
        this.titulo = titulo;
        this.ano = ano;
        this.papeis = new ArrayList<Papel>();
    }

    public  void addPapel (Ator ator, String nome, boolean protagonista){
        boolean pro = false;
        for(Papel papel : this.papeis) {
            if (papel.isProtagonista())
                pro= true;
        }
        if(pro == true) {
            throw new IllegalArgumentException("Existe um protagonista.");
        } else {
            Papel novoPapel = new Papel(nome,protagonista,ator);
            this.papeis.add(novoPapel);
        }

    }
    public List<Ator> getAtores (){
        List<Ator> lista = new ArrayList<>();
        for(Papel papel : this.papeis) {
            lista.add(papel.getAtor());
        }
        return lista;
    }

    public Ator getProtagonista(){
        for(Papel papel : this.papeis) {
            if (papel.isProtagonista())
                return papel.getAtor();
        }
        return null;
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

    public List<Papel> getPapeis() {
        return papeis;
    }
    public void setPapeis(List<Papel> papeis) {
        this.papeis = papeis;
    }
}
