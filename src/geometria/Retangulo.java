package geometria;

public class Retangulo extends Forma{



    private double Base;
    private double Altura;

    public Retangulo(){
    }

    public Retangulo(double base, double altura){
        Base = base;
        Altura = altura;
    }

    public Retangulo(double base, double altura, String cor, boolean preenchido){
        super(cor, preenchido);
        Base = base;
        Altura = altura;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double base) {
        Base = base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    @Override
    public double getArea() {
        return this.getBase() * this.getAltura();
    }

    @Override
    public double getPerimetro() {
        return 2 * (this.getBase() + this.getAltura());
    }

    @Override
    public String toString() {
        return "Retangulo[base= " + this.getBase() + " altura=" + this.getAltura() + " cor=" + this.getCor() + " preenchido=" + this.isPreenchido() + "]";
    }
}
