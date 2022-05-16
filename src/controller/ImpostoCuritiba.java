package controller;

import javax.swing.JOptionPane;

public class ImpostoCuritiba implements IImpostoStrategy {

	
	private int areaTotal;
	private int idadeImovel;
	private double valorImposto;
	
	
	
	@Override
	public void calculaImposto() {

		areaTotal = Integer.parseInt(JOptionPane.showInputDialog("Qual a area total?"));
		idadeImovel = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do Imovel?"));
		
		if (idadeImovel > 50) {
			valorImposto = (areaTotal * 5) + (idadeImovel * 3);
		} else if (idadeImovel <20) {
			valorImposto = (areaTotal * 5) + (idadeImovel * 2);
		}else {
			valorImposto = (areaTotal *5) + (idadeImovel * 2.5);
		}
		

		JOptionPane.showMessageDialog(null,"Valor do imposto é : R$ " + valorImposto);
		
		
	}

	
	
	
	
	
}
