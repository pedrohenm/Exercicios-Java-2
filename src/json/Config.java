package json;

import java.util.ArrayList;
import java.util.List;

public class Config {


    private List<String> lista;

    public Config(){
        lista = new ArrayList<>();
    }

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }
}

