package br.ufpa.easoftware.sorveteria;

/**
 * Created by gilson on 06/11/15.
 */
public abstract class SorveteDecorator extends Sorvete {

    protected Sorvete sorvete;

    public SorveteDecorator(Sorvete sorvete) {
        this.sorvete = sorvete;
    }

    @Override
    public Double getPreco() {
        return sorvete.getPreco() + preco;
    }

    @Override
    public String getNome() {
        return sorvete.getNome() + " + " + nome;
    }
}
