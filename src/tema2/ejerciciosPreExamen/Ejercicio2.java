package tema2.ejerciciosPreExamen;

public class Ejercicio2 {
    public static int lanzarDados(int numCaras){
        return (int)(Math.random() * (numCaras- 1 + 1)) + 1;}
    public static int turnoCubitos(){
        int total=0,dado;
        for (int i =0;i<5; i++) {
            dado = lanzarDados(10);
            IO.print(dado + " ");
            if (dado % 2 != 0) {
                total += dado;
            }
        }IO.println();
            return total;
        }
    public static int tunroMaximus(){
        int total=0,dado;
        for (int i =0;i<4; i++) {
            dado = lanzarDados(15);
            IO.print(dado + " ");
            if (dado % 2 == 0) {
                total += dado;
            }
        }IO.println();
        return total;
    }




    static void main(String[] args) {

        int numTurnos = 0;
        int puntuacionCubitus=0,puntuaciomMaximus=0;
        numTurnos = Integer.parseInt(IO.readln("Cuantos turnos quierne jugar: "));
        for (int i=0; i<numTurnos;i++){
            puntuacionCubitus=turnoCubitos();
            puntuaciomMaximus=tunroMaximus();
            IO.println();
            if (puntuacionCubitus>puntuaciomMaximus) {
                IO.println("Esta ronda la gana Cubitus ");
            } else if (puntuaciomMaximus>puntuacionCubitus) {
                IO.println("Esta ronda la gana Maximus");

            }else{
                IO.println("Empate");

        }


        }
    }
}
