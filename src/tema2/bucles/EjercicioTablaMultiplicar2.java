package tema2.bucles;

public class EjercicioTablaMultiplicar2 {
    static void main(String[] args) {
        int num = 0;

        for (num = 1; num <= 10; num++){
            for (int i = 1; i <= 10; i++) {
                IO.println(num + "*" + i + " = " + (num * i));
            }
    }
    }
}
