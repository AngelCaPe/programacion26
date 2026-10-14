package tema1.practicasclas;

public class Practicac5 {
    public static void main(String[] args) {

        double diametro = 15.5, altura = 42.4;
        final double PI = Math.PI;

        double areaBase = 0.0, volumen = 0.0;

        areaBase = PI * Math.pow(diametro/2,2);

        volumen = areaBase * altura;

        IO.println("El area de la base es = " + areaBase + "y el volumen es = " + volumen);
    }
}
