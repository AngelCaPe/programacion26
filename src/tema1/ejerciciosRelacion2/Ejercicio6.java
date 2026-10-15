package tema1.ejerciciosRelacion2;

public class Ejercicio6 {
    public static void main() {

        //Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas
        //horas y minutos corresponde.

        int min =0, horas=0;

        min = Integer.parseInt(IO.readln("Dime los minutos "));
        horas = min /60;
        min = min % 60;
        IO.println( "Son " + horas + " horas y " + min + " minutos");

    }
}
