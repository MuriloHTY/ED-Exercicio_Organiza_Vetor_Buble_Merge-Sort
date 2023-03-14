package Exercício_Ordena_Vetor;

import javax.swing.JOptionPane;

import br.edu.fateczl.ordenavet.Operacoes;

public class Organizador {
	Operacoes opVet = new Operacoes();
			
		public void OrgBuble(int[] vetor, int tamanho) {
			JOptionPane.showMessageDialog(null, "A ordenação correta deste vetor utilizando Buble Sort é: "+java.util.Arrays.toString(opVet.opBuble(vetor, tamanho)));
		}
		public void OrgMerge(int[] vetor, int tamanho) {
			JOptionPane.showMessageDialog(null, "A ordenação correta deste vetor utilizando Merge Sort é: "+java.util.Arrays.toString(opVet.opMerge(vetor, 0,  tamanho)));
		}		
}

