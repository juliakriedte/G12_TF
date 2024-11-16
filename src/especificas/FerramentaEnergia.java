package especificas;
import basicas.Ferramenta;

public abstract class FerramentaEnergia extends Ferramenta {
    private double energiaAtual;
    private double capacidadeMaxima;

    public FerramentaEnergia(String nome) {
        super(nome);
        if (capacidadeMaxima <= 0) {
            throw new IllegalArgumentException("A capacidade máxima deve ser maior que 0.");
        }
        this.capacidadeMaxima = 5;
        this.energiaAtual = 3; 
    }

    public int getEnergiaAtual() {
        return energiaAtual;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public boolean isSemEnergia() {
        return energiaAtual <= 0;
    }

    @Override
    public boolean usar() {
        if (energiaAtual-0.5 < 0) {
            throw new IllegalArgumentException("Energia insuficiente para essa operação.");
            return false;
        }
        energiaAtual -= 0.5;
        return true;
    }

    public void recarregar() {
        energiaAtual = capacidadeMaxima;
    }

    public abstract void usarFerramenta();

    @Override
    public String toString() {
        return super.toString() + " [energiaAtual=" + energiaAtual + ", capacidadeMaxima=" + capacidadeMaxima + "]";
    }
}