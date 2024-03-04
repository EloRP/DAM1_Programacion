package herenciaejercicios.EP0824;

import herenciaejercicios.EP0823.Poligono;

public class Cuadrado extends Poligono {

    public Cuadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public double area() {
        return base * altura;
    }
}
