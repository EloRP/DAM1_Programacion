package herenciaejercicios.EP0824;

import herenciaejercicios.EP0823.Poligono;

public class Triangulo extends Poligono {

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }
}
