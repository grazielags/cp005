import java.util.Random;

public class Exercício4 {
	public static void main(String[] args) {
		int matriz1[][] = new int [3][3];
		int matriz2[][] = new int [3][3];
		int matriz3[][] = new int [3][3];
		String saida1 = "";
		String saida2 = "";
		String saida3 = "";
		for(int l = 0; l < matriz1.length; l++) {
			for(int c = 0; c < matriz1[l].length; c++) {
				matriz1[l][c] = new Random().nextInt(100);
				matriz2[l][c] = new Random().nextInt(100);
				matriz3[l][c] = matriz1[l][c] * matriz2[l][c];
				saida1 += " [" + matriz1[l][c] + "]";
				saida2 += " [" + matriz2[l][c] + "]";
				saida3 += " [" + matriz3[l][c] + "]";
			}
			saida1 += "\n";
			saida2 += "\n";
			saida3 += "\n";
		}
		System.out.println("Matriz1:\n" + saida1);
		System.out.println("Matriz2:\n" + saida2);
		System.out.println("Matriz1 x Matriz2:\n" + saida3);
	}
}
