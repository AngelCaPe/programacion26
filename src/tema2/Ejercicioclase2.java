package tema2;

public class Ejercicioclase2 {
   public static void main() {

    //int n = (int) (Math.random() * (maximo - minimo + 1)) + minimo;

 /*
            Estamos en una partida de D&D
            El héroe se enfrenta a un orco y tira un dado de 20 caras. Según el dado:
                1 Pifia, tropieza y pierde el combate
                2 - 5  Huyes despavorido
                6 - 10 Te cubres con el escudo
                11 - 15 Ataque normal con la espada
                16 - 19 Ataque feroz
                20 Golpe critico, el orco es fulminado

            Simula la tirada del dado (ver ejercicios tema anterior)
            Y muestra un mensaje con la acción que se produce.

        */
       int vida = 100;
       boolean escudo = true;
       int dado = (int) (Math.random() * (20 - 1 + 1)) + 1;
       IO.println("Tu sacada del dado es = "+ dado);

       if (dado ==1){
           vida = 0;
           IO.println("Pifia, tropieza y pierde el combate");
       } else if (dado >=2 && dado<=5 ) {
           vida -= 50;
           IO.println("Huyes despavorido");
       } else if (dado > 5 && dado<=10) {
           if (escudo) {
               IO.println("Te cubres con el escudo");
           }else{
               vida -=70;
               IO.println("Recibes golpe por no llevar escudo");
           }
       } else if (dado>10 && dado<=15) {
           IO.println("Ataque normal con la espada");
       } else if (dado>16 && dado<=19) {
           IO.println("Ataque feroz");
       } else if (dado==20) {
        IO.println("Golpe critico, el orco es fulminado");

       }
       IO.println("La vida restante del jugador es = " + vida);
   }
}
