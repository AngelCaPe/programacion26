package tema3.arrays;

public class EjercicioA1 {

    static int media(int n, int m){
        return n/m;
    }
    static void main(String[] args) {
        int[] numero = new int[10];
        int suma=0,media=0;
        int mayor=Integer.MIN_VALUE,menor=Integer.MAX_VALUE;
        for (int i =0;i<numero.length;i++){
            numero[i]= Integer.parseInt(IO.readln("Dime un numero "));
            suma+= numero[i];
            if (numero[i] > mayor) {
                mayor = numero[i];
            }
            if (numero[i] < menor) {
                menor = numero[i];
            }

        }
        media=media(suma, numero.length);
        IO.println("La media es " +media);
        IO.println("El numero mayor es "+ mayor);
        IO.println("El numero menor es " + menor);
    }
}
