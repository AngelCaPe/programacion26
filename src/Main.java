//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    double radio;
    double superficie;
    double perimetro;

    radio = 4; //Ejemplo
    IO.println("El radio es " + radio);


    superficie = Math.PI * radio * radio;
    perimetro = 2 * Math.PI * radio;

    IO.println("La superficie es:" + superficie);
    IO.println("El perimetro es:" + perimetro);
}
