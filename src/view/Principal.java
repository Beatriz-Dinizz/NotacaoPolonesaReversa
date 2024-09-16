package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.pilhaIntString.PilhaInt;
import controller.NPRController;

public class Principal {

	public static void main(String[] args) {
		PilhaInt pilhaInt = new PilhaInt();
		NPRController npr = new NPRController();
		
		int opc = 0;
		
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal \n Escolha uma operação: \n 1 - Inserir valor "
					+ "\n 2 - Informar a operação(+, -, *, /) \n 9 - Finalizar"));
			switch(opc) {
				case 1:
					int valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor: "));
					npr.inserirValor(pilhaInt, valor);
					break;
				case 2:
					String op = "";
					while(true) {
						op = JOptionPane.showInputDialog("Informe a operação a ser realizada(+, -, *, /): ");
						if(op.contains("+") || op.contains("-") || op.contains("*") || op.contains("/")) {
							break;
						}
					}
					System.out.println(npr.npr(pilhaInt, op));
					break;
				case 9:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		}
	}
}
