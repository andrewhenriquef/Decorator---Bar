package application;

import bebida.*;
import bebidadecorator.*;

public class Bar {

	public static void main(String[] args) {
		Bar bar = new Bar();
		Bebida caipirinha = new Rum();
		
		caipirinha = new Limao(caipirinha);
		caipirinha = new Gelo(caipirinha);
		caipirinha = new Acucar(caipirinha);
		
		bar.imprimeNota(caipirinha);

		
		
	}

	public void imprimeNota(Bebida bebida){
		
		System.out.println(bebida.getDescricao() + bebida.getPreco());
	}
}
