package tema1.ejerciciosdeclase;

public class Ejercicio1 {
    public static void main(String[] args) {
        


         /*
            La nota de programación de la primera evaluación se calcula:
            - 30% una prueba de clase a mitad de trimestre
            - 30% un exámen al final de la evaluación
            - 25% de prácticas de clase
            - 15% evaluación formativa: participación en clase, lo bien que le caes al profesor, etc.

            Pide cada nota por teclado y muestra la nota final del trimestre
        */


        double nota1, nota2, nota3, nota4;
        double notaFinal;

        nota1 = Double.parseDouble(IO.readln("Dime tu primera nota"));
        nota2 = Double.parseDouble(IO.readln("Dime tu segunda nota"));
        nota3 = Double.parseDouble(IO.readln("Dime tu tercera nota"));
        nota4 = Double.parseDouble(IO.readln("Dime tu cuarta nota"));

        notaFinal = (0.3 * nota1) + (0.3 * nota2) + (0.25 * nota3) + (0.15 * nota4);

        
        System.out.printf("Tu nota final es = %.2f " , notaFinal);

        
    




    }

}
