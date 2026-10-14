package tema1.ejerciciosdeclase;

public class Ejercicio3clase {
    public static void main(String[] args) {
        /*
            Tienes dos variables numeroA y numeroB, y debes intercambiar sus valores
        */
            int numeroA = 15;
            int numeroB = 55;
            int temp;


            temp = numeroA;
            numeroA = numeroB;
            numeroB = temp;

            IO.println("Numero a = "+ numeroA  + " Numero B = " + numeroB);
    }

}