package bebidadecorator;

import bebida.Bebida;

public abstract class BebidaDecorator extends Bebida {

	public Bebida bebida;	
	
	public abstract String getDescricao();
}
 