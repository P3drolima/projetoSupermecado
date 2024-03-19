package clientes;

import java.util.Objects;

public class CarrinhoCliente {

    private String produtos;

    public java.lang.String getProdutos() {
        return produtos;
    }

    public void setProdutos(java.lang.String produtos) {
        this.produtos = produtos;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        CarrinhoCliente that = (CarrinhoCliente) object;
        return java.util.Objects.equals(produtos, that.produtos);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), produtos);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "CarrinhoCliente{" +
                "produtos=" + produtos +
                '}';
    }
}
