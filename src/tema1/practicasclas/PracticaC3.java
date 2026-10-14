package tema1.practicasclas;

public class PracticaC3 {
    public static void main() {

        int minimo = 1;
        int maximo = 6;

        int n = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
        IO.println(n);

    }
}
