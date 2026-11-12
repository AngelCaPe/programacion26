package tema2.excepciones;

public class Ejemplo2Excepciones {
    static void main(String[] args) {
        int numero=0;
        try {
            numero= Integer.parseInt(IO.readln("Dime un numero "));
            IO.println("La raiz cuadrada de " + numero + " es " + Math.sqrt(numero));
            IO.println("100 dividido " +  numero + " es " + (100/numero));
        }catch (NumberFormatException ex){
            IO.println("No has introducido un número valido");
        }catch (ArithmeticException ex){
            IO.println( "Error: " + ex.getMessage());
        }
        IO.println("El programa termina okay");
    }
}
