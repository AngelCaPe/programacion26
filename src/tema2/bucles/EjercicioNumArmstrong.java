package tema2.bucles;

public class EjercicioNumArmstrong {
    static void main(String[] args) {
    /*
        Se dice que un número es de Armstrong si es igual a la suma de sus dígitos
        elevados al número de dígitos.

        Ej: 153 = (1 elevado a 3) + (5 elevado a 3) + (3 elevado a 3)

            contador = número de dígitos
            acumulador = (1 elevado a 3) + (5 elevado a 3) + (3 elevado a 3)
            booleano -> (numero == acumulador)

        Contador: para sacar el número de dígitos
        Acumulador: Para sumar en una variable cada (dígito elevado a numero de dígitos)
        Booleano al final para saber si es o no número de armstrong
         */
        int num = 0, numTec= 0;
        int contador = 0;
        int digito = 0;
        int acumulador= 0;
        numTec=Integer.parseInt(IO.readln("Dime un numero "));
        num=numTec;
        while (num!=0){
            num= num/10;
            contador++;
        }
        num=numTec;
        while(num!=0){
          digito = num%10;
          acumulador +=Math.pow(digito,contador);
          IO.println("Digito " + digito);
          num= num/10;

        }
        IO.println("La suma es: " + acumulador);

        if (numTec == acumulador){
            IO.println("Es un número de Armstrong");
        }else{
            IO.println("No es un número de Armstrong");
        }

    }
}
