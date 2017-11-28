import javax.swing.JOptionPane;

public class ExemploMatriz {
	public static void main(String[] args) {
		int matriz[][] = new int[4][5];
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para matriz[" + linha + "][" + coluna + "]!"));
			}
		}
		for (int linha = 0; linha < matriz.length; linha++) {
			System.out.print("[");
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.print("]\n");
		}
	}
}