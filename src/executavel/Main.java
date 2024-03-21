// Main.java
package executavel;

import clientes.Cliente;
import clientes.CarrinhoCliente;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>(); //Criação de um array list clientes

        int iniciacao = JOptionPane.showConfirmDialog(null, "Hello, Vamos iniciar as compras? ");

        if (iniciacao == 0) {
            String nomeCliente = JOptionPane.showInputDialog("Escreva seu nome");
            Cliente cliente = new Cliente(nomeCliente); // Criando objeto com o nome fornecido
            clientes.add(cliente);

            int inserirItem;
            do {
                String iniciarLista = JOptionPane.showInputDialog("Escreva seu item na lista");
                CarrinhoCliente carrinhoCliente = new CarrinhoCliente();
                carrinhoCliente.adicionarProduto(iniciarLista);
                cliente.adicionarItem(carrinhoCliente); // Adicionando o item ao carrinho do cliente
                inserirItem = JOptionPane.showConfirmDialog(null,"Deseja inserir mais itens? ");
            } while (inserirItem == 0);
            if(inserirItem !=0){
                StringBuilder listaItem = new StringBuilder("Esses são meus itens");
                for(Cliente inciarLista : clientes){



                //Terminar a construção



                }
                JOptionPane.showMessageDialog(null,listaItem.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso programa");
        }
    }
}
