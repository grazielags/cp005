import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		byte a = Byte.parseByte(JOptionPane.showInputDialog("Digite a altura: "));
		byte b = Byte.parseByte(JOptionPane.showInputDialog("Digite a base menor: "));
		byte B = Byte.parseByte(JOptionPane.showInputDialog("Digite a base maior: "));
		float area = (float) ((a * (b + B)) / 2.0);
		byte areaB = (byte) ((a * (b + B)) / 2);
		JOptionPane.showMessageDialog(null, "Área exata: " + area
								+ "\nÁrea arredondada: " + areaB);
	}
}