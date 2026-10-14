package tema1.ejerciciosdeclase;

public class Ejercicio2clase {
    public static final double IVA = 0.21;
    public static void main(String[] args) {
         /*
            Hay que pedir por teclado el precio de un producto
            Debéis aplicarle el 21% de IVA y mostrar el nuevo precio
            Debéis aplicarle un descuento del 5% (sobre el precio con IVA) y mostrar el precio final
        
        */
        double descuento = 0.05;
        double precio, precioFinal,precioFinal2;

        precio = Double.parseDouble(IO.readln("Dime que precio tiene"));
        precioFinal = precio;
        precioFinal *= (IVA + 1);
        IO.println("El precio con IVA es = "+ precioFinal);
        precioFinal2 = precioFinal;
        precioFinal2 *= 0.95;
        System.out.printf("El precio final es = %.2f", precioFinal2);

    }

}
