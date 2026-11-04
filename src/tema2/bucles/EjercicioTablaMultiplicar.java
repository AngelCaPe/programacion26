package tema2.bucles;

public class EjercicioTablaMultiplicar {
    static void main(String[] args) {
        /*
        Pedir un numero por teclado y mostrar su tabla de multiplicar
         */

        int num =0;
        num= Integer.parseInt(IO.readln("Dime un numero "));
        for (int i=1;i<=10;i++){
            IO.println(num + "*" + i +" = " +(num*i));


        }
    }
}
