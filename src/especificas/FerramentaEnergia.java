package especificas;
import basicas.Ferramenta;

public abstract class FerramentaEnergia extends Ferramenta {
    private double energiaAtual;
    private double capacidadeMaxima;

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
        if (energiaAtual-0.5 < 0) {
            throw new IllegalArgumentException("Energia insuficiente para essa operação.");
        }
        energiaAtual -= 0.5;
        return true;
    }

    public void recarregar() {
        energiaAtual = capacidadeMaxima;
    }
}