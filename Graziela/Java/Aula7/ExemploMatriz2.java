public class ExemploMatriz2 {
	public static void main(String args[]) {
		int[][] notas = new int[2][1];
		double soma = 0;
		notas[0][0] = 32;
		notas[1][0] = 15;
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				soma = soma + notas[i][j];
			}
			System.out.println("Soma notas = " + soma);
		}
	}
}
