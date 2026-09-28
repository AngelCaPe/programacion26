package tema1;

public class Ejemplo {

      //Aqui podemos poner funciones que llamaremos despés
      //Variables de la clase


      //Lo que se va a ejecutar
     public static void main(String[] args) {
       
         int edad; //Crear una variable llamada edad, de tipo entero
         double precioConIVA; //Crear una variable llamada precio, de tipo decimal
         double precioSinIVA;
         boolean gratis;//ture o false


         edad = 23; //Guardamos el valor 25 en la variable edad
         edad = 33;

         precioSinIVA = 99.99;
         precioConIVA = precioSinIVA * 1.21; // Le aplicamos el IVA del 21% al precio

         gratis = true;
      


         IO.println("La edad es " + edad);
         IO.println("El precio sin Iva es " + precioSinIVA);
         IO.println("El precio con Iva es " + precioConIVA);
         IO.println("¿Es gratis? " + gratis);




       }



      }




