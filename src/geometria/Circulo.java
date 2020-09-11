package geometria;

public class Circulo extends Forma{

    private double Raio;

    public Circulo(){
    }

    public Circulo(double raio){
        Raio = raio;
    }

    public Circulo(double raio, String cor, boolean preenchido){
        super(cor, preenchido);
        Raio = raio;
    }

    public double getRaio() {
        return Raio;
    }

    public void setRaio(double raio) {
        Raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * this.getRaio() * this.getRaio();
    }

    @Override
    public double getPerimetro() {
        return 2 * (Math.PI * this.getRaio());
    }

    @Override
    public String toString() {
        return "Circulo[raio= " + this.getRaio() + " cor=" + this.getCor() + " preenchido=" + isPreenchido() + "]";
    }
}
