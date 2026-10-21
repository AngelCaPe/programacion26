package tema2;

public class EjercicioSwitch2 {
    public static void main(String[] args) {

        /*
            Vamos a hacer una especie de menú
            Tenéis que pedir por teclado una opción del 1 al 5
            - 1. Mostrar todos los usuarios
            - 2. Mostrar un usuario
            - 3. Modificar un usuario
            - 4. Eliminar un usuario
            - 5. Salir

            Implementa eso con el nuevo switch, y para cada opción haz dos líneas:
            - IO.println("Has seleccionado la opción " + opcion);
            - IO.println("MOSTRAR USUARIO")

            Si no es una de esas opciones mostrar: OPCIÓN INCORRECTA
        */

        int opcion = Integer.parseInt(IO.readln("Seleciona una opcion del 1 al 5 "));

        switch (opcion){
            case 1 -> {
                IO.println("Has seleccionado la opción "+ opcion);
                IO.println("Mostrar todos los usuarios");
            }
            case 2 -> {
                IO.println("Has selecionado la opción "+ opcion);
                IO.println("Mostrar un usuario");

            }
            case 3 -> {
                IO.println("Has seleccionado la opción " + opcion);
                IO.println("Modificar un usuario");

            }
            case 4 -> {
                IO.println("Has seleccionado la opción " + opcion);
                IO.println("Eliminar un usuario");
            }
            case 5 ->{
                IO.println("Has seleccionado la opción "+ opcion);
                IO.println("Salir");
            }
            default -> IO.println("Opción incorrecta");
        }




    }
}
