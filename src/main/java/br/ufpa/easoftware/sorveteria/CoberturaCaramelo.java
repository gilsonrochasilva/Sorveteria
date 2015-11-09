package br.ufpa.easoftware.sorveteria;

/**
 * Created by gilson on 06/11/15.
 */
public class CoberturaCaramelo extends SorveteDecorator {

    public CoberturaCaramelo(Sorvete sorvete) {
        super(sorvete);
        nome = "CoberturaCaramelo";
        preco = 0.5;
    }
}
