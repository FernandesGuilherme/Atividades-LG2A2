//Ultima Atualização dia 22 de Agosto ás 04:12 AM


import Semana10_11_12_13_Interface.*;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//Testes na main
public class Main {
    public static void main(String[] args) {
        System.out.println();

        LocalDateTime loca = LocalDateTime.now();
        DateTimeFormatter formatandoData = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String formatarData = formatandoData.format(loca);
        System.out.println(formatarData + ".");

        System.out.println();
        Diretor diretor = new Diretor();


        Autenticavel a = new Gerente();
        a.autentica(123);

        if (a instanceof Autenticavel) {
            a.autentica(123);
        }else {
            System.err.println("A Classe Gerente não implementa Autenticavel, nenhum procedimento foi realizado");
        }

    }
}