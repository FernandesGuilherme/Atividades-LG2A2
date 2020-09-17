package Semana7_DateHora;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DataHoraFormatacao {
    public static void main(String[] args) {
        //DateTimeFormat
        // Locale.setDefault(Locale.US);  Aqui eu consigo definir a localidade do horario

        //DateTimeFormatter Formate  = DateTimeFormatter.ISO_DATE;

        //Tipos de formatação para mostrat para usuario                Formata DATA ofLocalizedDate
        DateTimeFormatter DataComBarra = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter  nomeCompleto  = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter  SemNomeSemana = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter  Abr  = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        //Formatar com hora ofLocalizedDateTime
        DateTimeFormatter  Abreviacao  = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);


        ZonedDateTime ztime = ZonedDateTime.now();
        LocalDateTime local = LocalDateTime.now();

        String format = DataComBarra.format(local);
        String nome = nomeCompleto.format(local);
        String teste = SemNomeSemana.format(local);
        String e = Abr.format(local);
        String zonet = Abreviacao.format(ztime);


        System.out.println(format);
        System.out.println(nome);
        System.out.println(teste);
        System.out.println(e);
        System.out.println(zonet);

        DateTimeFormatter  escolherPadrao = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // Aqui eu defino o padrao da formatação
        String Escolher = escolherPadrao.format(local);
        System.out.println("com padrao " + Escolher);



    }

}
