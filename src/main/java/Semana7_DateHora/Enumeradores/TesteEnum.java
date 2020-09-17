package Semana7_DateHora.Enumeradores;

public class TesteEnum {
    public static void main(String[] args) {
      /*
        usandoConstantes();
        System.out.println();
        usandoEnum();


        //USANDO ENUM COM CONSTRUTOR
        DiaSemanaEnum dia  =   DiaSemanaEnum.DOMINGO;
        DiaSemanaEnum sexo =   DiaSemanaEnum.FEMININO;
        System.out.println(dia.toString() + " " + dia.getValor());
        System.out.printf(sexo + " " + sexo.getValor1());
        System.out.println();
    */
        //Maneiras de obter valores de dentro de um enumerador VALEU() & VALUEOF()
        DiaSemana[] dias = DiaSemana.values(); //Pega os calores conteudos do array
        for (int i = 0; i <dias.length; i ++){
            System.out.println(dias [i]);
        }

        System.out.println();

        for (DiaSemana dia : DiaSemana.values())
            System.out.println(dia);

        DiaSemana dia;


        //    System.out.printf(Enum.valueOf(DiaSemana.class, "DOMINGO"));

    }

    //Com consstantes é possivel alterar o valor do dia da semana pois é um tipo inteiro (int)
    private static void usandoConstantes() {
        int segunda = DiaSemanaConstante.SEGUNDA;
        int terca = DiaSemanaConstante.TERCA;
        int quarta = DiaSemanaConstante.QUARTA;
        int quinta = DiaSemanaConstante.QUINTA;
        int sexta = DiaSemanaConstante.SEXTA;
        int sabado = DiaSemanaConstante.SABADO;
        int domingo = DiaSemanaConstante.DOMINGO;

        System.out.printf("Usando constante");
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }

    private static void imprimeDiaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }


    //Com enum, os valores não podem ser atualizados pois são do tipo DiaSemana (enum declarada), e são fixos
    private static void usandoEnum() {
        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;

        System.out.println("Usando ENUM");

        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }

    //O método de impressão deve recever o tipo da Enum e uma variavel (declaração comum sem palavras reservadas (int, String e etc))
    private static void imprimeDiaSemana(DiaSemana dia) {
        switch (dia) {
            case SEGUNDA:
                System.out.println("Segunda");
                break;
            case TERCA:
                System.out.println("Terça");
                break;
            case QUARTA:
                System.out.println("Quarta");
                break;
            case QUINTA:
                System.out.println("Quinta");
                break;
            case SEXTA:
                System.out.println("Sexta");
                break;
            case SABADO:
                System.out.println("Sabado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }
}
