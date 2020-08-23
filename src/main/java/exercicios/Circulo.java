package exercicios;

public class Circulo {

    public double raio;
    public double pi = 3.14;

    public double calcularPerimetro (){

        return 2 * (pi * raio);
    }

    public double calcularArea (){
        return pi * (raio * raio);
    }
}
