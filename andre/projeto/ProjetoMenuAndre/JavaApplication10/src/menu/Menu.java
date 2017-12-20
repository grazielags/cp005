package menu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
/**
 *
 * @author Andre
 */
public class Menu {
    static String login;
    static String senha;
    static Integer idUsuarioLogado = null;
    static boolean isAdmin = false;
    public static void main(String[] args) {
        try {
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
                        if (idUsuarioLogado != null) {
                            menuLogado();
                        }
                        break;
                    case 4:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção do menu inválida!");
                        break;
                }
            } while(menu == 4);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
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
        menu += "\n4 - Sair";
        return menu;
    }

    public static String montaMenuLivros() {
        String menu = "Gerenciamento de livros:";
        menu += "\n1 - Consultar";
        menu += "\n2 - Cadastrar";
        menu += "\n3 - Remover";
        menu += "\n4 - Sair";
        return menu;
    }

    public static String montaMenuEprestimos() {
        String menu = "Gerenciamento de empréstimos:";
        menu += "\n1 - Realizar empréstimo de livro";
        menu += "\n2 - Devolver livro";
        menu += "\n3 - Sair";
        return menu;
    }

    private static void logar() {
        login = JOptionPane.showInputDialog(null, "Qual o seu login?");
        JPasswordField jpf = new JPasswordField();
        jpf.requestFocus(true);
        JOptionPane.showMessageDialog(null, new Object[] { "Senha", jpf });
        senha = new String(jpf.getPassword());
        idUsuarioLogado = 1;
        isAdmin = false;
    }

    private static void consultarUsuario() {
        String nomeUsuario = JOptionPane.showInputDialog("Nome do usuário.");
    }

    private static void cadastrarUsuario() throws SQLException {
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
        Connection conexao = ConnectionFactory.getConexao();
        
        String sql = "insert into usuario "
                        + "(nome, endereco, perfil, login, senha) "
                        + "values (?, ?, ?, ?, ?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nomeUsuario);
        stmt.setString(2, enderecoUsuario);
        stmt.setInt(3, perfilUsuario);
        stmt.setString(4, loginUsuario);
        stmt.setString(5, senhaUsuario);
        // executa
        stmt.execute();
        System.out.println("Usuário inserido com sucesso!");
        stmt.close();

        conexao.close();
    }

    private static void menuLogado() {
        int menu = 0;
        do {
            int opcaoMenu = Integer.parseInt(
                            JOptionPane.showInputDialog(null, montaMenuLogado(), 
                                                        "Menu Logado", JOptionPane.DEFAULT_OPTION));
            switch (opcaoMenu) {
                case 1:
                    menuLivro();
                    break;
                case 2:
                    menuEmprestimo();
                    break;
                case 3:
                    removerUsuario();
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção do menu inválida!");
                    break;
            }
        } while(menu == 4);
    }

    private static void menuLivro() {
        int menu = 0;
        do {
            int opcaoMenu = Integer.parseInt(
                            JOptionPane.showInputDialog(null, montaMenuLivros(), 
                                                        "Menu Livro", JOptionPane.DEFAULT_OPTION));
            switch (opcaoMenu) {
                case 1:
                    consultarLivro();
                    break;
                case 2:
                    cadastrarLivro();
                    break;
                case 3:
                    removerLivro();
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção do menu inválida!");
                    break;
            }
        } while(menu == 4);
    }

    private static void menuEmprestimo() {
        int menu = 0;
        do {
            int opcaoMenu = Integer.parseInt(
                            JOptionPane.showInputDialog(null, montaMenuEprestimos(), 
                                                        "Menu Emprestimo", JOptionPane.DEFAULT_OPTION));
            switch (opcaoMenu) {
                case 1:
                    realizarEmprestimo();
                    break;
                case 2:
                    devolverLivro();
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção do menu inválida!");
                    break;
            }
        } while(menu == 3);
    }

    private static void removerUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void consultarLivro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void cadastrarLivro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void removerLivro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void realizarEmprestimo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void devolverLivro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}