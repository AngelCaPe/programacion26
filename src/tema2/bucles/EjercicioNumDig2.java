package tema2.bucles;

public class EjercicioNumDig2 {
    static void main(String[] args) {
        /*
        Pide un número por teclado
        Pinta cada 1 de sus digitos por separado
         */
        int num=0;
        int digito =0;
        num= Integer.parseInt(IO.readln("Dime un numero "));
        while(num!=0){
            digito=num%10;
            IO.println(digito);
            num= num/10;
        }
    }
}
