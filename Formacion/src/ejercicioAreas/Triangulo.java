package ejercicioAreas;

public class Triangulo extends Poligono{
    public Triangulo(double base, double altura) {
        super(base, altura);
    }
    public double calcularArea() {
        double area = (base * altura) / 2;
        return area;
    }
}