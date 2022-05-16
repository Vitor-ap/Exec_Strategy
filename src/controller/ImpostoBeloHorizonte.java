package controller;

import javax.swing.JOptionPane;

public class ImpostoBeloHorizonte implements IImpostoStrategy {

	private int areaTotal;
	private int numeroQuartos;
	private int valorImposto;
	
	
	@Override
	public void calculaImposto() {

		areaTotal = Integer.parseInt(JOptionPane.showInputDialog("Qual a area total?"));
		numeroQuartos = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero de quartos?"));
		valorImposto = (areaTotal * 7) + (numeroQuartos * 4);
		JOptionPane.showMessageDialog(null,"Valor do imposto é : R$ " + valorImposto);
		
	}

}
