package tema2.excepciones;

public class EjercicioApuntes1 {

    static double getPrecioconIva(double num) throws PrecioDemasiadoAltoException {
        double precioConIva;
        precioConIva = num *1.21;
        if (precioConIva>100){
            throw new PrecioDemasiadoAltoException("Precio demasiado alto");
        }
        return precioConIva;
    }

    static void main(String[] args) {
        double cantidad;
        try {
            cantidad = Double.parseDouble(IO.readln("Dame un precio "));
            IO.println("Precio con IVA " + getPrecioconIva(88.0));
        } catch (PrecioDemasiadoAltoException e) {
           IO.println("ERROR  " + e.getMessage());
        }catch (Exception ex){
            IO.println("Error general: " + ex.getMessage());
        }


    }
}
