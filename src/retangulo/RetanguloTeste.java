package retangulo;

public class RetanguloTeste {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();
        var perimetro = 0.0f;
        var area = 0.0f;

        try{
            retangulo.setComprimento(Float.parseFloat(args[0]));
            retangulo.setLargura(Float.parseFloat(args[1]));
            perimetro = retangulo.Perimetro(retangulo.getComprimento(), retangulo.getLargura());
            area = retangulo.Area(retangulo.getComprimento(), retangulo.getLargura());
            System.out.println("Area: " + area);
            System.out.println("Perimetro: " + perimetro);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
