package basicas;

import java.util.ArrayList;
import java.util.List;

public class Mochila {
    private final int capacidadeMaxima;
    private final List<Ferramenta> ferramentas;

    public Mochila(int capacidadeMaxima) {
        if (capacidadeMaxima <= 0) {
            throw new IllegalArgumentException("Capacidade máxima deve ser maior que zero.");
        }
        this.capacidadeMaxima = capacidadeMaxima;
        this.ferramentas = new ArrayList<>();
    }

    public boolean adicionarFerramenta(Ferramenta ferramenta) {
        if (ferramenta == null) {
            throw new IllegalArgumentException("Ferramenta não pode ser nula.");
        }
        if (ferramentas.size() < capacidadeMaxima) {
            ferramentas.add(ferramenta);
            return true;
        }
        return false;
    }

    public boolean removerFerramenta(String nomeFerramenta) {
        if (nomeFerramenta == null || nomeFerramenta.isEmpty()) {
            throw new IllegalArgumentException("Nome da ferramenta não pode ser nulo ou vazio.");
        }

        return ferramentas.removeIf(f -> f.getNome().equalsIgnoreCase(nomeFerramenta));
    }

    public List<String> listarNomesFerramentas() {
        List<String> nomes = new ArrayList<>();
        for (Ferramenta ferramenta : ferramentas) {
            nomes.add(ferramenta.getNome());
        }
        return nomes;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public List<Ferramenta> getFerramentas() {
        return new ArrayList<>(ferramentas);
    }
}
