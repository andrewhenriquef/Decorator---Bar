package bebida;

public abstract class Bebida {

	protected String descricao = "Bebida desconhecida";
	
	
	
	public String getDescricao()
	{
		return this.descricao;
	}
	
	public abstract double getPreco();
	
}
