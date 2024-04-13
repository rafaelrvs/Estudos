/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula6;

import javax.swing.JOptionPane;

/**
 *
 * @author alunos
 */
public class Aula6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Hospedagem hos = new Hospedagem();
       Hospede cli = new Hospede();
       
        int option; 
     
       do{
         option = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcão: 1 para cadastrar\n 2 para consultar valores\n 3 para ver desconto")); 
           switch (option) {
               case 1:
                   
                      cli.nome = JOptionPane.showInputDialog("digite seu nome");
                       cli.idade = Integer.parseInt(JOptionPane.showInputDialog("digite sua idade"));
                   
                   break;
                   
                      case 2:
                           double valortotal = hos.calcularCheckout();
               
       cli.calcularDesconto(valortotal);
        
       if(cli.idade > 60){
        double res =  cli.calcularDesconto(valortotal);
        JOptionPane.showMessageDialog(null,"seu desconto é: " +  res);
       }
       else{
           JOptionPane.showMessageDialog(null,"O valor a ser pago é : " +  valortotal);
       }
     
                   
                   break;
               default:
                   JOptionPane.showMessageDialog(null,"Digito invalido");
           }
      
        
        
        hos.valorDiario = Double.parseDouble(JOptionPane.showInputDialog("valor diario"));

         hos.numDias = Integer.parseInt(JOptionPane.showInputDialog("digite os dias"));
        double consumo = Double.parseDouble(JOptionPane.showInputDialog("Gastos"));
         hos.SetCosumo(consumo);
         
           double cond = Double.parseDouble(JOptionPane.showInputDialog("cond"));
         hos.SetCosumo(cond);
         
   
      
      
        // TODO code application logic here
    }while( option != 0);
       
       }
       
    
}
