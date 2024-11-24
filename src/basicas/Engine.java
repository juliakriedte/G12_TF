package basicas;

import java.util.Scanner;

import Jogo.Ferramentas.Lanterna;

public abstract class Engine {
    private Mochila mochila;
    private Sala salaCorrente;
    private boolean fim;
    private Scanner scanner;

    public Engine() {
        this.mochila = new Mochila(3);
        this.salaCorrente = null;
        this.fim = false;
        scanner = new Scanner(System.in);
        criaCenario();
    }

    public Mochila getMochila() {
        return mochila;
    }

    public Sala getSalaCorrente() {
        return salaCorrente;
    }

    public void setSalaCorrente(Sala sala) {
        this.salaCorrente = sala;
    }

    public void indicaFimDeJogo() {
        this.fim = true;
    }

    public abstract void criaCenario();

    /// Retorna true na vitoria, false na derrota
    public boolean joga() {
        while (!fim) {
            Ferramenta fe = getMochila().buscarFerramenta("Lanterna");
            if (fe != null) {
                Lanterna l = (Lanterna) fe;
                if (l.isSemEnergia()) {
                    System.out.println("A energia da sua lanterna acabou.");
                    System.out.println("Você, frustrado, joga ela na parede com força.");
                    System.out.println(
                            "Ops. Você deu azar. A parede que você tacou estava muito fragil e a casa desmorona em cima de você.");
                    System.out.println("Você perdeu. Tente novamente.");
                    System.out.println("Na próxima, não fique sem bateria.");
                    return false;
                }
            }
            System.out.println("-------------------------");
            System.out.println(salaCorrente.textoDescricao());
            System.out.print("O que você deseja fazer? ");
            String acao = scanner.nextLine();
            String[] tokens = acao.split(" ");
            switch (tokens[0]) {
                case "fim":
                    fim = true;
                    break;
                case "pega":
                    if (salaCorrente.pega(tokens[1])) {
                        System.out.println("Ok! " + tokens[1] + " guardado!");
                    } else {
                        System.out.println("Objeto " + tokens[1] + " não encontrado.");
                    }
                    break;
                case "inventario":
                    System.out.println("Ferramentas disponíveis para ser usada: "
                            + (!mochila.isEmpty() ? mochila.listarNomesFerramentas() : "Nenhuma"));
                    break;
                case "usa":
                    Ferramenta f = getMochila().buscarFerramenta(tokens[1]);
                    if (f == null) {
                        System.out.println("Ferramenta não existe.");
                    } else if (salaCorrente.usa(f)) {
                        if (fim) {
                            System.out.println("Parabéns, você venceu!");
                        }
                    } else {
                        System.out.println("Não é possível usar " + tokens[1] + " nesta sala");
                    }
                    break;
                case "vai":
                    Sala novaSala = salaCorrente.vai(tokens[1]);
                    if (novaSala == null) {
                        System.out.println("Sala desconhecida ...");
                    } else {
                        salaCorrente = novaSala;
                    }
                    break;
                default:
                    System.out.println("Comando desconhecido: " + tokens[0]);
                    break;
            }
        }
        System.out.println("Jogo encerrado!");
        scanner.close();
        return true;
    }
}