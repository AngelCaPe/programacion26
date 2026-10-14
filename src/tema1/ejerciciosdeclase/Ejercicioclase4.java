package tema1.ejerciciosdeclase;

public class Ejercicioclase4 {
    public static void main(String[] args) {
          /*
            La ficha de un producto tiene la siguiente información:
            - Nombre
            - Descripción
            - Precio
            - IVA (0.21, 0.10, ...)
            - Categoría
            - Stock en almacén

            Pide los valores por teclado y pinta la información lo mejor posible
        
        */
       String nombre;
       String descripcion;
       double precio;
       double iva;
       String categoria;
       int stock;

       nombre = IO.readln("Dime tu nombre");
       descripcion = IO.readln("Dime una descripcion del objeto");
       precio = Double.parseDouble(IO.readln("Dime el precio"));
       iva = Double.parseDouble(IO.readln("Dime el IVA"));
       categoria = IO.readln("Dime la categoria");
       stock = Integer.parseInt(IO.readln("Dime el stock"));

       IO.println("-----------------------------------------------");

       IO.println("El nombre es = " + nombre);
       IO.println("La descripcion es = " + descripcion);
       IO.println("El precio es = " + precio);
       IO.println("El IVA es = " + iva);
       IO.println("La categoria es = " + categoria);
       IO.println("El stock es = " + stock);
    }

}
