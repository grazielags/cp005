import javax.swing.JOptionPane;

public class Exercicio2OutraForma {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero."));
		int resultado = somaNumeros(0, numero);
		JOptionPane.showMessageDialog(null, resultado);
	}
	public static int somaNumeros(int aux, int n) {
		if(aux == n) {
			return n;
		} else {
			return aux + somaNumeros(aux + 1, n);
		}
	}
}