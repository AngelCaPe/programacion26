package tema2.bucles;

public class EjemploPrimos2 {
    static void main(String[] args) {
        /*
        Dime cuantos primos hay em el 1 y el 100
         */
        boolean esPrimo = true;
        int numPrim=0;
        for (int contador=1; contador <=100;contador++){
            esPrimo = true;
            for (int i=2; i<contador; i++){
                if (contador %i == 0){
                    esPrimo = false;
                }
            }

        if (esPrimo){
            numPrim++;
            IO.println("El numero " + contador + " es primo");
        }else {
            IO.println("El numero " + contador + " no es primo");
        }
        IO.println("El numero de primos entre 1 y 10 son " + numPrim);
        }
    }
}
