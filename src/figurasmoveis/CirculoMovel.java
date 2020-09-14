package figurasmoveis;

public class CirculoMovel implements Movel{

    private int Raio;
    private PontoMovel Centro;

    public CirculoMovel(PontoMovel centro, int raio){
        Centro = centro;
        Raio = raio;
    }

    public String toString(){
        return "CírculoMovel[raio=" + this.Raio + ", " + Centro.toString();
    }

    @Override
    public void moverParaCima() {
        Centro.moverParaCima();
    }

    @Override
    public void moverParaBaixo() {
        Centro.moverParaBaixo();
    }

    @Override
    public void moverParaEsquerda() {
        Centro.moverParaEsquerda();
    }

    @Override
    public void moverParaDireita() {
        Centro.moverParaDireita();
    }
}
