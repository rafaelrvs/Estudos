package com.example;
import javax.swing.JOptionPane;
public class MensagemEnviada {

public void ExibirDadosIncorretos(){
  
    JOptionPane.showMessageDialog(null, "Login ou senha incorreto");
  
}
public void ExibirDadosCadastrados(){
    
    JOptionPane.showMessageDialog(null, "Dados ja cadastrado");
}
public void SenhaJaCadastrada(){
    
    JOptionPane.showMessageDialog(null, "Senha ja cadastrado");
}

}
