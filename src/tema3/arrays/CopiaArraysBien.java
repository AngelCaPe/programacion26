package tema3.arrays;

public class CopiaArraysBien {
    static void main(String[] args) {
        int[] numeros = {1,2,3,5,5};
        int[] copiado= new int[numeros.length];
        for (int i=0; i< copiado.length; i++){
            copiado[i]=numeros[i];
        }
    }
}
