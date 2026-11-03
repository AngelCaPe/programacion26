package tema2.bucles;

public class EjemploPrimos {
    static void main(String[] args) {
        int numero= 11;
        boolean esPrimo = true;
        for (int i=2; i<numero; i++){
            if (numero %i == 0){
                esPrimo = false;
            }
        }
        if (esPrimo){
            IO.println("El numero " + numero + " es primo");
        }else {
            IO.println("El numero " + numero + " no es primo");
        }
    }
}
