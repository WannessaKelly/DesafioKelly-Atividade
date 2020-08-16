package base;

public class Desafio1 {

	public static void main(String[] args) {

		totalGraos();
	}

	private static void totalGraos() {
		double qtdGraos = 1;
		double qtdGraosDobro = 1;
		double soma = 0;
		int i;

		for (i = 1; i <= 64; i++) {
            
			qtdGraosDobro *= 2;
			qtdGraos += qtdGraosDobro;
			soma = soma + qtdGraosDobro;

			System.out.println("casa: " + i + " - QTD: " + qtdGraosDobro + " - Soma: " + soma); // imprime

		}

	
	}

}
