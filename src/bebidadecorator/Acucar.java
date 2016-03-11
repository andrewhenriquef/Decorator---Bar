package bebidadecorator;

import bebida.Bebida;

public class Acucar extends BebidaDecorator{
	
	public Acucar(Bebida b){
		
		this.bebida = b;
	}
	
	public String getDescricao(){
		return bebida.getDescricao() + ", acucar";
	}
	
	public double getPreco(){
		
		return bebida.getPreco() + 1.00;
	}
}
