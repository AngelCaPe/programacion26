package tema1.ejerciciosdeclase;

public class Ejercicio5clase {
    public static void main(String[] args) {
           /*
            Los cohetes Starship de SpaceX queman combustible según la fórmula de Tsiolkovsky (ecuación de un cohete):
            Av = ve * ln (m0 / mf), donde ln es el logaritmo

            Av, es el cambio de velocidad alcanzado en m/s
            ve, es la velocidad de escape de los gases en m/s
            m0, es la masa inicial del cohete con combustible en kg
            mf, es la masa final sin combustible en kg
            
            Escribe un programa que:
            - Declare e inicialice las variables: ve = 3300.0 m/s, m0 = 5000000.0 kg, y mf = 1500000.0 kg
            - Calcule el Av alcanzado y lo muestre por pantalla
            - Determine con un operador lógico si el cohete puede llegar a la órbita baja. Para que eso se cumpla Av debe ser mayor o igaul que 9000 m/s, y la masa final no debe superar el 40% de la masa inicial. Muestra true o false según resultados.

            Notas:
            - Usa Math.log para el logaritmo (ln)
            - Usa operadores lógicos, no uses "if"
            - Si quieres probarte muestra los resultados con dos decimales únicamente
        
        */

            double av, ve, m0, mf;
            boolean orbita;

            ve = 3300.0;
            m0 = 5000000.0;
            mf = 1500000.0;

            av = ve * Math.log(m0/ mf);
            System.out.printf(" El av es = %.2f %n" , av);
            orbita = (av >= 9000.0) && (mf<= (0.4 * m0));
            IO.println("¿Orbitara?" + orbita);





        
    }

}
