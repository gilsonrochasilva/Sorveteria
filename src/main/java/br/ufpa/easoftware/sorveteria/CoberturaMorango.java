package br.ufpa.easoftware.sorveteria;

/**
 * Created by gilson on 06/11/15.
 */
public class CoberturaMorango extends SorveteDecorator {

    public CoberturaMorango(Sorvete sorvete) {
        super(sorvete);
        nome = "CoberturaMorango";
        preco = 0.5;
    }
}
