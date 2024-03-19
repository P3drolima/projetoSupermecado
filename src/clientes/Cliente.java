package clientes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {

    private String nome;
    private int idade;

    public Cliente() {

    }

    //Criando lista de produtos
    private List<CarrinhoCliente> produtos = new ArrayList<CarrinhoCliente>();

    public List<CarrinhoCliente> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<CarrinhoCliente> produtos) {
        this.produtos = produtos;
    }

    //Getters e Setters do Nome e idade
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Equals e Hashcode
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


    //To String
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", produtos=" + produtos +
                '}';
    }
}


