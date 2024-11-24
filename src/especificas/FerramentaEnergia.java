package especificas;

import basicas.Ferramenta;

public abstract class FerramentaEnergia extends Ferramenta {
    private int energiaAtual;
    private int capacidadeMaxima;

    public FerramentaEnergia(String nome) {
        super(nome);
        this.capacidadeMaxima = 5;
        this.energiaAtual = 3;
    }

    public double getEnergiaAtual() {
        return energiaAtual;
    }

    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public boolean isSemEnergia() {
        return energiaAtual <= 0;
    }

    @Override
    public boolean usar() {
        if (energiaAtual == 0) {
            return false;
        }
        energiaAtual -= 1;
        System.out.println("A energia de " + getNome() + " é: " + getEnergiaAtual());
        return true;
    }

    public void recarregar() {
        energiaAtual = capacidadeMaxima;
        System.out.println("A energia de " + getNome() + " é: " + getEnergiaAtual());
    }
}