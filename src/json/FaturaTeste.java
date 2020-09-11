package json;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FaturaTeste {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();

        try {

            BufferedReader br = new BufferedReader(new FileReader("./faturas.json"));

            //Converte String JSON para objeto Java
            Fatura obj = gson.fromJson(br, Fatura.class);

            System.out.println(obj.getDescricao());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
