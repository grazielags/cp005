import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Principal {
	private static int idUsuarioLogado;
	private static boolean isAdmin;
	public static void main(String[] args) throws SQLException {
		int menu = Integer.parseInt(JOptionPane.showInputDialog("1- Consultar Usuário"
				+ "\n2- Logar"
				+ "\n3- Sair"));
		do {
			switch (menu) {
			case 1:
				consultarUsuario();
				break;
			case 2:
				logar();
				break;
			case 3:				
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Invávila!");
				break;
			}

		} while (menu == 3);
	}

	private static void consultarUsuario() throws SQLException {
		String nomeUsuario = JOptionPane.showInputDialog("Nome do usuário:");
		Connection conexao = ConnectionFactory.obterConexao();
		String sql = "select * from usuario where nome like ?";
		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setString(1, "%"+ nomeUsuario +"%");

		ResultSet lista = ps.executeQuery();
		String saida = "";
		while (lista.next()) {
			saida += "Id: " + lista.getString("id");
			saida += "\nNome: " + lista.getString("nome");
			saida += "\nPerfil: " + lista.getString("perfil");
			saida += "\nLogin: " + lista.getString("login");
			saida += "\n\n";
		}
		JOptionPane.showMessageDialog(null, saida);
	}

	private static void logar() throws SQLException {
		String sql = "select id, perfil "
				+ "from usuario "
				+ "where login = ? "
				+ "and senha = ?";
		Connection conexao = ConnectionFactory.obterConexao();
		PreparedStatement ps = conexao.prepareStatement(sql);
		String nome = JOptionPane.showInputDialog(null, "Login:");
		String senha = JOptionPane.showInputDialog(null, "Senha:");
		ps.setString(1, nome);
		ps.setString(2, senha);
		ResultSet resultado = ps.executeQuery();
		boolean isLogado = false;
		while (resultado.next()) {
			JOptionPane.showMessageDialog(null, "Logado com sucesso!");
			idUsuarioLogado = resultado.getInt("id");
			isAdmin = resultado.getInt("perfil") == 1;
			isLogado = true;
		}
		if (isLogado) {
			if (isAdmin) {
				String menu = "1- Livros"
						+ "\n2- Empréstimos"
						+ "\n3- Cadastrar Usuários"
						+ "\n4- Remover Usuários"
						+ "\n5- Sair";
				int opcaoMenuLogado = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
				switch (opcaoMenuLogado) {
				case 1:
					livros();
					break;
				case 2:
					emprestimos();
					break;
				case 3:
					cadastrarUsuario();
					break;
				case 4:
					removerUsuarios();
					break;
				case 5:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção do menu Inválida");
					break;
				}
			} else {
				String menu = "1- Livros"
						+ "\n2- Empréstimos"
						+ "\n3- Sair";
				int opcaoMenuLogado = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
				switch (opcaoMenuLogado) {
				case 1:
					livros();
					break;
				case 2:
					emprestimos();
					break;
				case 3:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção do menu Inválida");
					break;
				}

			}

		}
	}

	private static void livros() throws SQLException {
		if (isAdmin) {
			int opcaoMenuLivros = Integer.parseInt(JOptionPane.showInputDialog(null, "1- Cadastrar livro"
					+ "\n2- Consultar livro"
					+ "\n3- Remover livro"
					+ "\n4- Sair"));
			switch (opcaoMenuLivros) {
			case 1:
				codastrarLivros();
				break;
			case 2:
				consultarLivros();
				break;
			case 3:
				romoverLivros();
				break;
			case 4:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção do menu inválida");
				break;
			}
		} else {
			int opcaoMenuLivros = Integer.parseInt(JOptionPane.showInputDialog(null, "1- Consultar livro"
					+ "\n2- Sair"));
			switch (opcaoMenuLivros) {
			case 1:
				consultarLivros();
				break;
			case 2:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção do menu inválida");
				break;
			}
		}
	}

	private static void codastrarLivros() throws SQLException {
		Connection conexao = ConnectionFactory.obterConexao();
		String sql = "insert into livro"
				+ "(nome, autor, ano_edicao)"
				+ "values(?, ?, ?)";
		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setString(1, JOptionPane.showInputDialog("Digite o nome do livro:"));
		ps.setString(2, JOptionPane.showInputDialog("Digite o nome do autor do livro:"));
		ps.setString(3, JOptionPane.showInputDialog("Digite o ano de edição do livro:"));

		ps.execute();
		JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
		ps.close();
		conexao.close();

	}

	private static void consultarLivros() throws SQLException {
		String nomeLivro = JOptionPane.showInputDialog("Nome do Livro.");
		Connection conexao = ConnectionFactory.obterConexao();
		StringBuilder sql = new StringBuilder();
		sql.append("select l.*, ");
		sql.append("case when (e.id is not null) then 'Emprestado'"
				+ "else 'Disponível no acervo' end situacao ");
		sql.append("from livro l ");
		sql.append("left join emprestimo e on e.id_livro = l.id ");
		sql.append("where l.nome like ?");
		PreparedStatement ps = conexao.prepareStatement(sql.toString());
		ps.setString(1, "%"+ nomeLivro +"%");

		ResultSet lista = ps.executeQuery();
		String saida = "";
		while (lista.next()) {
			saida += "Id: " + lista.getString("id");
			saida += "\nNome: " + lista.getString("nome");
			saida += "\nAutor: " + lista.getString("autor");
			saida += "\nAno de edição: " + lista.getInt("ano_edicao");
			saida += "\nSituação: " + lista.getString("situacao");
			saida += "\n\n";
		}
		JOptionPane.showMessageDialog(null, saida);
	}

	private static void romoverLivros() throws SQLException {
		int idLivroRomover = Integer.parseInt(JOptionPane.showInputDialog("Digite o id"));
		Connection conexao = ConnectionFactory.obterConexao();
		String sql = "delete from livro where id like ?";
		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setInt(1, idLivroRomover);

		if (ps.executeUpdate() > 0) {
			JOptionPane.showMessageDialog(null, "Removido com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Erro no processo de exclusão!");
		}
		ps.close();
		conexao.close();

	}

	private static void emprestimos() throws SQLException {
		Connection conexao = ConnectionFactory.obterConexao();
		String sql = "insert into emprestimo"
				+ "(id_usuario, id_livro)"
				+ "values(?, ?)";
		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setString(1, String.valueOf(idUsuarioLogado));
		ps.setString(2, JOptionPane.showInputDialog("Digite o id do livro:"));

		ps.execute();
		JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!");
		ps.close();
		conexao.close();
	}

	private static void cadastrarUsuario() throws SQLException {
		Connection conexao = ConnectionFactory.obterConexao();
		String sql = "insert into usuario"
				+ "(nome, endereco, perfil, login, senha)"
				+ "values(?, ?, ?, ?, ?)";
		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setString(1, JOptionPane.showInputDialog("Digite o nome do usuário:"));
		ps.setString(2, JOptionPane.showInputDialog("Digite o endereço do usuário:"));
		ps.setString(3, JOptionPane.showInputDialog("Digite o perfil do usuario (1- admin, 2- usuário):"));
		ps.setString(4, JOptionPane.showInputDialog("Digite o login do usuário:"));
		ps.setString(5, JOptionPane.showInputDialog("Digite a senha do usuário:"));

		ps.execute();
		JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
		ps.close();
		conexao.close();
	}

	private static void removerUsuarios() throws SQLException {
		int idUsuarioRomover = Integer.parseInt(JOptionPane.showInputDialog("Digite o id"));
		Connection conexao = ConnectionFactory.obterConexao();
		String sql = "delete from usuario where id like ?";
		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setInt(1, idUsuarioRomover);

		if (ps.executeUpdate() > 0) {
			JOptionPane.showMessageDialog(null, "Removido com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Erro no processo de exclusão!");
		}
		ps.close();
		conexao.close();
	}
}
