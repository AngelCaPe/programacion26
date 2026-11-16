package tema2.ejerciciosPreExamen;

public class Ejercicio1 {

    /*
    Dos jugadores (el usuario y el ordenador) comienzan con 21 cerillas. Por turnos, cada
jugador retira entre 1 y 3 cerillas. El jugador que retire la última cerilla pierde la partida.
Escribe un programa que: – Permita al usuario elegir cuántas cerillas quiere retirar (que sea
entre 1 y 3) – El ordenador retire aleatoriamente entre 1 y 3 cerillas – Muestre el estado del
juego después de cada turno – Indique quién ha ganado al finalizar
     */
    public static int quitarCerillas(int num,int n) {
        return num-n;
    }

    public static void numerodeCerillas(int m){
        IO.println( "Quedan "+ m + " cerillas. ");
    }
    public static int cerillasAleatorias(int m){
       return (int)(Math.random() * (3 - 1 + 1)) + 1;
    }




    static void main(String[] args) {
        int cerillas=21;
        int cerillasQuitadas;
        int cerillasPC;
        boolean ganaUsuario = false;
        boolean ganaPc = false;
        try {
            do {
                numerodeCerillas(cerillas);

                    cerillasQuitadas= Integer.parseInt(IO.readln("Dime cuantas cerillas quieres quitar "));
                    IO.println("El usuario ha quitado " + cerillasQuitadas +" cerillas");
                    cerillas=quitarCerillas(cerillas,cerillasQuitadas);

                    if (cerillas<=0){
                        ganaPc= true;
                    }


            }while (cerillas>0);
        }catch (NumberFormatException ex){
            IO.println("ERROR " + ex.getMessage());
        }
        if (ganaUsuario){
            IO.println("Has Ganado ");
        }
        if (ganaPc){
            IO.println("Te ha ganado una maquina fiera ");
        }


    }








}
