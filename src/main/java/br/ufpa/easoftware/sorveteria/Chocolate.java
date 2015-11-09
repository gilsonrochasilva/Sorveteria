package br.ufpa.easoftware.sorveteria;

/**
 * Created by gilson on 06/11/15.
 */
public class Chocolate extends SorveteDecorator {

    public Chocolate(Sorvete sorvete) {
        super(sorvete);
        nome = "Chocolate";
        preco = 1.5;
    }
}
