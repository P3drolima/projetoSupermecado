package executavel;

import clientes.Cliente;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<Cliente>();

        int iniciacao = JOptionPane.showConfirmDialog(null, "Hello, Vamos inciar as compras? ");
        if (iniciacao == 0) {
            String nomeCliente = JOptionPane.showInputDialog("Escreva seu nome");
            String idadeCliente = JOptionPane.showInputDialog("Escreva sua idade");
            clientes.add(new Cliente());

            int inserirItens = JOptionPane.showConfirmDialog(null, "Deseja inserir itens na lista? ");
            if (inserirItens == 0) {
                do {
                    String inciarLista = JOptionPane.showInputDialog("Escreva o item");
                    clientes.add(new Cliente());
                    if (inserirItens != 0) {
                        JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso programa");
                    }
                }while(true);
            } else {
                JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso programa");
            }


        }


    }
}