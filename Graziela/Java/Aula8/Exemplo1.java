import javax.swing.JOptionPane;

public class Exemplo1 {
	public static void main(String[] args) {
		char sexo = JOptionPane.showInputDialog("Digite o sexo: Feminino ou Masculino.").charAt(0);
		boolean isFeminino = ehFeminino(sexo);
		JOptionPane.showMessageDialog(null, "É feminino: " + isFeminino);
	}

	public static boolean ehFeminino(char sexo) {
		if(sexo == 'f' || sexo == 'F') {
			return true;
		}
		return false;
	}
}