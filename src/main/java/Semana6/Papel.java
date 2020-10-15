package Semana6;

public class Papel {
    private String nome;
    private boolean protagonista;
    private Ator ator;
    private Filme filme;


    public Papel(String nome, boolean protagonista, Ator ator, Filme filme) {
        this.nome = nome;
        this.protagonista = protagonista;
        this.ator = ator;
        this.filme = filme;
    }
    public Papel(String nome, boolean protagonista, Ator ator) {
        this.nome = nome;
        this.protagonista = protagonista;
        this.ator = ator;

    }
    public Ator ator (){
        return ator;
    }
    public Filme filme (){
        return  filme;
    }
    public String getNome (){
        return nome;
    }

    public Filme getFilme() {
        return filme;
    }

    public Ator getAtor() {
        return ator;
    }

    public boolean isProtagonista() {
        return protagonista;
    }

    public void setProtagonista(boolean protagonista) {
        this.protagonista = protagonista;
    }
}
