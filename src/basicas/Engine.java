package basicas;

import java.util.Scanner;

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

    public void joga() {
        while (!fim) {
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
                        System.out.println("Feito!!");
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
    }
}