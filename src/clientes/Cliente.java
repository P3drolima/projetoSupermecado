// Cliente.java
package clientes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {

    private String nome;
    private int idade;
    private List<CarrinhoCliente> produtos;

    // Construtor
    public Cliente(String nome) {
        this.nome = nome;
        this.produtos = new ArrayList<>();
    }

    // Adiciona um item ao carrinho do cliente
    public void adicionarItem(CarrinhoCliente item){
        produtos.add(item);
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Equals e Hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return idade == cliente.idade && Objects.equals(nome, cliente.nome) && Objects.equals(produtos, cliente.produtos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, produtos);
    }

    // To String

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", produtos=" + produtos +
                '}';
    }
}
