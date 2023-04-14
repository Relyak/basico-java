package ejercicioAreas;

public abstract class Poligono {
    protected double base;
    protected double altura;

    public Poligono(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public abstract double calcularArea();
}