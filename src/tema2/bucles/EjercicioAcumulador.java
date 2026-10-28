package tema2.bucles;

public class EjercicioAcumulador {
    static void main(String[] args) {
        // Suma todos los numeros pares del 0 al 1000

        int suma= 0;
        for (int num=0;num<=1000;num++){
            if (num % 2==0){
                suma += num;
            }
        }
        IO.println(suma);
    }
}
