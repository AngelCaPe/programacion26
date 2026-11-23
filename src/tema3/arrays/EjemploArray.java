package tema3.arrays;

public class EjemploArray {
    static void main(String[] args) {
        int[] notas= new int[10];
        notas[0]= 9;
        notas[1]= 6;
        notas[2]= 9;
        notas[3]= 9;
        notas[4]= 9;
        notas[5]= 9;
        notas[6]= 9;
        notas[7]= 9;
        notas[8]= 9;
        notas[9]= 9;
        for(int i=0; i < notas.length; i++) {
            IO.println(notas[i]);
        }

        IO.println("--------------");

        //Recorrer array del fin al principio
        for(int i=notas.length-1; i>=0; i--) {
            IO.println(notas[i]);
        }

    }
}
