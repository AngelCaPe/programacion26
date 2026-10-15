package tema1.ejerciciosRelacion2;

public class Ejercicio5 {
    public static void main() {

      //Calcular la media de tres números pedidos por teclado.

      double num1 = 0, num2 = 0, num3 = 0;
      double media = 0;

      num1 = Double.parseDouble(IO.readln("Dime el numero 1 "));
      num2 = Double.parseDouble(IO.readln("Dime el numero 2 "));
      num3 = Double.parseDouble(IO.readln("Dime el numero 3 "));

      media = ( num1 + num2 + num3)/3;

      System.out.printf("La media es = %.2f", media);







    }
}
