package tema1;

public class Tarea6 {
    public static void main(String[] args) {

    int x = 5;
    int y = 10;

    boolean resultado = (++x > 5) && (y-- < 10);
    //False 6>5 si pero 10=10
    IO.println(resultado);


    int m = 4;
    int n = 7;
        
    resultado = !(m * 2 > n++) || (m + ++n == 13);
    //True
    IO.println(resultado);




    }

}
