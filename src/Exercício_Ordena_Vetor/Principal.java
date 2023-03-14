package Exercício_Ordena_Vetor;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Organizador org = new Organizador();
		
		int vetor[] = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		
		int tamanho = vetor.length;
		
		int n = 0;
		
		JFrame popup = new JFrame ();
		
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione uma opção para ordenar o vetor [69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1] : \n 1 - Buble Sort \n 2 - Merge Sort \n 9 - Finalizar"));
			switch(n) {
				case 1 :
					org.OrgBuble(vetor, tamanho - 1);
					break;
				case 2 :
					org.OrgMerge(vetor, tamanho - 1);
					break;
				case 9 :
					JOptionPane.showMessageDialog(popup, "Fim.");
					System.exit(0);
				default :
					JOptionPane.showMessageDialog(popup, "Opção inválida! Opções válidas: 1, 2 ou 9.");
					break;
			}
		}while(n != 9);
				
				
	}

}
