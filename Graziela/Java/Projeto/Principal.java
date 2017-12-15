import javax.swing.JOptionPane;
<<<<<<< HEAD

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
=======
import javax.swing.JPasswordField;

public class Principal {
	static String login;
	static String senha;
	static Integer idUsuarioLogado;
	static boolean isAdmin = false;
	public static void main(String[] args) {
		int menu = 0;
		do {
			int opcaoMenuPrincipal = Integer.parseInt(
					JOptionPane.showInputDialog(null, montaMenuPrincipal(), 
												"Menu Principal", JOptionPane.DEFAULT_OPTION));
			switch (opcaoMenuPrincipal) {
				case 1:
					cadastrarUsuario();
					break;
				case 2:
					consultarUsuario();
					break;
				case 3:
					logar();
					break;
				case 4:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção do menu inválida!");
					break;
			}
		} while(menu == 4);
	}

	public static String montaMenuPrincipal() {
		String menu = "Gerenciamento de usuários:";
		menu += "\n1 - Cadastrar";
		menu += "\n2 - Consultar";
		menu += "\n3 - Logar";
		menu += "\n4 - Sair";
		return menu;
	}

	public static String montaMenuLogado() {
		String menu = "1 - Livros";
		menu += "\n2 - Empréstimos";
		if (isAdmin) {
			menu += "\n3 - Remover Usuários";
		}
		return menu;
	}

	public static String montaMenuLivros() {
		String menu = "Gerenciamento de livros:";
		menu += "\n1 - Consultar";
		menu += "\n2 - Cadastrar";
		menu += "\n3 - Remover";
		return menu;
	}

	public static String montaMenuEprestimos() {
		String menu = "Gerenciamento de empréstimos:";
		menu += "\n1 - Realizar empréstimo de livro";
		menu += "\n2 - Devolver livro";
		return menu;
	}

	public static String montaMenuUsuario() {
		return "1 - Remover usuário";
	}

	private static void logar() {
		login = JOptionPane.showInputDialog(null, "Qual o seu login?");
		JPasswordField jpf = new JPasswordField();
		jpf.requestFocus(true);
		JOptionPane.showMessageDialog(null, new Object[] { "Senha", jpf });
		senha = new String(jpf.getPassword());
	}

	private static void consultarUsuario() {
		String nomeUsuario = JOptionPane.showInputDialog("Nome do usuário.");
	}

	private static void cadastrarUsuario() {
		String nomeUsuario = JOptionPane.showInputDialog(null, "Nome do usuário.", "Cadastro de usuário", JOptionPane.DEFAULT_OPTION);
		String enderecoUsuario = JOptionPane.showInputDialog(null, "Endereço do usuário.", "Cadastro de usuário", JOptionPane.DEFAULT_OPTION);
		int perfilUsuario = Integer
				.parseInt(JOptionPane.showInputDialog("Perfil do usuário:" 
								+ "\n1 - Admin" 
								+ "\n2 - Normal"));
		String loginUsuario = JOptionPane.showInputDialog("Login do usuário.");
		JPasswordField jpf = new JPasswordField();
		jpf.requestFocus(true);
		JOptionPane.showMessageDialog(null, new Object[] { "Senha do usuário.", jpf });
		String senhaUsuario = new String(jpf.getPassword());
>>>>>>> c4c0ff72ddea876a9a2d32509359f63b2c33f286
	}
}