//Ultima Atualização dia 22 de Agosto ás 04:12 AM


import Semana9_MetodosAbstrados.ControleBonificacao;
import Semana9_MetodosAbstrados.Gerente;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//Testes na main
public class Main {
    public static void main(String[] args) {
        System.out.println();

       // Locale.setDefault(Locale.ENGLISH);
        LocalDateTime loca = LocalDateTime.now();
        DateTimeFormatter formatandoData = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String formatar = formatandoData.format(loca);
        System.out.println(formatar + ".");


        System.out.println();


        Gerente gerente = new Gerente();
        ControleBonificacao controle = new ControleBonificacao();

        gerente.setNome("Guilherme");
        gerente.setSalario(10000.0);
        gerente.getbonificacao();
        gerente.setSenha(1234);
        gerente.autenticaSenha(1234);

        controle.registraGerente(gerente);
        System.out.println("Nome:" + gerente.getNome());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Bonificação: " + gerente.getbonificacao());
        System.out.println("Total: "+controle.getTotalDeBonificacoes());
        System.out.println("Salaraio + Bonificação: "+controle.salarioFInal(gerente));
    }
}