package tema2.bucles;

public class EjercicioIndicador {
    static void main(String[] args) {
        //Dime si hay algun multiplo de 3 y 7 entre el 1 y el 1000.
        boolean multiplo = false;
        for (int num = 3;num<=1000;num++){
            if (num %3 ==0 & num%7==0){
                multiplo = true;
            }
        }
        if (multiplo){
            IO.println("Si hay.");
        }else {
            IO.println("No hay");

        }

    }
}
