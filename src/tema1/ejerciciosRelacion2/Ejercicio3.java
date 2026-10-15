package tema1.ejerciciosRelacion2;

public class Ejercicio3 {
    public static void main() {

        // Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.


        double a=3, b=5;
        double suma = 0, resta = 0, multiplicacion = 0, division = 0;

        suma = a + b;
        resta = a - b;
        multiplicacion = a * b;
        division = a / b;

        IO.println("El resultado de la suma es = " + suma + " , de la resta = "+ resta +
                " , de la multiplicacion  = " + multiplicacion + " y de la division = " + division );

    }
}
