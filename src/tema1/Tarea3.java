package tema1;

public class Tarea3 {



public static void main(String[] args) {
    
    int precio = 125;
    String password = "12345678";
    boolean res = false;
    //Dime si el precio es > que 100
    //Dime si el precio es >= que 130
    //Dime si el precio es < 100
    //Dime si el precio es <= que 125

    res = (precio > 100);
    IO.println(res);
    res = (precio >=130);
    IO.println(res);
    res = (precio < 100);
    IO.println(res);
    res = (precio <=125);
    IO.println(res);

    boolean igual = (password == "12345678");
    IO.println(igual);







}

}
