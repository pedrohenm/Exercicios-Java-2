package json;

import java.util.ArrayList;
import java.util.List;

public class Fatura {

    private String Codigo;
    private String Descricao;
    private int Quantidade;
    private double Preco;

    public Fatura(){
    }

    public Fatura(String codigo, String descricao, int quantidade, double preco){
        Codigo = codigo;
        Descricao = descricao;
        Quantidade = quantidade;
        Preco = preco;
    }

    public double totalFaturado(int quantidade, double preco){
        return quantidade * preco;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }
}
