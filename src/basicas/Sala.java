package basicas;

import Jogo.Ferramentas.Chave;
import especificas.FerramentaDescartavel;
import especificas.FerramentaDescartavelOculta;
import especificas.FerramentaOculta;
import especificas.ObjetoDescartavel;
import especificas.ObjetoOculto;
import especificas.SalaOculta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Sala {
    private String nome;
    private Map<String, Objeto> objetos;
    private Map<String, Ferramenta> ferramentas;
    private Map<String, Sala> portas;
    private Engine engine;

    public Sala(String nome, Engine engine) {
        this.nome = nome;
        this.objetos = new HashMap<>();
        this.ferramentas = new HashMap<>();
        this.portas = new HashMap<>();
        this.engine = engine;
    }

    public String getNome() {
        return nome;
    }

    public Map<String, Objeto> getObjetos() {
        return objetos;
    }

    public Map<String, Ferramenta> getFerramentas() {
        return ferramentas;
    }

    public Map<String, Sala> getPortas() {
        return portas;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<String> objetosDisponiveis() {
        List<String> descricoes = new ArrayList<>();
        for (Objeto obj : objetos.values()) {
            if (obj instanceof ObjetoOculto) {
                if (((ObjetoOculto) obj).isVisivel()) {
                    descricoes.add(obj.getNome() + ": " + obj.getDescricao());
                }
            } else if (obj instanceof ObjetoDescartavel) {
                if (!((ObjetoDescartavel) obj).isUsado()) {
                    descricoes.add(obj.getNome() + ": " + obj.getDescricao());
                }
            } else {
                descricoes.add(obj.getNome() + ": " + obj.getDescricao());
            }
        }
        return descricoes;
    }

    public List<String> ferramentasDisponiveis() {
        List<String> nomes = new ArrayList<>();
        for (Ferramenta fer : ferramentas.values()) {
            if (fer instanceof FerramentaOculta) {
                if (((FerramentaOculta) fer).isVisivel()) {
                    nomes.add(fer.getNome());
                }
            } else if (fer instanceof FerramentaDescartavelOculta) {
                if (!(((Chave) fer).isUsado()) && (((FerramentaDescartavelOculta) fer).isVisivel())) {
                    nomes.add(fer.getNome());
                }
            } else if (fer instanceof FerramentaDescartavel) {
                if (((FerramentaDescartavel) fer).isUsado()) {
                    nomes.add(fer.getNome());
                }
            } else {
                nomes.add(fer.getNome());
            }
        }
        return nomes;
    }

    public List<String> portasDisponiveis() {
        List<String> nomes = new ArrayList<>();
        for (Sala sala : portas.values()) {
            if(sala instanceof SalaOculta){
                if(((SalaOculta) sala).isVisivel()){
                    nomes.add(sala.getNome()); 
                }
            } else {
                nomes.add(sala.getNome());                
            }
        }
        return nomes;
    }

    public boolean pega(String nomeFerramenta) {
        Ferramenta f = ferramentas.get(nomeFerramenta);
        if (f != null) {
            engine.getMochila().adicionarFerramenta(f);
            ferramentas.remove(nomeFerramenta);
            return true;
        }
        return false;
    }

    public Sala vai(String porta) {
        return portas.get(porta);
    }

    public String textoDescricao() {
        StringBuilder descricao = new StringBuilder("Você está no " + nome + "\n");
        descricao.append(objetos.isEmpty() ? "Não há objetos na sala\n" : "Objetos: " + objetosDisponiveis() + "\n");
        descricao.append(ferramentas.isEmpty() ? "Não há ferramentas na sala\n"
                : "Ferramentas: " + ferramentasDisponiveis() + "\n");
        descricao.append("Portas: " + portasDisponiveis() + "\n");
        return descricao.toString();
    }

    public boolean usa(Ferramenta f) {
        boolean usado = false;
        if (!f.usar()) {
            return false;
        }
        for (Objeto obj : getObjetos().values()) {
            usado |= obj.usar(f);
        }
        return usado;
    }
}
