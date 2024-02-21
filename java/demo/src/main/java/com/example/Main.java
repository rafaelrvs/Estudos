package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MensagemEnviada mens = new MensagemEnviada();
        Scanner myObj = new Scanner(System.in);
     System.out.println("Digite seu Nome");
    String Name = myObj.nextLine();

    if(Name == "Gustavo"){
        mens.ExibirDadosCadastrados();
    }
    else{
        mens.ExibirDadosIncorretos();
        

    }
}
}