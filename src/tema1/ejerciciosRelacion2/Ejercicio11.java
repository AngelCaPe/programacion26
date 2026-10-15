package tema1.ejerciciosRelacion2;

public class Ejercicio11 {
   public static void main() {

       int decenas = 0, unidades = 0;
       int numero = 0, resultado = 0;

       numero = Integer.parseInt(IO.readln("Dime el numero"));
       decenas = numero / 10;
       unidades = numero % 10;
       resultado = unidades * 10 + decenas;


       IO.println("el numero es = " + resultado);



    }
}
