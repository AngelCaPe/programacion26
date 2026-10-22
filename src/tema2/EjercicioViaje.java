package tema2;

public class EjercicioViaje {
    public static void main(String[] args) {
        /*

            La clase de Programación se va el lunes de viaje a la Estación Experimental
            Queremos saber cuánto cuesta el viaje
            - Si van más de 30 alumnos el viaje cuesta 5€ por alumno
            - Si van entre 15 y 30 alumnos el viaje cuesta 8€ por alumno
            - Si van menos de 15 alumnos el viaje cuesta 1000€

            Pide por teclado cuántos alumnos van y calcula cuánto cuesta el bus

        */

        int numAlumno =0 ,costeViaje = 0;

            numAlumno = Integer.parseInt(IO.readln("Dime cuantos vais "));

            if (numAlumno < 15){
                costeViaje = 1000;
                IO.println("El precio del viaje es = "+ costeViaje);
            } else if (numAlumno<=30) {
                costeViaje = numAlumno * 8;
                IO.println("El precio del viaje es = "+ costeViaje + "€");
            } else if (numAlumno>30) {
                costeViaje = numAlumno * 5;
                IO.println("El precio del viaje es = "+ costeViaje + "€");

            }
    }
}
