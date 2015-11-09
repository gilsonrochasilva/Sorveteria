package br.ufpa.easoftware.sorveteria;

/**
 * Created by gilson on 06/11/15.
 */
public class CoberturaChocolate extends SorveteDecorator {

    public CoberturaChocolate(Sorvete sorvete) {
        super(sorvete);
        nome = "CoberturaChocolate";
        preco = 0.5;
    }
}
