package tema2.bucles;

public class EjercicioClaseSuma {
    static void main(String[] args) {
        int numero;
        int contador =0;
        double suma = 0;
        double media =0;
        do{
            numero = Integer.parseInt(IO.readln("Dime el numero "));
            suma+= numero;
            contador++;



        }while (numero != 0);
        media = suma /(contador-1) ;
        IO.println("La suma es  " + suma);
        IO.println("La media es " + media);
        IO.println("El contador es " + (contador-1));
    }
}
