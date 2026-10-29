package tema2.ejerciciosRepasoUd2;

public class EjercicioC5 {
    static void main(String[] args) {
        int num = 0;
        do {
            num = Integer.parseInt(IO.readln("Dime un numero entre 1 y 10 "));
            if (num <1 || num>10){
                IO.println("Numero erroneo");
            }

        }while( num<1 || num>10);
        IO.println("Gracias");
    }
}
