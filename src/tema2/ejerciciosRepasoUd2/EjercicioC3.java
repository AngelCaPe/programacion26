package tema2.ejerciciosRepasoUd2;

public class EjercicioC3 {
    static void main(String[] args) {
        int num = 0;
        num = Integer.parseInt(IO.readln("Dime un numero "));
        switch (num){
            case 1 -> IO.println("uno");
            case 2 -> IO.println("dos");
            case 3 -> IO.println("tres");
            case 4 -> IO.println("cuatro");
            case 5 -> IO.println("cinco");
            case 6 -> IO.println("seis");
            case 7 -> IO.println("siete");
            case 8 -> IO.println("ocho");
            case 9 -> IO.println("nueve");
            default -> IO.println("No es un numero de un digito");

        }
    }
}
