package tema2;

import java.util.Locale;

public class EjercicioSwitchDias {
    public static void main(String[] args) {

        /*
            Crea un enum con los días de la semana llamado DiasSemana
            Pide por teclado un día de la semana escrito "Lunes, ...."
            Conviertélo al enum y muestra el mensaje:
            - LUNES, MARTES, MIERCOLES, JUEVES: hoy tengo Programación con Javi
            - VIERNES: hoy no tengo Programación con Javi, vaya!!!

        */
        enum DiasSemana {
            LUNES,
            MARTES,
            MIERCOLES,
            JUEVES,
            VIERNES,
            SABADO,
            DOMINGO
        }

        DiasSemana diasSemana;

        IO.println("Dime el dia de la Semana ");
        String dia = IO.readln();
        diasSemana = DiasSemana.valueOf(dia.toUpperCase());


        switch (diasSemana){
            case LUNES,MARTES,MIERCOLES,JUEVES -> IO.println("Hoy tienes programación con Javi");
            case  VIERNES-> IO.println("Hoy no tienes programacion con Javi");
            case SABADO,DOMINGO -> IO.println("No tienes clase");


        }






    }
}
