package br.ufpa.easoftware.sorveteria;

/**
 * Created by gilson on 06/11/15.
 */
public class Flocos extends SorveteDecorator {

    public Flocos(Sorvete sorvete) {
        super(sorvete);
        nome = "Flocos";
        preco = 1.5;
    }
}
