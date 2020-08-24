package exercicios;

public class Circulo {
    public double raio;
    public double pi;

    public double calcularPerimetro (){
        pi = 3.14;
        return 2 * (pi * raio);
    }

    public double calcularArea (){
        return pi * (raio * raio);
    }
}
