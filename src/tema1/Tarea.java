package tema1;

public class Tarea {



    public static void main(String[] args) {
        

        double cateto1 = 3 ;
        double cateto2 = 4 ;
        double hipotenusa = 0;
        double hipotenusa2 = 0;

        hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 *cateto2)); // es igual que hacer Math.pow
        hipotenusa2 = Math.sqrt(Math.pow(cateto1,2)+ (Math.pow(cateto2, 2)));


        IO.println("la hipotenusa es " + hipotenusa );
        IO.println("la hipotenusa2 es "+ hipotenusa2);









    }









}
