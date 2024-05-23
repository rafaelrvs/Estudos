/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.sql.Connection;   
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author alunos
 */
public class ControleAluno {
    java.sql.ResultSet rs ;
    Aluno aluno = new Aluno ();
    
    private Connection conexao = null;
    private Statement st = null;


    public void Conecta(){
        try{
            String servername="localhost:3306";
            String usuario="root";
            String senha="";
            String banco="bdaluno";
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
        try{
            PreparedStatement sql;
            sql = conexao.prepareStatement("insert into alunos (numrgm,nome_aluno,nota1,nota2) values (?,?,?,?)");
            sql.setInt(1,aluno.getRgm());
            sql.setString(2,aluno.getNome());
            sql.setDouble(3,aluno.getNota1());
            sql.setDouble(4,aluno.getNota2());
            
            int valor = sql.executeUpdate();
            if(valor==1){
                JOptionPane.showMessageDialog(null,"cadastro realizado com sucesso");
            }else{
                JOptionPane.showMessageDialog(null,"cadastro deu ruim");
            }
        }catch(Exception e){
            System.out.println("erro de prepared" + e);
        }
    }
    public void excluir(int rgm ){
        
        aluno.setRgm(rgm);
      
        try{
            PreparedStatement sql;
           sql = conexao.prepareStatement("DELETE FROM alunos WHERE numrgm = ?");
            sql.setInt(1,aluno.getRgm());
            
            int valor = sql.executeUpdate();
            if(valor==1){
                JOptionPane.showMessageDialog(null,"Exclusão realizada com sucesso");
            }else{
                JOptionPane.showMessageDialog(null,"Não existe exclusão a ser feita");
            }
        }catch(Exception e){
            System.out.println("erro de prepared" + e);
        }
    }
    
    public void listar(){
        
        PreparedStatement sql ;
     
        try{
             sql = conexao.prepareStatement("Select * from alunos");
             rs = sql.executeQuery();
     
        while(rs.next()){
            System.out.println(rs.getString("numrgm")+" "+ rs.getString("nome_aluno")+" "+ rs.getString("nota1")+" "+ rs.getString("nota2"));
         
        }  
              
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro"+  e);
        }
     
    }
    
    
    public String consultar(int rgm){
        String dados ="";
        PreparedStatement sql;
        try{
            
            sql = conexao.prepareStatement("Select * from alunos where numrgm = ?");
            sql.setInt(1,rgm);
            rs = sql.executeQuery();
            
            if(rs.next()){
                dados = (rs.getString("numrgm")+";"
                        + rs.getString("nome_aluno")+";"
                        +rs.getString("nota1")+";"
                        +rs.getString("nota2"));
                      
            }
            else{
                JOptionPane.showMessageDialog(null,"RGM não cadastrado");
            }
            
   
    }catch(Exception e){
            System.out.println("Erro" + e);
             return null;    
    }
        return dados;
    
    }

        
}
    
    
    

