package tema2.bucles;

public class EjercicioContarNumDig {
    static void main(String[] args) {
        /*
        Pide un número por teclado y dime el número de dgitos que tiene
         */
        int num = 0;
        int contador = 0;
        num=Integer.parseInt(IO.readln("Dime un numero "));
       while (num!=0){
           num= num/10;
           contador++;
       }
        IO.println("El numero tiene " + contador);

    }
}
