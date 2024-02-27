/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

import javax.swing.JOptionPane;

/**
 *
 * @author alunos
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Aluno A = new Aluno();
        
        double nota1 =  Double.parseDouble( JOptionPane.showInputDialog("Nota1:"));
        double nota2 =  Double.parseDouble( JOptionPane.showInputDialog("Nota2:"));
        
        
        
        A.CadastrarAluno("sanguao", nota1,nota2);
        A.ExibirAluno();
        A.CalculaNota();
    }
    
  
    
}
