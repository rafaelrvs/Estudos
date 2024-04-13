/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunos
 */

public class loteria {
    public int cont;
    public double premio;
    public int num1;
    public int num2;
    public int num3;
    public int num4;
    public int num5;
    public int numsort1 = (int) Math.round(Math.random()*20-0);
    public int numsort2 = (int) Math.round(Math.random()*20-0);
    public int numsort3 = (int) Math.round(Math.random()*20-0);
    public int numsort4 = (int) Math.round(Math.random()*20-0);
    public int numsort5 = (int) Math.round(Math.random()*20-0);
    
    public void Sortear(){
        
    this.numsort1 = numsort1;
    this.numsort2 = numsort2;
    this.numsort3 = numsort3;
    this.numsort4 = numsort4;
    this.numsort5 = numsort5;
    }
    public int CalcularAcertos(){
     this.cont = 0;
     this.num1 = num1;
     this.numsort1 = numsort1;
     
     this.num2 = num2;
     this.numsort2 = numsort2;
     
     this.num3 = num3;
     this.numsort3 = numsort3;
     
     this.num4 = num4;
     this.numsort4 = numsort4;
     
     this.num5 = num5;
     this.numsort5 = numsort5;
     
     if(num1 == numsort1 || num1 == numsort2 || num1 == numsort3 || num1 == numsort4 || num1 == numsort5){
         cont ++;
     }
       if(num2 == numsort1 || num2 == numsort2 || num2 == numsort3 || num2 == numsort4 || num2 == numsort5){
         cont ++;
    }
    if(num3 == numsort1 || num3 == numsort2 || num3 == numsort3 || num3 == numsort4 || num3 == numsort5){
         cont ++;
}
    if(num4 == numsort1 || num4 == numsort2 || num4 == numsort3 || num4 == numsort4 || num4 == numsort5){
         cont ++;
}
    if(num5 == numsort1 || num5 == numsort2 || num5 == numsort3 || num5 == numsort4 || num5 == numsort5){
         cont ++;
    }
    return cont;
    }
    
    public double VerificarPremio(int cont){
        if (cont == 5){
            premio = (10000);
        }else{
            if(cont == 3 || cont == 4){
                premio = (5000);
            }else{
                premio = (1000);
            }
        }
        
        return premio;
    }
    
}
