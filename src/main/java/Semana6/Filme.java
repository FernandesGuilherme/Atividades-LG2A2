package Semana6;


import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private int ano;
    private List <Papel> papeis;

    public Filme (String nome, int ano, Papel papel){
        this.titulo = nome;
        this.ano = ano;
        this.papeis = new ArrayList<>();
        this.papeis.add(papel);

    }

    //Deve adicionar um novo papel na lista de papeis do filme e garantir que o filme tenha apenas um protagonista
    public  void addPapel (Ator ator, String nome, boolean protagonista){
        //   papeis.add();

    }
    //Deve retornar um lista de atores que participaram do filme
    public List<Papel> getAtores (){
        return papeis;
    }
    public String getTitulo (){
        return titulo;
    }

}
