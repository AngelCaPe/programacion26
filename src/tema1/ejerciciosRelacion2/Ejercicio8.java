package tema1.ejerciciosRelacion2;

import com.sun.source.tree.IfTree;

public class Ejercicio8 {
    public static void main() {
    //Pide al usuario dos números y muestra la “distancia” entre ellos (el valor absoluto de su
        //diferencia, de modo que el resultado sea siempre positivo).


   int num1 = 0, num2 = 0;
   int diferencia = 0;
   num1 = Integer.parseInt(IO.readln("Dime el numero 1 "));
   num2 = Integer.parseInt(IO.readln("Dime el numero 2 "));

        if (num1>=num2) {
           diferencia = num1 - num2;
           IO.println("La diferencia es = "+ diferencia);
            // código a ejecutar si la condición es verdadera
        } else {
            diferencia = num2 - num1;
            IO.println("La diferencia es = " + diferencia);

            // código a ejecutar si la condición es falsa
        }




    }
}
