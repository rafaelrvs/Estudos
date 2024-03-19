/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula6;

/**
 *
 * @author alunos
 */
public class Hospede {
    
    public String nome;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    private String cpf;
    private int telefone;
    public int idade;
    
    
    public double calcularDesconto(double valor){
       double desconto = valor * 0.1;
       double total = valor - desconto;
       
       return total;
    }
     
}
    

