/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefaprofessor;

/**
 *
 * @author alunos
 */
public class Cliente {
    
    public String nome;
    public int tel;
    private String tipo_pessoa;

    public String getTipo_pessoa() {
        return tipo_pessoa;
    }

    public void setTipo_pessoa(String tipo_pessoa) {
        this.tipo_pessoa = tipo_pessoa;
    }
    public double caulcula_desc(){
       double desc = 0;
        
        return desc;
    }   

    @Override
    public String toString() {
        return "nome=" + nome + "\n tel=" + tel + "\n tipo_pessoa=" + tipo_pessoa;
    }
    
    
    
}
