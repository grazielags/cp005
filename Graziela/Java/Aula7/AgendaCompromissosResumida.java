import javax.swing.JOptionPane;
public class AgendaCompromissosResumida {
	public static void main(String[] args) {
		String agenda[][]= new String[7][24];

		char novoCompromisso = 's';
		do {
			String menu = "Agende um horário: \n"
					 + "Digite o numero do dia da semana:\n" 
					 + "0 - Domingo\n"
					 + "1 - Segunda-feira\n"
					 + "2 - Terca-feira\n"
					 + "3 - Quarta-feira\n"
					 + "4 - Quinta-feira\n"
					 + "5 - Sexta-feira\n"
					 + "6 - Sabado";
			int diaSemana = Integer.parseInt(JOptionPane.showInputDialog(menu));
			int horaDia = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora, das 1:00 as 24:00: "));

			String nomePaciente = JOptionPane.showInputDialog("Digite o nome do paciente: ");
			
			agenda[diaSemana][(horaDia-1)] = nomePaciente;
			novoCompromisso = JOptionPane.showInputDialog("Deseja cadastrar novamente? s(Sim) / n(Nao)").toLowerCase().charAt(0);
		} while(novoCompromisso == 's');

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
}