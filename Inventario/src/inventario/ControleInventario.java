/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

import java.sql.PreparedStatement;
import java.sql.Connection;   
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author alunos
 */
public class ControleInventario {
    Inventario estoque = new Inventario();
    java.sql.ResultSet rs ;
    private Connection conexao = null;
    private PreparedStatement sql = null;
    private Statement st = null;
    // Método construtor para inicializar a conexão
    
    
    public ControleInventario() {
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

    public void cadastrar(int quantidade ,int registro ,String nome , String local ){
        estoque.setQuantidade(quantidade);
        estoque.setRegistro(registro);
        estoque.setNome(nome);
        estoque.setLocal(local);
        try{
            // Preparando a declaração SQL
            sql = conexao.prepareStatement("INSERT INTO inventario_produto (quantidade, registro, nome_produto, local) VALUES (?, ?, ?, ?)");
            // Configurando os parâmetros
            sql.setInt(1, quantidade);
            sql.setInt(2, registro);
            sql.setString(3, nome);
            sql.setString(4, local);
            // Executando a atualização
            int valor = sql.executeUpdate();
            if(valor==1){
                JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null,"Falha ao cadastrar");
            }
        } catch(Exception e){
            System.out.println("Erro ao executar a operação no banco de dados: " + e);
        } finally {
            // Fechando a conexão e o PreparedStatement
            try {
                if (sql != null) {
                    sql.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao fechar a conexão: " + e);
            }
        }
    }


    public void excluir(int registro ){
        
        estoque.setRegistro(registro);
      
        try{
            PreparedStatement sql;
           sql = conexao.prepareStatement("DELETE FROM inventario_produto WHERE registro = ?");
            sql.setInt(1,estoque.getRegistro());
            
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
             sql = conexao.prepareStatement("Select * from inventario_produto");
             rs = sql.executeQuery();
     
        while(rs.next()){
            System.out.println(rs.getString("registro")+" "+ rs.getString("nome_produto")+" "+ rs.getString("local")+" "+ rs.getString("quantidade"));
         
        }  
              
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro"+  e);
        }
     
    }
    
}
