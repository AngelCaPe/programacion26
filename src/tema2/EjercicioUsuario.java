package tema2;

public class EjercicioUsuario {
        public static void main(String[] args) {

            /*
                Nos piden comprobar un usuario y una contraseña.
                El usuario es fijo "usuario"
                Guardamos la contraseña en una variable como "12345678"
                Pedimos el usuario por teclado
                Pedimos la contraseña por teclado
                Si coinciden el usuario y la contraseña con los que tenemos guardado:
                - "Credenciales correctas, bienvenido"
                Si no
                - "Credenciales incorrectas"

            */
                String usuario = "USUARIO";
                String contrasena = "12345678";
                String contrasenaInt;
                String usuarioInt;

                usuarioInt = IO.readln("Dime tu usuario");
                contrasenaInt = IO.readln("Dime tu contraseña");


                if ((usuario.equals(usuarioInt.toUpperCase()) ) && (contrasena.equals(contrasenaInt) )){
                    IO.println("Credenciales correctas, bienvenido");
                }else
                    IO.println("Credenciales incorrectas");

        }
}
