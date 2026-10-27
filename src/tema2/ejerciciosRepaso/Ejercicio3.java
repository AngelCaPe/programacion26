package tema2.ejerciciosRepaso;

public class Ejercicio3 {
   public static void main(String[] args) {

       int num1,num2,num3;

       num1 = Integer.parseInt(IO.readln("Dime el numero 1"));
       num2 = Integer.parseInt(IO.readln("dime el numero 2"));


       if (num2 != 0){
           IO.println(num1 + "/" + num2 + "=" + (num1/num2));


       }else {
           IO.println("AVisooo");
       }

    }
}
