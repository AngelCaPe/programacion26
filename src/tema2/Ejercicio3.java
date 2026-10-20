package tema2;

public class Ejercicio3 {
    public static void main(String[] args) {

        /*
            Tenemos tres variables:
            - Humedad del suelo: entre 0 y 100, generada de forma aleatoria
            - Temperatura: entre -50 y 50, generada de forma aleatoria
            - EstaLloviendo: booleano, generado de forma aleatoria

            El programa mostrará la acción de si se riega o no según:
            1. Si está lloviendo no regar
            2. Si la humedad es menor que 30:
                - Si la temperatura es mayor que 30: riego intensivo
                - En otro caso: riego normal
            3. Si la humedad está entre 30 y 59:
                - Si la temperatura es mayor que 35: riego normal
                - En otro caso: riego ligero
            4. Si la humedad es mayor que 60: no regar

            Muestra mensaje de regar (intensivo, normal o ligero) o de no regar según los datos.


        */
        int humedad = (int) (Math.random() * (100 - 0 + 1)) + 0;
        int temperatura = (int) (Math.random() * (50 - (-50) + 1)) + (-50);
        boolean lloviendo = true;
        int llueve = (int) (Math.random() * (2 - 1 + 1)) + 1;
        IO.println("Humedad = " + humedad);
        IO.println("Temperatura = " + temperatura);
        IO.println("");
        if (llueve == 1) {
            lloviendo = true;
        } else {
            lloviendo = false;
        }
        IO.println("LLueve = " + lloviendo);


        if (lloviendo) {
            IO.println("No riega");
        } else if (humedad < 30 ) {

            if (temperatura > 30) {
                IO.println("Riego intensivo");

            } else {
                IO.println("Riego Normal");
            }

        } else if (humedad <= 59 ) {
            if (temperatura > 35) {
                IO.println("Riego normal");

            } else {
                IO.println("Riego ligero");
            }
        } else if (humedad >= 60) {
            IO.println("No riega");
        }

    }
}




