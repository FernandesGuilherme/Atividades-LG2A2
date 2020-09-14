//Ultima Atualização dia 22 de Agosto ás 04:12 AM
import Semana5.Lista_exercicios_1.Retangulo;
import Semana5.Lista_exercicios_1.Circulo;

//Testes na main
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello word");
// Instanciamento dos objestos Circulo e Retangulo
        Retangulo r1 = new Retangulo();
        Circulo c1 = new Circulo ();

//Atibuição de valore
        r1.base = 7.0;
        r1.altura = 3.0;


        c1.raio = 5;
//Valor de PI já iniciado pois não é alterado
        //Chamada e impressão dos metodos (na tela o resultado)
        System.out.println(r1.CalcularArea());
        System.out.println(c1.calcularArea());

        double soma;
        soma = 2* (3.14 * 5.0);


        System.out.printf("TESTE SOMA" + soma);


    }
}