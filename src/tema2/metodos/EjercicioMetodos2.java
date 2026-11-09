package tema2.metodos;

public class EjercicioMetodos2 {
    /**
     * Haz un ejercicio que muestre un menú con estas opciones:
     * 1.Es par
     * 2. Máximo de tres números..
     * 3. Es primo.
     * 4.Mostar tabla de multiplicar.
     * 5.Salir
     */
    public static void pintarOpciones(){
        IO.println("1.Es par");
        IO.println("2. Máximo de tres números.");
        IO.println("3.Es primo");
        IO.println("4.Mostar tabla de multiplicar");
        IO.println("5.Salir");
    }
    public static boolean esPar(int num){

        if ()

    }


    static void main(String[] args) {
        int opción = 0, numero=0;

        do {
            pintarOpciones();
            opción=Integer.parseInt(IO.readln("Dime una opción: "));
          switch (opción){
              case 1->{
                  numero= Integer.parseInt(IO.readln("Dime un numero"));

              }
          }

        }while(opción!=5);

    }
}
