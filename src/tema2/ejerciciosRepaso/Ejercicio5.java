package tema2.ejerciciosRepaso;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numAno;

        numAno = Integer.parseInt(IO.readln("Dime el año "));

        if (numAno % 4 == 0) {
            if (numAno % 100 == 0) {
                if (numAno % 400 == 0) {
                    IO.println("Es bisiesto.");
                } else IO.println("No es bisiesto");

            } else {
                IO.println("Es bisiesto");


            }
        }
    }
}
