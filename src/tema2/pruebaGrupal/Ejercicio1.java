package tema2.pruebaGrupal;

public class Ejercicio1 {



    /*
    Marcus Cubitus y Julius Humerus son dos legionarios que se entretienen en sus ratos
libres jugando a juegos de dados, el pasatiempo favorito de los antiguos romanos. Un
juego que pudieron haber jugado estos amigos consiste en tirar cada jugador cinco
dados. La puntuación es la suma total de puntos, sin contar los valores que coincidan
con el mínimo o el máximo obtenido. El jugador que saca más puntos gana la partida.
Escriba un programa que simule varias partidas seguidas de este juego de dados.
     */


    public static int lanzarDados(){
        return (int)(Math.random() * (6- 1 + 1)) + 1;}
    static int maximoDosNumeros(int n1, int n2) {
        if (n1 >= n2)
            return n1;
        else
            return n2;
    }

    static int minimoDosNumeros(int n1, int n2) {
        if (n1 <= n2)
            return n1;
        else
            return n2;
    }
    static int tiradas() {
        int d1, d2, d3, d4, d5;
        int numMax,numMin;
        int suma=0;
        d1 = lanzarDados();
        d2 = lanzarDados();
        d3 = lanzarDados();
        d4 = lanzarDados();
        d5 = lanzarDados();

        IO.println("TIRADA: " + d1 + ", " + d2 + ", " + d3 + ", " + d4 + ", " + d5);
      numMax  = maximoDosNumeros(maximoDosNumeros(maximoDosNumeros(maximoDosNumeros(d1,d2),d3),d4),d5);
      numMin = minimoDosNumeros(minimoDosNumeros(minimoDosNumeros(minimoDosNumeros(d1,d2),d3),d4),d5);
      if (d1 != numMax && d1 != numMin){
          suma = suma + d1;
      }

      if (d2 != numMax && d2 != numMin){
            suma = suma + d2;
        }

      if (d3 != numMax && d3 != numMin){
            suma = suma + d3;
        }

      if (d4 != numMax && d4 != numMin){
            suma = suma + d4;
        }

      if (d5 != numMax && d5 != numMin){
            suma = suma + d5;
        }
      return suma;}







        static void main(String[] args) {
            int puntosCubitus, puntosHumerus;
            int rondas = 3;
            do {
                puntosCubitus = tiradas();
                puntosHumerus = tiradas();
                if (puntosCubitus > puntosHumerus) {
                    IO.println("Gana Cubitus esta ronda");
                } else if (puntosCubitus < puntosHumerus) {
                    IO.println("Gana Humerus");

                } else {
                    IO.println("Empate esta ronda");


                    rondas--;
                }
            }
                while (rondas == 0) ;


            }





    }



