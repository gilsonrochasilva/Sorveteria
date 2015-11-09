package br.ufpa.easoftware.sorveteria;

/**
 * Created by gilson on 06/11/15.
 */
public class Morango extends SorveteDecorator {

    public Morango(Sorvete sorvete) {
        super(sorvete);
        nome = "Morango";
        preco = 1.5;
    }
}
