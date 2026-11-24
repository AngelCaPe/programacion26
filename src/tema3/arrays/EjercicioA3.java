package tema3.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EjercicioA3 {
    static void main(String[] args) {
        int[] numeros= {1,2,3,4,5,6,7,8,9,10};
        int[] posPares= new int[5];
        int j=0;
        for (int i=0;i< numeros.length;i++){
            if(i%2==0){
                posPares[j] = numeros[i];
                j++;
            }
        }
        IO.println(Arrays.toString(posPares));
    }
}
