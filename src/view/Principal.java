package view;

import javax.swing.JOptionPane;

import controller.IImpostoStrategy;
import controller.ImpostoBeloHorizonte;
import controller.ImpostoCuritiba;
import controller.ImpostoPortoAlegre;
import controller.ImpostoSaoPaulo;

public class Principal {

	public static void main(String[] args) {
		IImpostoStrategy imposto;
		int opc = Integer.parseInt(JOptionPane.showInputDialog("Calcule o imposto com base na no estado: \n\n1 - Sao Paulo\n\n2 - Belo Horizonte\n\n3 - Porto Alegre\n\n4 - Curitiba \n  "));
					
			switch (opc) {
			case 1: 
				imposto = new ImpostoSaoPaulo();
				imposto.calculaImposto();
				break;
			case 2:
				imposto = new ImpostoBeloHorizonte();
				imposto.calculaImposto();
				break;
			case 3:
				imposto = new ImpostoPortoAlegre();
				imposto.calculaImposto();
				break;
			case 4:
				imposto = new ImpostoCuritiba();
				imposto.calculaImposto();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcao Invalida. Encerrando Exercicio");
			}
			
		}	
		
}

