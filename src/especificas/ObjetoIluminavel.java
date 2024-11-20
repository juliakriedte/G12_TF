package especificas;
import Jogo.Ferramentas.Lanterna;
import basicas.Ferramenta;
import basicas.Objeto;

public abstract class ObjetoIluminavel extends Objeto{
    public boolean visivel;
    public ObjetoIluminavel(String nome, String descricaoAntesAcao, String descricaoDepoisAcao) {
        super(nome, descricaoAntesAcao, descricaoDepoisAcao);
        this.visivel = false;
    }

    public void revela(){
        this.visivel = true;
    }

    public boolean isVisivel(){
        return visivel;
    }

    @Override
	public boolean usar(Ferramenta ferramenta) {
		if (ferramenta instanceof Lanterna lanterna) {
			if(!lanterna.isSemEnergia()){
				this.setAcaoOk(true);
				this.visivel = true;		
				return true;		
			} 
			return false;	
		}
		return false;
	}

    @Override
    public String getDescricao(){
        if (this.visivel){
            String msg = super.getDescricao();
            visivel = false;
            return msg;
        }else{
            return "O objeto não está iluminado";
        }
    }
}
