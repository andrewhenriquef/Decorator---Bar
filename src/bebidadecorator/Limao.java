package bebidadecorator;

import bebida.Bebida;

public class Limao extends BebidaDecorator{

	public Limao(Bebida b){
		
		this.bebida = b;
	}
	
	public String getDescricao(){
		return bebida.getDescricao() + ", Limao";
	}
	
	public double getPreco(){
		
		return bebida.getPreco() + 0.50;
	}
		
	
	
}
