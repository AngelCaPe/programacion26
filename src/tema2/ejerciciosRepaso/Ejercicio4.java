package tema2.ejerciciosRepaso;

public class Ejercicio4 {
   public static void main(String[] args) {
        int num1,num2;

        num1 = Integer.parseInt(IO.readln("Dime la base "));
        num2 = Integer.parseInt(IO.readln("Dime el exponente "));

        if (num2 >=1){
            IO.println(num1 + "elevado " + num2 + "=" + (Math.pow(num1,num2)) );
        } else if (num2 == 0 ) {
            IO.println("El resultado es 1");

        } else {
            IO.println("El resultado es " + (1/(Math.pow(num1,-num2))));
            
        }


   }
}
