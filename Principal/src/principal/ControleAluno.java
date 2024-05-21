/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
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
                JOptionPane.showMessageDialog(null,"cadastro deu ruim");
            }
        }catch(Exception e){
            System.out.println("erro de prepared" + e);
        }
    }
}
    
    
    

