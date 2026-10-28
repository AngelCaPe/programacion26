package tema2.bucles;

public class EjercicioDoWhileCadenas {
    static void main(String[] args) {

        String usuario = "javgui709",pw = "696969",usuarioTec,pwT;
        int numInt=3;
        boolean accesoConcedido = false;

        do {
            IO.println("Introduce tus credenciales : ");
            usuarioTec = IO.readln("Usuario : ").toLowerCase();
            pwT = IO.readln("Contraseña: ");
            if ((usuario.equals(usuarioTec)) && (pw.equals(pwT))){
                accesoConcedido = true;
                IO.println("Bienvenido");
                numInt-=3;}
            else {
                numInt-=1;
                IO.println("Contraseña o usuario incorrectos, intentelo de nuevo, te quedan " + numInt + " intentos");

            }

        }while(numInt>0);



    }
}
