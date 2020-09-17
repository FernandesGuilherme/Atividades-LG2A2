package Semana7_DateHora.Enumeradores;

public enum DiaSemanaEnum {
    SEGUNDA (1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADAO(6), DOMINGO(7),
    FEMININO('F'), MASCULINO ('M');
    private int valor;
    private char valor1;

    DiaSemanaEnum (int valor){
        this.valor = valor;
    }
    DiaSemanaEnum (char valor){
        this.valor1 = valor;
    }
    int getValor (){
        return valor;
    }
    char getValor1 (){
        return valor1;
    }
}
