package geometria;

public class Quadrado extends Retangulo{

    public Quadrado(){
    }

    public Quadrado(double lado){
        super(lado, lado);
    }

    public Quadrado(double lado, String cor, boolean preenchido){
        super(lado, lado, cor, preenchido);
    }

    public double getLado(){
        return this.getBase();
    }

    public void setLado(double lado){
        this.setBase(lado);
    }

    @Override
    public String toString(){
        return "Quadrado[lado= " + this.getLado() + " cor=" + this.getCor() + " preenchido=" + this.isPreenchido() + "]";
    }

}
