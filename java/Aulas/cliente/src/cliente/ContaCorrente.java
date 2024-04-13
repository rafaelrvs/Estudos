/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

import javax.swing.JOptionPane;

/**
 *
 * @author alunos
 */
public class ContaCorrente {
    public String numero_da_conta;
    public String agencia;
    public String senha_da_conta;
    public double saldo_conta;
    
    
    
    public void Extrato_conta(){
             JOptionPane.showMessageDialog(null,"Seu saldo é"+" :"+ this.saldo_conta);
    }
    public void depositar(double saldo){
        
        if(saldo >=0){
              
            this.saldo_conta = this.saldo_conta + saldo;
        }
        else{
            JOptionPane.showMessageDialog(null,"Deposito invalido, você deve inserir um valor");
        }
    }
    public void sacar (double saldo){
       if(this.saldo_conta > 0){
           this.saldo_conta = this.saldo_conta - saldo;
       }
       else{
      
           JOptionPane.showMessageDialog(null,"Saldo insuficiente");
       }
    }
    
    
}
