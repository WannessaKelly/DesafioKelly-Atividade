package base5;

import javax.swing.JOptionPane;

public class Fibonacci {

	public static void main(String[] args) {
		fibonacci();
	}

	private static void fibonacci() {
		String num = JOptionPane.showInputDialog("Digite um número:");
		int anterior = 0;
		int atual = 1;
		int temp = 0;

		while (atual <= Integer.parseInt(num)) {
			System.out.print(atual + "\t");
			temp = atual;
			atual = atual + anterior;
			anterior = temp;
		} 

	}

}
