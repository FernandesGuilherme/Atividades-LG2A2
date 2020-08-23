package exercicios;

public class Circulo {
//Atributos
    public double raio;
    public double pi = 3.14;
// metodos de calculos
    public double calcularPerimetro (){

        return 2 * (pi * raio);
    }

    public double calcularArea (){
        return pi * (raio * raio);
    }
}
