package br.ufpa.easoftware;

import br.ufpa.easoftware.sorveteria.*;

/**
 * Created by gilson on 06/11/15.
 */
public class SimulaPedido {

    public static void main(String args[]) {
        Sorvete sorvete = new Taca();
        sorvete = new Chocolate(sorvete);
        sorvete = new Pave(sorvete);
        sorvete = new CoberturaCaramelo(sorvete);

        System.out.println("Pedido: " + sorvete.getNome());
        System.out.println("Preço: " + sorvete.getPreco());
    }
}
