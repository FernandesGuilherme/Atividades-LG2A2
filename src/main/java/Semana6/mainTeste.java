package Semana6;

public class mainTeste {
    public static void main(String[] args) {
        Ator ator = new Ator("Chadwick Boseman");
        Filme filme = new Filme("Pantera negra", " ", 2019);
        Papel papel = new Papel("Pantera negra", true, ator);

        filme.addPapel(ator,true, true);

        System.out.println(ator.getNome());
        System.out.println(ator.getFilme().);


    }
}
