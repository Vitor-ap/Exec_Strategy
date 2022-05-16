package controller;

import javax.swing.JOptionPane;

public class ImpostoPortoAlegre implements IImpostoStrategy {

	private int areaTotal;
	private int areaGaragem;
	private String textoMaiusculo;
	private double valorImposto;

	
	@Override
	public void calculaImposto() {

		areaTotal = Integer.parseInt(JOptionPane.showInputDialog("Qual a area total?"));
		textoMaiusculo = JOptionPane.showInputDialog("O imóvel possui Garagem (S ou N) ?").toUpperCase();		
		char letra = textoMaiusculo.charAt(0);
		
		if (letra == 'S') {
			areaGaragem = Integer.parseInt(JOptionPane.showInputDialog("Qual a area da garagem?"));
			valorImposto = areaTotal * 7.5 + areaGaragem *2.5;
			JOptionPane.showMessageDialog(null,"Valor do imposto é : R$ " + valorImposto);
		}
		else {
			valorImposto = areaTotal * 8;
			JOptionPane.showMessageDialog(null,"Valor do imposto é : R$ " + valorImposto);
		}
	
 }

}