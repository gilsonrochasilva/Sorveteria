package br.ufpa.easoftware.sorveteria;

/**
 * Created by gilson on 06/11/15.
 */
public class Pave extends SorveteDecorator {

    public Pave(Sorvete sorvete) {
        super(sorvete);
        nome = "Pave";
        preco = 1.5;
    }
}
