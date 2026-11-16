package tema2.ejerciciosPreExamen;

public class Ejercicio3 {
    public static int lanzarDados(){
        return (int)(Math.random() * (6- 1 + 1)) + 1;}


    static void main(String[] args) {
  int dado1,dado2,dado3,dado4,dado5,dado6;
  int dado1c,dado2c,dado3c,dado4c,dado5c,dado6c;
  int puntuacionCubitus,puntuacionHumerus;

  for (int i=0;i<6;i++){
      dado1=lanzarDados();
      dado2=lanzarDados();
      dado3=lanzarDados();
      dado4=lanzarDados();
      dado5=lanzarDados();
      dado6=lanzarDados();
      puntuacionHumerus=dado1+dado2+dado3+dado4+dado5+dado6;
      if (dado1==1 && dado2==2 && dado3==3 && dado4==4 && dado5==5 &&dado6==6){
          puntuacionHumerus+= 10;
      } else if (dado1==2 && dado2==3 && dado3==4 && dado4==5 && dado6) {
          
      }


  }
    }
}
