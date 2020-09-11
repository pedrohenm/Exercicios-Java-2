package figurasmoveis;

public class CirculoMovel implements Movel{

    private int Raio;
    private PontoMovel Centro;

    public CirculoMovel(int x, int y, int velX, int velY, int raio){
        Raio = raio;
    }

    @Override
    public void moverParaCima() {
        Centro.moverParaCima();
    }

    @Override
    public void moverParaBaixo() {

    }

    @Override
    public void moverParaEsquerda() {

    }

    @Override
    public void moverParaDireita() {

    }
}
