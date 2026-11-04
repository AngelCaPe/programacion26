package tema2.bucles;

public class EjercicioNumDig3 {
    static void main(String[] args) {
        int numeroTec,numero;
        int contador = 0;
        int divisor,digito = 0;
        numeroTec = Integer.parseInt(IO.readln("Dime un numero "));
        numero=numeroTec;
        while (numero != 0) {
            numero = numero / 10;
            contador++;

        }
        divisor = (int) Math.pow(10,(contador-1));
        IO.println("Tienes que dividir entre " + divisor);
        numero = numeroTec;
        while(numero>10){
            digito = numero / divisor;
            IO.println("Digito "+ digito);
            numero = numero % divisor;
            divisor = divisor /10;


        }
        IO.println("Digito " + numero);
    }
}
