package Semana04.Lista_exercicios_1;

public class Retangulo {
    public Double base;
    public Double altura;


    public Double CalcularArea(){
        return base * altura;
    }

    public Double CalcularPerimetro(){
        return base * (base + altura);
    }

}
