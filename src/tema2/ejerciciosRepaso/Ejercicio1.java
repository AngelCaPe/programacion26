package tema2.ejerciciosRepaso;

public class Ejercicio1 {
    public static void main(String[] args) {

        int num1,num2;

        num1= Integer.parseInt(IO.readln("dime el numero 1"));
        num2= Integer.parseInt(IO.readln("dime numero 2"));

        if (num1>=num2){
            IO.println("El " +"numero mayor es = "+ num1);

        } else {
            IO.println("El " +"numero mayor es = "+ num2);
        }

    }
}
