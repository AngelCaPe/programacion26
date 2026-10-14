package tema1.practicasclas;

public class PracticaC4 {

    public static void main() {

                double dinero = 0.0;
                double interes = 0.0;
                double retencion = 0.0;
                double dineroTotal = 0.0;


                dinero = 2000.0;
                interes = (dinero * 0.0275)/2;
                retencion = interes * 0.18;
                dineroTotal  = dinero + interes - retencion;

                IO.println("El interes es = " + interes);
                IO.println("Las retenciones son = " + retencion);
                IO.println("El dinero total es = " + dineroTotal);





    }






}
