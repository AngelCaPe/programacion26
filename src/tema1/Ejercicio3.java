package tema1;

public class Ejercicio3 {

    public static final double IVA = 0.21;
    public static void main(String[] args) {
        
        double precioSinIVA = 40000.0;
        double precioConIVA = 0.0;
        double descuentoAuto = 3500.0;
        double descuentoExtra = 1500.0;
        double resultado = 0.0;


        precioConIVA = precioSinIVA + (precioSinIVA * IVA );
        resultado = precioConIVA - descuentoAuto - descuentoExtra;

        IO.println("Tu coche cuesta " + resultado);







    }











}
