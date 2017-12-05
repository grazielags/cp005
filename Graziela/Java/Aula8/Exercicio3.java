import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado X."));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado Y."));
	 	int z = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado Z."));
		verificaTriangulo(x, y, z);
	}

	public static void verificaTriangulo(int x, int y, int z) {
		if(((x + y) >= z) && ((x + z) >= y) && ((y + z) >= x)) {
			if((x == y) && (x == z) && (y == z)) {
				JOptionPane.showMessageDialog(null, "Triângulo Equilátero!");
			} else if ((x != y) && (x != z) && (y != z)) {
				JOptionPane.showMessageDialog(null, "Triângulo Escaleno!");
			} else {
				JOptionPane.showMessageDialog(null, "Triângulo Isóceles!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Não é um Triângulo!");
		}

	}
}