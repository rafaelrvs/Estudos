/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente;

import javax.swing.JOptionPane;

/**
 *
 * @author alunos
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContaCorrente c = new ContaCorrente();

      
          double opcao = Double.parseDouble(JOptionPane.showInputDialog("Digite sua opcao Depositar 1 \n Sacar 2 \n Extrato 3 \n 9 para sair"));
        while (opcao == 9) {
          if(opcao == 1){
               double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo"));
               c.depositar(saldo);
          }
          
          else {
          if(opcao == 2){
              double saldoSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));
               c.sacar(saldoSaque);
          }
          else{
              if(opcao==3){
                  c.Extrato_conta();
              }
              else{
                  opcao = opcao = 9;
              }
           
            
          
          }
       
          
          
          
          }
    
        
        
    }
    }
    
}
