package cartas;

public class Carta {

    String Naipe;
    String Valor;

    public Carta(String valor, String naipe){
        Naipe = naipe;
        Valor = valor;
    }

    public String toString(){
        return Valor + " de " + Naipe;
    }

}
