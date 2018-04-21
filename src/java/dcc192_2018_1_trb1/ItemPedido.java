package dcc192_2018_1_trb1;

public class ItemPedido {

    int quantidade;
    Double preco;
    String nome;

    public ItemPedido(String nome, int quantidade, Double valor) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.preco = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
