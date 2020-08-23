package exercicios;

public class Retangulo {
//Atributos
    public Double base;
    public Double altura;

    //Metodos
    public Double CalcularArea(){
        return base * altura;
    }

    public Double CalcularPerimetro(){
        return base * (base + altura);
    }

}
