package ejercicioAreas;

public class Rectangulo extends Poligono {
    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

  
    public double calcularArea() {
        return base * altura;
    }
}