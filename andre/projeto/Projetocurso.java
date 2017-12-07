/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocurso;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Projetocurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte opcao = 0;
        boolean isLogado = true;
        do{
            opcao = Byte.parseByte(JOptionPane.showInputDialog("Digite uma das opções abaixo:\n"
                    + "1 - Cadastrar\n"
                    + "2 - Consultar\n"
                    + "3 - Logar\n"
                    + "4 - Sair"));
            switch (opcao){
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
    
                    
                   
                
                    
            
            
                  
 			