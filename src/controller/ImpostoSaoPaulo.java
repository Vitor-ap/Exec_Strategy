package controller;

import javax.swing.JOptionPane;

public class ImpostoSaoPaulo implements IImpostoStrategy {

	private int areaTotal;
	private int numeroComodos;
	private int valorImposto;
	
	
	@Override
	public void calculaImposto() {

		areaTotal = Integer.parseInt(JOptionPane.showInputDialog("Qual a area total?"));
		numeroComodos = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero de Comodos?"));
		valorImposto = (areaTotal * 10) + (numeroComodos * 2);
		JOptionPane.showMessageDialog(null,"Valor do imposto é : R$ " + valorImposto);
	}
	
	
	
}
