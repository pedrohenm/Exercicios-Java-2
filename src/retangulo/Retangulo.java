package retangulo;

public class Retangulo
{
    private float Comprimento;
    private float Largura;

    public Retangulo(){

    }

    public Retangulo(float comprimento, float largura)
    {
        Comprimento = comprimento;
        Largura = largura;
    }

    public float Perimetro(float comprimento, float largura)
    {
        return 2*(comprimento + largura);
    }

    public float Area(float comprimento, float largura)
    {
        return (comprimento * largura);
    }

    public float getComprimento() {
        return Comprimento;
    }

    public void setComprimento(float comprimento) throws Exception {
        if(comprimento > 0.0)
            Comprimento = comprimento;
        else
            throw new Exception("O comprimento não pode ser menor que 0");
    }

    public float getLargura() {
        return Largura;
    }

    public void setLargura(float largura) throws Exception {
        if(largura > 0.0)
            Largura = largura;
        else
            throw new Exception("A largura não pode ser menor que 0");
    }
}
