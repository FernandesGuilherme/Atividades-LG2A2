package Semana5.Lista_exercicios_2;
// Implementar os métodos getters e setter nas classes  Retangulo e Circulo

public class Retangulo {
    private double  base ;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea(){
        return base * altura;
    }
    public double calcularPerimetro (){
        return 2 * (base + altura);
    }
}
