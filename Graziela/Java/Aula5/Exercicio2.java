import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		short numero = 0;
		short somaNumeros = 0;
		short qtdNumeros = -1;
		float media = 0;
		do {
			somaNumeros = (short) (somaNumeros + numero);
			qtdNumeros = (short) (qtdNumeros + 1);
			numero = Short.parseShort(JOptionPane.showInputDialog("Digite um número."));
			System.out.println(numero);
		} while (numero >= 0);
		System.out.println("Soma dos números: " + somaNumeros
				+ "\nQuantidade dos números: " + qtdNumeros);
		media = ((float) somaNumeros / (float) qtdNumeros);
		System.out.println("A média dos números digitados é: " + media);
	}
}