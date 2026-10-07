package tema1;
import java.util.Scanner;
public class TareaScanner {
 public static void main(String[] args) {
    
    String nombre, apellido, direccion;
    String numTelefono, codigoPostal;
    int edad;
    
    Scanner sc =new Scanner(System.in);
    


    nombre = IO.readln("Dime tu nombre ");
    apellido = IO.readln("Dime tu apellido ");
    direccion = IO.readln("Dime tu direccion");
   
    edad = Integer.parseInt( IO.readln("Dime tu edad"));
    sc.nextLine();//el salto de linea
    numTelefono = IO.readln("Dime tu número de teléfono");
    codigoPostal = IO.readln("Dime tu codigo postal");
    

    IO.println("----------------------------------------------");
    IO.println("Nombre =" + nombre);
    IO.println("Apellido =" + apellido);
    IO.println("Dirección =" + direccion);
    IO.println("Edad = " + edad);
    IO.println("Número de teléfono = " + numTelefono);
    IO.println("Código Postal = " + codigoPostal);




 }
}
