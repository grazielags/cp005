import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		byte numero1 = Byte.parseByte(JOptionPane.showInputDialog("Digite o número1: "));
		byte maior = numero1;
		byte menor = numero1;
		byte numero2 = Byte.parseByte(JOptionPane.showInputDialog("Digite o número2: "));
		if (numero2 > maior) {
			maior = numero2;
		}
		if (numero2 < menor) {
			menor = numero2;
		}
		byte numero3 = Byte.parseByte(JOptionPane.showInputDialog("Digite o número3: "));
		if (numero3 > maior) {
			maior = numero3;
		}
		if (numero3 < menor) {
			menor = numero3;
		}
		JOptionPane.showMessageDialog(null, "Maior: " + maior
				+ "\nMenor: " + menor);
	}
}