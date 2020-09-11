package geometria;

public abstract class Forma {

    private String Cor = "Vermelho";
    private boolean Preenchido = true;

    public Forma(){
    }

    public Forma(String cor, boolean preenchido){
        Cor = cor;
        Preenchido = preenchido;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public boolean isPreenchido() {
        return Preenchido;
    }

    public void setPreenchido(boolean preenchido) {
        Preenchido = preenchido;
    }

    public abstract double getArea();

    public abstract double getPerimetro();

    public abstract String toString();
}
