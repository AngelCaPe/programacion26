package tema1;

public class TArea2 {




    public static void main(String[] args) {
        
        double volumenFutbol = 0.0;
        double volumenBaloncesto = 0.0;
        double radioFutbol = 11.0;
        double radioBaloncesto = 12.0;
        double volumenMaximo= 0.0;

            volumenFutbol = (4.0 * Math.PI * Math.pow(radioFutbol,3))/3.0;
            volumenBaloncesto = (4.0 * Math.PI * Math.pow(radioBaloncesto,3))/3.0;
            volumenMaximo = Math.max(volumenFutbol, volumenBaloncesto);
        
        IO.println("El volumen de la perlota de fútbol es " + volumenFutbol);
        IO.println("El volumen de la pelota de Baloncesto es " + volumenBaloncesto);
        IO.println("El volumen mayor es "+ volumenMaximo);






    }

}
