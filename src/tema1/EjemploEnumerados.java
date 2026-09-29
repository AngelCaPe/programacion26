package tema1;

public class EjemploEnumerados {
        
    public static void main(String[] args) {
        
        enum Asignaturas {
            PROGRAMACION, SISTEMASINFORMATICOS, BASEDEDATOS, LENGUAJEDEMARCAS,
            ENTORNOSDEDESAROLLO


        }

        Asignaturas miPreferida = Asignaturas.BASEDEDATOS;

        IO.println(Asignaturas.PROGRAMACION);
        IO.println("Mi asignatura preferida es " + miPreferida);



    }
}
