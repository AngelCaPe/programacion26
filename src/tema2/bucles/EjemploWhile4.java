package tema2.bucles;

public class EjemploWhile4 {
    static void main(String[] args) {
        int dado =0;
        int tirada =20;
        while (tirada>0) {
            dado = (int) (Math.random() * (20 - 1 + 1) + 1);
            IO.println(dado);
            tirada--;
        }
    }
}
