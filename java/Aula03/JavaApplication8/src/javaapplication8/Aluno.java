/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;
import javax.swing.JOptionPane;
/**
 *
 * @author alunos
 */
public class Aluno {
    public String nome_aluno;
    public double nota1;
    public double nota2;
    public double media;
    
    
    public void CadastrarAluno(String nome ,double n1, double n2){
        this.nome_aluno = nome;
        this.nota1 = n1;
        this.nota2 = n2;
        JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
                
 
    }
      
    public void ExibirAluno (){
        JOptionPane.showMessageDialog(null, this.nome_aluno);
    }
    
    public void CalculaNota (){
        double media = (this.nota1+this.nota2) / 2;
   
        JOptionPane.showMessageDialog(null,media );
  
    }
 
}
