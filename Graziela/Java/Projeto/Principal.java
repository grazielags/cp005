import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		byte opcao = 0;
		boolean isLogado = true;
		do {
			opcao = Byte.parseByte(JOptionPane.showInputDialog("Digite uma das opções abaixo:\n"
					+ "1 - Cadastrar\n" 
					+ "2 - Consultar\n" 
					+ "3 - Logar\n"
					+ "4 - Sair"));
			switch (opcao) {
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					if(isLogado) {
						
					}
					break;
				default:
					break;
			}
		} while(opcao != 4);
	}
}