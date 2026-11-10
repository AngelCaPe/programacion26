package tema2.metodos;

public class EjercicioMetodos2 {
    /**
     * Haz un ejercicio que muestre un menú con estas opciones:
     * 1.Es par
     * 2. Máximo de tres números..
     * 3. Es primo.
     * 4.Mostar tabla de multiplicar.
     * 5.Salir
     * 6.
     * 7.Salir
     */
    public static void pintarOpciones(){
        IO.println("1.Es par");
        IO.println("2. Máximo de tres números.");
        IO.println("3.Es primo");
        IO.println("4.Mostar tabla de multiplicar");
        IO.println("5.Factorial de un numero");
        IO.println("6.Impares en intervalo");
        IO.println("7.Salir");
    }
    public static boolean esPar(int num){

        if (num%2 != 0 ) {
            return false;
        }else {
            return true;
        }

    }
    public static int maximo(int n,int m) {
        if (n <= m) {
            return m;
        } else  {
            return n;
        }
    }
    static void tablaMultiplicar(int num){
        for (int i=1;i<=10; i++){
            IO.println(num + "x" + i + " = " + (num*i));
        }
    }
    static boolean esPrimo(int num){
        boolean esPrimo = true;
        for (int i=2;i< num;i++){
            if (num % i == 0){
                esPrimo = false;
                break;
            }

        }
        return esPrimo;
    }
    static double factorial(int num){
        double acumulador = 1;
        for (int i=num;i>1;i--){
            acumulador= acumulador * i;
        }return acumulador;
    }





    static void main(String[] args) {
        int opción = 0, numero = 0;

        do {
            pintarOpciones();
            opción = Integer.parseInt(IO.readln("Dime una opción: "));
            switch (opción) {
                case 1 -> {
                    numero = Integer.parseInt(IO.readln("Dime un numero"));
                    if (esPar(numero)) {
                        IO.println("El numero " + numero + " es par ");
                    } else {
                        IO.println("El numero " + numero + " es Impar ");
                    }

                }
                case 2 -> {
                    int num1, num2, num3;
                    num1 = Integer.parseInt(IO.readln("Dime el numero 1 "));
                    num2 = Integer.parseInt(IO.readln("Dime el numero 2 "));
                    num3 = Integer.parseInt(IO.readln("Dime el numero 3 "));
                    maximo(maximo(num1, num2), num3);
                }
                case 3 -> {
                    numero = Integer.parseInt(IO.readln("Dime un numero "));
                    if (esPrimo(numero)) {
                        IO.println("El " + numero + " es primo ");
                    } else {
                        IO.println("El " + numero + " no es primo");
                    }


                }
                case 4 -> {
                    numero = Integer.parseInt(IO.readln("Dime un numero "));
                    tablaMultiplicar(numero);
                }
                case 5-> {
                    IO.println("---Factorial----");
                    double resultado =0;
                    numero = Integer.parseInt(IO.readln("Dime un numero"));
                    resultado = factorial(numero);
                    IO.println("El factorial de " + numero + "es = " + resultado);

                }
                case 6->{

                }


                case 7-> {
                    IO.println("Hasta pronto");
                }
                default -> IO.println("Opcion incorrecta");

            }
        }while (opción != 7) ;

        }
    }

