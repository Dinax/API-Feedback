package br.feedback.dominio;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Classe: Calendario 
 * Função: Fornecer data e hora atual
 *
 * @date 26/05/2016
 * @author Dinax
 * @version 2.1
 */
public class Calendario {

    Calendar calendar = new GregorianCalendar();
    Date date = new Date();

    /**
     * Método que recupera o Dia.
     * @return String de dia.
     */
    public String dataDia() {
        Calendar.getInstance();
        calendar.getTime();
        int dia;
        dia = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(dia);
        return String.valueOf(dia);
    }

    /**
     * Método que recupera o Mes.
     * @return String de Mes.
     */
    public String dataMes() {
        Calendar.getInstance();
        calendar.getTime();
        int mes;
        mes = 1 + calendar.get(Calendar.MONTH);
        System.out.println(mes);
        return String.valueOf(mes);
    }

    /**
     * Método que recupera o Ano.
     * @return String de Ano.
     */
    public String dataAno() {
        Calendar.getInstance();
        calendar.getTime();
        int ano;
        ano = calendar.get(Calendar.YEAR);
        System.out.println(ano);
        return String.valueOf(ano);
    }

    /**
     * Método que recupera a Hora.
     * @return String de Hora.
     */
    public String tempoHora() {
        Calendar.getInstance();
        calendar.getTime();
        int hora;
        hora = calendar.get(Calendar.HOUR);
        System.out.println(hora);
        return String.valueOf(hora);
    }

    /**
     * Método que recupera o Minuto.
     * @return String de Minuto.
     */
    public String tempoMinuto() {
        Calendar.getInstance();
        calendar.getTime();
        int minuto;
        minuto = calendar.get(Calendar.MINUTE);
        System.out.println(minuto);
        return String.valueOf(minuto);
    }

    /**
     * Método que recupera o Segundo.
     * @return String de Segundo.
     */
    public String tempoSegundo() {
        Calendar.getInstance();
        calendar.getTime();
        int segundo;
        segundo = calendar.get(Calendar.YEAR);
        System.out.println(segundo);
        return String.valueOf(segundo);
    }

    /**
     * Método que recupera a Data.
     * @return String de Data.
     */
    public Date dataData() {
        Calendar.getInstance();
        date = calendar.getTime();
        DateFormat f = DateFormat.getDateInstance();
        System.out.println(f.format(date));
        return date;
    }

    /**
     * Método que recupera o Data Completa.
     * @return String de Data Completa.
     */
    public Date tempoDataCompleta() {
        Calendar.getInstance();
        date = calendar.getTime();
        DateFormat f = DateFormat.getDateTimeInstance();
        System.out.println(f.format(date));
        return date;
    }
    
   
}
