package tema2.ejerciciosRepasoUd2;

public class EjercicioC2 {
    static void main(String[] args) {
        int num=0;
        num = Integer.parseInt(IO.readln("Dime un numero "));
        boolean multiplo = false;
        IO.println("El número " + num + " es multiplo de ");
        if (num%2==0){
            IO.println("2");
            multiplo = true;
        }
        if (num%3==0){
            IO.println("3");
            multiplo = true;
        }
        if (num%5==0){
            IO.println("5");
            multiplo = true;
        }
        if (num%7==0){
            IO.println("7");
            multiplo = true;
        }
        if (!multiplo) {
            IO.println("ninguno");

        }




    }
}
