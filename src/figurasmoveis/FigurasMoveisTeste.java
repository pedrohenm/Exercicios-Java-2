package figurasmoveis;


import com.sun.tools.javac.Main;

public class FigurasMoveisTeste {
    public static void main(String[] args) {

            switch (args[0]){
                case "c":
                    PontoMovel centroCirculo = new PontoMovel(Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]));
                    CirculoMovel circulo = new CirculoMovel(centroCirculo, Integer.parseInt(args[1]));

                    System.out.println(circulo.toString());
                    System.out.println();

                    circulo.moverParaCima();
                    System.out.println(circulo.toString());
                    System.out.println();

                    circulo.moverParaDireita();
                    System.out.println(circulo.toString());
                    System.out.println();

                    circulo.moverParaBaixo();
                    System.out.println(circulo.toString());
                    System.out.println();

                    circulo.moverParaEsquerda();
                    System.out.println(circulo.toString());
                    System.out.println();
                    break;

                case "r":
                    PontoMovel superiorEsquerdo = new PontoMovel(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[5]), Integer.parseInt(args[6]));
                    PontoMovel inferiorDireito = new PontoMovel(Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]), Integer.parseInt(args[6]));
                    RetanguloMovel retangulo = new RetanguloMovel(superiorEsquerdo, inferiorDireito);

                    System.out.println(retangulo.toString());
                    System.out.println();

                    retangulo.moverParaCima();
                    System.out.println(retangulo.toString());
                    System.out.println();

                    retangulo.moverParaDireita();
                    System.out.println(retangulo.toString());
                    System.out.println();

                    retangulo.moverParaBaixo();
                    System.out.println(retangulo.toString());
                    System.out.println();

                    retangulo.moverParaEsquerda();
                    System.out.println(retangulo.toString());
                    System.out.println();
                    break;
            }
    }
}
