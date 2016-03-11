package bebidadecorator;

import bebida.Bebida;

public class Gelo extends BebidaDecorator{
	
public Gelo(Bebida b){
		
		this.bebida = b;
	}
	
	public String getDescricao(){
		return bebida.getDescricao() + ", Gelo";
	}
	
	public double getPreco(){
		
		return bebida.getPreco() + 0.20;
	}

}
