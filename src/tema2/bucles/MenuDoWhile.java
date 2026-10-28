package tema2.bucles;

public class MenuDoWhile {
    static void main(String[] args) {
        int opcion;
        double saldo = 5500.0;
        double ingreso =0.0;
        do {

            IO.println("1.Consultar saldo ");
            IO.println("2.Depositar dinero ");
            IO.println("3.Saludar al director. ");
            IO.println("4.Salir. ");

            opcion = Integer.parseInt(IO.readln("Selecciona entre una de estas acciones: "));
            switch (opcion){
                case 1 -> IO.println("Tu saldo es de " + saldo + " euros.");
                case 2 -> {
                    ingreso = Double.parseDouble(IO.readln("Dime cuanto quieres ingresar"));
                    if (ingreso > 0) {
                        saldo = saldo + ingreso;
                    }else {
                        IO.println("Cantidad de ingreso erroneo");

                    }
                }
                case 3 ->{
                    IO.println("Hola que tal todo,¿Mi dinero esta creciendo?");
                }
                case 4 ->{
                    IO.println("Hasta otro dia tengo la comida en el horno");
                }
                default -> {
                    IO.println("Opción incorrecta, eliga entre 1,2,3,4");
                }
            }


        }while (opcion != 4);
    }
}
