package Semana7_DateHora;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DataHora_PeriodDuration {
    public static void main(String[] args) {
        /* Period e Duration servem para armazenar um período de tempo
           UAramzena valores baseados em data outro em hora respectivamente
        */

        Period pegandoPeriodo = Period.of(1,5,3); // Imprime periodo de dia,mes e ano
        Period  pegandoDia = Period.ofDays(5); // Imprime periodo de 5M (5 dias)
        Period  pegandoMes = Period.ofMonths(5); // Imprime periodo de 5M (5 meses)
        Period  pegandoSemana = Period.ofWeeks(5);// Imprime periodo de 5M (5 Anos)


        System.out.println(pegandoPeriodo);
        System.out.println(pegandoDia);
        System.out.println(pegandoMes);
        System.out.println(pegandoSemana);


        LocalDate ldnow = LocalDate.now();
        System.out.println(ldnow);
        LocalDate criandoData = LocalDate.of(2020, Month.JANUARY,9); // Possivel criar Datas com .of()
        System.out.println(criandoData);

        Period calculandoPeriodoEntreDuasDatas = Period.between(ldnow,criandoData);
        Period until = ldnow.until(criandoData); //Faz a mesa coisa;

        LocalDate plus = ldnow.plus(pegandoDia);//Soma cinco dias na data do LocalDate
        System.out.println(calculandoPeriodoEntreDuasDatas);


        //Metodo Para Calcular data exata
        LocalDate anoNasc = LocalDate.of(1998,7,2);
        LocalDate hoje = LocalDate.now();

        Period calcularIdade = Period.between(anoNasc,hoje);

// Nada Relacionado a LocalDate somente Time
        Duration duracaoHoraDia = Duration.ofDays(1); // Pega duração de horas da quantidades de dia
        Duration duracaoHora = Duration.ofHours(1);
        Duration duracaoMinutos = Duration.ofMinutes(1);
        Duration duracaoSegundos = Duration.ofSeconds(1);





        System.out.println("Hora "+ duracaoHora);
        System.out.println(duracaoHoraDia);
        System.out.println(calcularIdade);


    }
}

