package basicas;

import java.util.ArrayList;
import java.util.List;

public class Mochila {
    private int capacidadeMaxima;
    private List<Ferramenta> ferramentas;

    public Mochila(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.ferramentas = new ArrayList<>();
    }

    public void adicionarFerramenta(Ferramenta ferramenta) {
        if (ferramentas.size() < capacidadeMaxima) {
            ferramentas.add(ferramenta);
            System.out.println(ferramenta.getNome() + " foi adicionado(a) à mochila.");
        } else {
            System.out.println("Mochila cheia! Não é possível adicionar.");
        }
    }

    public void removerFerramenta(String nomeFerramenta) {
        Ferramenta ferramentaARemover = null;

        for (Ferramenta ferramenta : ferramentas) {
            if (ferramenta.getNome().equalsIgnoreCase(nomeFerramenta)) {
                ferramentaARemover = ferramenta;
                break;
            }
        }

        if (ferramentaARemover != null) {
            ferramentas.remove(ferramentaARemover);
            System.out.println(ferramentaARemover.getNome() + " foi removida da mochila.");
        } else {
            System.out.println("Ferramenta " + nomeFerramenta + " não encontrada na mochila.");
        }
    }

    public void listarFerramentas() {
        if (ferramentas.isEmpty()) {
            System.out.println("A mochila está vazia.");
        } else {
            System.out.println("Ferramentas na mochila:");
            for (Ferramenta ferramenta : ferramentas) {
                System.out.println("- " + ferramenta.getNome());
            }
        }
    }

    
    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    
    public List<Ferramenta> getFerramentas() {
        return ferramentas;
    }
}
