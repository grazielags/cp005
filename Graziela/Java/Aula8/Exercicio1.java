import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
		boolean isPar = ehUmNumeroPar(numero);
		JOptionPane.showMessageDialog(null, "O número: " + numero + " é um número par? " + isPar);
	}

	public static boolean ehUmNumeroPar(int num) {
		if(num % 2 == 0) {
			return true;
		}
		return false;
	}
}