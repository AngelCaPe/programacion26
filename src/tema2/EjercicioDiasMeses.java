package tema2;

public class EjercicioDiasMeses {
    public static void main(String[] args) {

        /*
            Pide por teclado un día del mes (1-31) y un número de mes (1-12)
            y dime si la fecha es correcta
        */
        int dia,mes;
         dia = Integer.parseInt(IO.readln("dime el dia"));
         mes = Integer.parseInt(IO.readln("dime el mes"));

         switch (mes){
             case 1,3,5,7,8,10,12 -> {
                 if (dia >= 1 && dia <= 31) {
                     IO.println("Fecha correcta");
                 }else { IO.println("Fecha incorrecta");}
             }
             case 4,6,9,11 -> {
                 if (dia >=1 && dia <= 30){
                     IO.println("Fecha correcta");
                 }else { IO.println("Fecha incorrecta");}

             }
             case 2 -> {
                 if (dia >=1 && dia <=28){
                     IO.println("Fecha correcta");
                 }else { IO.println("Fecha incorrecta");}
             }




         }



    }
}
