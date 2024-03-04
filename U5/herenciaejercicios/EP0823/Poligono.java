package herenciaejercicios.EP0823;

public abstract class Poligono {
    public double base;
    public double altura;

    public Poligono(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public abstract double area();

}
