package tema1.ejerciciosRelacion2;

public class Ejercicio4 {
    public static void main() {
    //Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.

     double tempCelsius = 0, tempFar = 0;

      tempFar =Double.parseDouble(IO.readln("Dime que temperatura en Farenheint tienes ")) ;
      tempCelsius = (tempFar - 32 ) * 5/9;
      System.out.printf("Tu temperatura en Celsius es = %.2f", tempCelsius);



    }
}
