package tema1.ejerciciosRelacion2;

public class Ejercicio7 {

    //Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber
    //cuánto deberá pagar finalmente por su compra
  public static void main() {

    double prod1 = 0, prod2 = 0, prod3 = 0;
    double precioTotal = 0;
    double descuento = 1.15;
    double precioFinal = 0;

    prod1 = Double.parseDouble(IO.readln("Dime el precio 1 "));
    prod2 = Double.parseDouble(IO.readln("Dime el precio 2 "));
    prod3 = Double.parseDouble(IO.readln("Dime el precio 3 "));
    precioTotal = prod1 + prod2 + prod3;
    precioFinal = precioTotal * descuento;
    System.out.printf("El precio final es = %.2f ", precioFinal);








    }
}
