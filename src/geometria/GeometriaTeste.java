package geometria;

public class GeometriaTeste {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(Double.parseDouble(args[0]));
        Retangulo retangulo = new Retangulo(Double.parseDouble(args[1]), Double.parseDouble(args[2]));
        Quadrado quadrado = new Quadrado(Double.parseDouble(args[3]));

        System.out.println("Area do Círculo: " + circulo.getArea());
        System.out.println("Perimetro do Círculo: " + circulo.getPerimetro());
        System.out.println("Area do Retângulo: " + retangulo.getArea());
        System.out.println("Perimetro do Retângulo: " + retangulo.getPerimetro());
        System.out.println("Area do Quadrado: " + quadrado.getArea());
        System.out.println("Perimetro do Quadrado: " + quadrado.getPerimetro());
    }
}
