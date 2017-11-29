import javax.swing.JOptionPane;

public class ExemploFuncao {
	public static void main(String args[]) {
		for (int i = 0; i < 5; i++) {
			int soma = calcularSoma();
			if(soma % 2 == 0) {
				JOptionPane.showMessageDialog(null, "Soma: " + soma);
			}
		}
	}

	public static int calcularSoma() {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Número 1"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Número 2"));
		// int soma = numero1 + numero2;
		// return soma;
		return numero1 + numero2;
	}
}
