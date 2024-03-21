// CarrinhoCliente.java
package clientes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarrinhoCliente {

    private List<String> produtos;

    public CarrinhoCliente(){
        this.produtos = new ArrayList<>();
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<String> produtos) {
        this.produtos = produtos;
    }

    // Adiciona um produto ao carrinho
    public void adicionarProduto(String produto) {
        produtos.add(produto);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarrinhoCliente that = (CarrinhoCliente) o;
        return Objects.equals(produtos, that.produtos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(produtos);
    }

    @Override
    public String toString() {
        return "CarrinhoCliente{" +
                "produtos=" + produtos +
                '}';
    }
}
