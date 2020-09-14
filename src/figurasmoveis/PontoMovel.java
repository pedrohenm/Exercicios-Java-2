package figurasmoveis;

public class PontoMovel implements Movel{

    private int X;
    private int Y;
    private int VelX;
    private int VelY;

    public PontoMovel(int x, int y, int velX, int velY){
        X = x;
        Y = y;
        VelX = velX;
        VelY = velY;
    }

    public String toString(){
        return "PontoMovel[x=" + this.X + ", y=" + this.Y + ", velX=" + this.VelX + ", velY=" + this.VelY + "]";
    }

    @Override
    public void moverParaCima() {
        this.Y++;
        System.out.println("Movendo para cima");
    }

    @Override
    public void moverParaBaixo() {
        this.Y--;
        System.out.println("Movendo para baixo");
    }

    @Override
    public void moverParaEsquerda() {
        this.X--;
        System.out.println("Movendo para esquerda");
    }

    @Override
    public void moverParaDireita() {
        this.X++;
        System.out.println("Movendo para direita");
    }
}
