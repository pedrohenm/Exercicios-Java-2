package json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FaturaTeste {
    public static void main(String[] args) {

        Fatura fatura = new Fatura();
        double valorTotalFaturas = 0;
        int numeroFaturas = 0;


        try(FileReader reader = new FileReader("faturas.json")) {
            JSONObject obj=(JSONObject) JSONValue.parse(reader);
            JSONArray emplist=(JSONArray)obj.get("faturas");

            for(int i = 0; i < emplist.size(); i++){
                JSONObject empObj = (JSONObject) emplist.get(i);
                fatura.setPreco((Double) empObj.get("preco"));
                fatura.setQuantidade(((Long) empObj.get("quantidade")).intValue());

                valorTotalFaturas += fatura.totalFaturado(fatura.getQuantidade(), fatura.getPreco());

                numeroFaturas++;
            }

            System.out.printf("Total das fatura: %.2f", valorTotalFaturas);
            System.out.printf(" (%d faturas)", numeroFaturas);

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
