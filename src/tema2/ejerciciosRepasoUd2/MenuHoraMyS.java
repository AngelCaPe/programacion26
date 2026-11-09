package tema2.ejerciciosRepasoUd2;

public class MenuHoraMyS {
    static void main(String[] args) {
        int opcion = 0;
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        int totalSegundos = 0;


        do {

            IO.println("1.H , M y S a segundos");
            IO.println("2. Convertir segundos a H,M y S");
            IO.println("3. Salir");
            opcion= Integer.parseInt(IO.readln("Dime una opcion : "));
            switch (opcion){
                case 1 ->{
                    horas = Integer.parseInt(IO.readln("Dime el numero de horas : "));
                    minutos = Integer.parseInt(IO.readln("Dime el numero de minutos : "));
                    segundos = Integer.parseInt(IO.readln("Dime el numero de segundos : "));
                    totalSegundos = horas * 120 + minutos * 60 + segundos;
                    IO.println("Ese tiempo son = " +totalSegundos);

                }
                case 2 ->{
                    totalSegundos= Integer.parseInt(IO.readln("Dime los segundos"));
                    horas = totalSegundos / 60 / 60;
                    minutos = totalSegundos / 60 % 60;
                    segundos = totalSegundos % 60 % 60;
                    IO.println("Ese tiempo son: " + horas + " horas " + minutos + " minutos " + segundos + " segundos");

                }
                case 3 ->{
                    IO.println("Hasta pronto");
                }
                default ->{
                    IO.println("Opcion incorrecta");
                }

            }
        }while (opcion!=3);




    }
}
