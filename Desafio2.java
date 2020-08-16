package base2;

import javax.swing.JOptionPane;

public class Desafio2 {

	public static void main(String[] args) {
		calcula();

	}

	private static void calcula() {
		double a=0;
		String n = JOptionPane.showInputDialog("Digite um valor");
		
		for (int i = 0; i <= Double.parseDouble(n); i++) {
			
			a += (Double.parseDouble(n)-i)/(i+1);
			
		}
		System.out.println(a);
		
	}
	
}
