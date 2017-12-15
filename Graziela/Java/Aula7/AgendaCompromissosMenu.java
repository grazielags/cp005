import javax.swing.JOptionPane;
public class AgendaCompromissosMenu {
	public static void main(String[] args) {
		String agenda[][]= new String[7][24];

		int menu = 0;
		do {
			menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções abaixo: \n"
																	+ "1 - Agendar\n"
																	+ "2 - Listar agenda\n"
																	+ "9 - Sair"));
			switch(menu) {
				case 1:
					agendar(agenda);
					break;
				case 2:
					listar(agenda);
					break;
				case 9:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
					break;
			}
		} while(menu != 9);
	}
	
	static String diaSemana(int dia) {
		String diaSemana = "";
		switch(dia) {
			case 0:
				diaSemana = "Domingo";
				break;
			case 1:
				diaSemana = "Segunda";
				break;
			case 2:
				diaSemana = "Terça";
				break;
			case 3:
				diaSemana = "Quarta";
				break;
			case 4:
				diaSemana = "Quinta";
				break;
			case 5:
				diaSemana = "Sexta";
				break;
			case 6:
				diaSemana = "Sábado";
				break;
			default:
				break;
		}
		return diaSemana;
	}

	static void agendar(String agenda[][]) {
		String menu = "Agende um compromisso: \n"
					 + "Digite o numero do dia da semana:\n" 
					 + "0 - Domingo\n"
					 + "1 - Segunda-feira\n"
					 + "2 - Terca-feira\n"
					 + "3 - Quarta-feira\n"
					 + "4 - Quinta-feira\n"
					 + "5 - Sexta-feira\n"
					 + "6 - Sabado";
		int semana = Integer.parseInt(JOptionPane.showInputDialog(menu));
		int hora = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora, das 1:00 as 24:00: "));

		String compromisso = JOptionPane.showInputDialog("Digite o compromisso: ");
		
		agenda[semana][(hora-1)] = compromisso;
	}

	static void listar(String agenda[][]) {
		String agendaSemana = "";
		for(int i=0; i<7; i++){
			for(int j=0; j<24; j++){
				if(agenda[i][j] != null){
					agendaSemana = agendaSemana + diaSemana(i) + " as "+ (j + 1) +":00 : " + agenda[i][j] + "\n";
				}
			}
		}
		JOptionPane.showMessageDialog(null, agendaSemana);
	}
}