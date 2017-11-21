import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] args) {
		float distancia = Float.parseFloat(JOptionPane.showInputDialog("Digite a distância total percorrida: "));
		float qtdLitros = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de litros gasto: "));
		float resultado = distancia / qtdLitros;
		JOptionPane.showMessageDialog(null, "A autonomia foi de: " + resultado);
	}
}