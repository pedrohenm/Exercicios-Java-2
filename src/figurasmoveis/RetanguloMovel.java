package figurasmoveis;

public class RetanguloMovel implements Movel{

    private PontoMovel SuperiorEsquerdo;
    private PontoMovel InferiorDireito;

    public RetanguloMovel(PontoMovel superiorEsquerdo, PontoMovel inferiorDireito){
        SuperiorEsquerdo = superiorEsquerdo;
        InferiorDireito = inferiorDireito;
    }

    public String toString(){
        return "RetanguloMovel[" + SuperiorEsquerdo.toString() + ", " + InferiorDireito.toString() + "]";
    }

    @Override
    public void moverParaCima() {
        SuperiorEsquerdo.moverParaCima();
        InferiorDireito.moverParaCima();
    }

    @Override
    public void moverParaBaixo() {
        SuperiorEsquerdo.moverParaBaixo();
        InferiorDireito.moverParaBaixo();
    }

    @Override
    public void moverParaEsquerda() {
        SuperiorEsquerdo.moverParaEsquerda();
        InferiorDireito.moverParaEsquerda();
    }

    @Override
    public void moverParaDireita() {
        SuperiorEsquerdo.moverParaDireita();
        InferiorDireito.moverParaDireita();
    }
}
