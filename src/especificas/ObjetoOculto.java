package especificas;
import basicas.Objeto;

public abstract class ObjetoOculto extends Objeto{
    public boolean visivel;
    public ObjetoOculto(String nome, String descricaoDepoisAcao) {
        super(nome, "", descricaoDepoisAcao);
        this.visivel = false;
    }

    public void revela(){
        this.visivel = true;
    }
}
