package especificas;

import basicas.Objeto;

public abstract class ObjetoOculto extends Objeto{
    //public boolean visivel;
    public ObjetoOculto(String nome, String descricaoAntesAcao, String descricaoDepoisAcao) {
        super(nome, descricaoAntesAcao, descricaoDepoisAcao);
        //this.visivel = false;
    }

    /*public void revela(){
        this.visivel = true;
    } */

    public abstract boolean isVisivel();
}
