package Semana5.Lista_exercicios_2;

// Implementar os métodos getters e setter nas classes , Retangulo e Circulo
public class Circulo {
    private double raio;
    private double pi = 3.14;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double calcularArea (){
        return pi * (raio * raio);

    }
    public double calcularPerimetro (){
        return 2 * (pi * raio);
    }
}
