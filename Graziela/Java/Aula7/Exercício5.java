import java.util.Random;

import javax.swing.JOptionPane;

public class Exercício5 {
	public static void main(String[] args) {
		double media = mediaValores();
		JOptionPane.showMessageDialog(null, "Média: " + media);
	}

	public static double mediaValores() {
		int valores[] = new int[10];
		int soma = 0;
		String saida = "";
		for (int i = 0; i < valores.length; i++) {
			valores[i] = new Random().nextInt(10);
			soma += valores[i];
			saida += valores[i] + ", ";
		}
		System.out.println(saida);
		double media = soma / (double)valores.length;
		return media;
	}
}