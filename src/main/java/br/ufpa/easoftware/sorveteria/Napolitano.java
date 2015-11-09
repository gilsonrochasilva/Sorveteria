package br.ufpa.easoftware.sorveteria;

/**
 * Created by gilson on 06/11/15.
 */
public class Napolitano extends SorveteDecorator {

    public Napolitano(Sorvete sorvete) {
        super(sorvete);
        nome = "Napolitano";
        preco = 1.5;
    }
}
