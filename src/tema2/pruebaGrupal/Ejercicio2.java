package tema2.pruebaGrupal;

public class Ejercicio2 {

    /*
    Marcus Cubitus y Julius Humerus, dos legionarios romanos aficionados a los dados y
habituales de estos exámenes, han ideado un nuevo juego. Primero se decide cuántos
turnos va a tener la partida (uno por lo menos, lógicamente). En cada turno, cada uno
tira un dado. Si ambos dados son pares o si ambos son impares, Cubitus se apunta la
suma de los dos valores. Si un dado es par y el otro impar, los puntos se los lleva
Humerus. El ganador es el que ha obtenido más puntos.
         */
    public static int lanzarDados(){
        return (int)(Math.random() * (6- 1 + 1)) + 1;}

    static void main(String[] args) {
        int numTurnos;
        int puntosHumerus =0,puntosCubitus=0;
        int dadoC,dadoH;

        numTurnos = Integer.parseInt(IO.readln("Cuántos turnos quieres jugar: "));
        for (int i= 0;i<numTurnos;i++){
            dadoC = lanzarDados();
            dadoH = lanzarDados();
            if ((dadoC%2==0) && (dadoH %2==0)  || ((dadoC%2!=0) && (dadoH%2!=0))){
                puntosCubitus = puntosCubitus + dadoC +dadoH;
            }else{
                puntosHumerus = puntosHumerus + dadoC +dadoH;
            }
            IO.println("-------Turno " + (i+1) + "------------------------");
            IO.println("Dado Humerus sale: " + dadoH);
            IO.println("Dado Cubitus sale: " + dadoC);

            IO.println("Puntos Humerus = " + puntosHumerus);
            IO.println("Puntos Cubitus = " + puntosCubitus);
            IO.println("-------------------------------------------------------------------------------------");
        }
        if (puntosCubitus<puntosHumerus){
            IO.println("Gana Humerus.");
        } else if (puntosCubitus>puntosHumerus) {
            IO.println("Gana Cubitus.");

        }else{
            IO.println("Hay un empate");
        }
    }

}
