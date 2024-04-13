/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula6;

/**
 *
 * @author alunos
 */
public class Hospedagem {
    public int numDias;
    public double valorDiario;
    private double consumo;
    private double condicional;
    
    
    
    
    public double GetCosumo (){
        return this.consumo;
    }
     public void SetCosumo ( double consumo){
      this.consumo = consumo;
       
     }
    
    
    
    public  double calcularCheckout( ){
      double valorTotal = this.valorDiario * this.numDias + this.condicional + this.consumo;
      return valorTotal;
    }
}
