import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		float valorProduto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto: "));
		byte percentualAumento = Byte.parseByte(JOptionPane.showInputDialog("Digite o percentual de aumento: "));
		float valorAposAumento = (float) ((valorProduto * percentualAumento) / 100) + valorProduto;
		JOptionPane.showMessageDialog(null, "A novo valor do produto é: " + valorAposAumento);
	}
}