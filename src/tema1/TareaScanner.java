package tema1;
import java.util.Scanner;
public class TareaScanner {
 public static void main(String[] args) {
    
    String nombre, apellido, direccion;
    String numTelefono, codigoPostal;
    int edad;
    
    Scanner sc =new Scanner(System.in);
    

    IO.println("Dime tu nombre ");
    nombre = sc.nextLine();
    IO.println("Dime tu apellido ");
    apellido = sc.nextLine();
    IO.println("Dime tu direccion");
    direccion = sc.nextLine();
    IO.println("Dime tu edad");
    edad = sc.nextInt();
    sc.nextLine();//el salto de linea
    IO.println("Dime tu número de teléfono");
    numTelefono = sc.nextLine();
    IO.println("Dime tu codigo postal");
    codigoPostal = sc.nextLine();




 }
}
