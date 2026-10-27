package tema2.bucles;

public class EjercicioWhile5 {
    static void main(String[] args) {
        String palabra="";
        while(!palabra.equals("peligo")){
            palabra = IO.readln("Dime una palabra");
        }
    }
}
