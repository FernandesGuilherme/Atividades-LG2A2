package Semana7_DateHora;

import java.time.*;

public class DataHora {
    public static void main(String[] args) {
        // LocalDate - representa uma data 06/08/1990
        LocalDate ldnow = LocalDate.now();
        System.out.println(ldnow);
        LocalDate criandoData = LocalDate.of(2020, Month.AUGUST,9); // Possivel criar Datas com .of()
        System.out.println(criandoData);

        // É possível somar dia/meses/semanas da data atual

        System.out.println(ldnow.plusDays(1));     // Somando um dia
        System.out.println(ldnow.plusMonths(1));  // Somando um mês
        System.out.println(ldnow.plusWeeks(1));  // Somando uma semana
        System.out.println(ldnow.plusYears(1)); // Somando um ano

        System.out.println(ldnow.minusDays(1));// Subtrai menos um dia, metodos iguais ao de soma

        //As clases de datas são imutaveiss, sempre que alterar, adicionar em uma variável e imprimir a nova variável se quiser visualizar o novo resultado de soma

        System.out.println();
        System.out.println();



        // LocalTime - representa uma hora 11:40:00
        LocalTime lcnow = LocalTime.now();
        System.out.println(lcnow);

        // LocalDateTime - representa Data e Hora  06/08/1990 11:40:00; Representa a hora local em todo lugar do mundo
        LocalDateTime lcdt = LocalDateTime.now();
        System.out.println(lcdt);
        LocalDateTime criarNovo = LocalDateTime.of(criandoData,lcnow); // Possível passar datas "Instanciadas" como parametros


        // (GMT UTC) Instant - representa momento na linha do tempo milesegundos apartar de Jan de 70
        Instant inow = Instant.now();
        System.out.println(inow);
        Instant teste = Instant.ofEpochMilli(200000); // Quantidade de milisegundos desde 70

        // ZonedDateTime - representa LocalDateTime + Time Zone (fuso horario) 06/08/1990 11:40:00 gm3 3 (America São Paulo)

        ZonedDateTime zdtn = ZonedDateTime.now();
        System.out.println(zdtn);

        //Para criar
        ZonedDateTime zone = ZonedDateTime.of(criarNovo, ZoneId.systemDefault()); // Recebe direto LocalDateTime e o fuso horario padrao do PC

        System.out.println(zone);


    }
}

