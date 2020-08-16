import javax.swing.JOptionPane;

public class Desafio3 {

	public static void main(String[] args) {
		contaLetra();

	}
	
	private static void contaLetra() {
		String frase = JOptionPane.showInputDialog("Digite a frase");
		
		int total=0;

		for(int i=0; i<frase.length();i++){
			char ch = frase.charAt(i);
			String frase2 = String.valueOf(ch);
			
			if(frase2.equalsIgnoreCase("a")){
				total=total+1;

			}
		}

		System.out.println("Total de A = " + total);

		
		
	}

}
