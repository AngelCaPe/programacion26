package tema2.metodos;

public class Ejercicio1 {

    static boolean esMultiplo (int numA,int numB){
        //Ver si el resto de la divison es cero
        if (numA % numB ==0){
            return true;
        }else if ( numB % numA == 0 ) {
            return true;

        }else {
            return false;
        }

    }




    static void main(String[] args) {
        int n1,n2;
        boolean resultado;
        n1 = Integer.parseInt(IO.readln("Dime un numnero "));
        n2 = Integer.parseInt(IO.readln("Dime un numnero "));

        resultado= esMultiplo(n1,n2);
        if (resultado){
            IO.println("Son multiplos ");
        }else {
            IO.println("No son multiplos ");
        }
    }
}
