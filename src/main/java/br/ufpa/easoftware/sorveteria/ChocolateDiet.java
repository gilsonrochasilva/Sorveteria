package br.ufpa.easoftware.sorveteria;

/**
 * Created by gilson on 06/11/15.
 */
public class ChocolateDiet extends SorveteDecorator {

    public ChocolateDiet(Sorvete sorvete) {
        super(sorvete);
        nome = "ChocolateDiet";
        preco = 2D;
    }
}
