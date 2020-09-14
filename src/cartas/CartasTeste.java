package cartas;

public class CartasTeste {
    public static void main(String[] args) throws Exception {
        Baralho baralho = new Baralho();
        baralho.embaralhar();
        baralho.distribuir();
    }
}
