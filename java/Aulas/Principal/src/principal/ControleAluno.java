/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author alunos
 */
public class ControleAluno {
    
    Aluno aluno = new Aluno ();
    
    private Connection conexao = null;
    private Statement st = null;


    public void Conecta(){
        try{
            String servername="localhost:3306";
            String usuario="root";
            String senha="";
            String banco="bd_aluno";
            String driverName="com.mysql.cj.jdbc.Driver";
            Class.forName(driverName);
            String url = "jdbc:mysql://"+servername+"/"+banco+"?useTimezone=true&serverTimezone=UTC";
            conexao = DriverManager.getConnection(url,usuario,senha);
            st = conexao.createStatement();
        } catch(ClassNotFoundException e) {
            System.out.println("Sem classe" + e);
        } catch(Exception e) {
            System.out.println("Banco não conectado");
        }

    }
    
    public void cadastrar(int rgm ,String nm,double n1 , double n2 ){
        aluno.setNome(nm);
        aluno.setRgm(rgm);
        aluno.setNota1(n1);
        aluno.setNota2(n2);
        
}


    
    }
    
    
    

