package cartas;

import java.util.*;

public class Baralho {

    private ArrayList Monte;
    private int CartaAtual = 52;
    private final int TOTAL_DE_CARTAS = 52;
    private final String VALORES[]  = {"Ás", "2", "3", "4", "5", "6", "7",
                                "8", "9", "10", "Valete", "Rainha", "Rei"} ;
    private final String NAIPES[] = {"Paus", "Ouros", "Copas", "Espadas"};


    public Baralho(){
        Monte = new ArrayList(TOTAL_DE_CARTAS);
        for(int i = 0; i < 1; i++){
            for(int j = 0; j < VALORES.length; j++) {
                for(int k = 0; k <= 3; k++){
                    Carta carta = new Carta(VALORES[j],NAIPES[k]);
                    Monte.add(carta);
                }
            }
        }
    }

    public void embaralhar(){
        Collections.shuffle(Monte);
    }

    public void distribuir() throws Exception {
        for(CartaAtual = 0; CartaAtual < TOTAL_DE_CARTAS; CartaAtual++){
            System.out.println("Disribuindo " + Monte.get(CartaAtual));
        }
        System.out.println("Nenhuma carta no baralho! Fim de jogo!");
    }
}
