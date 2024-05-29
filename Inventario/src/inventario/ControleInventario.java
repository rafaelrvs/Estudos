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
            String banco="inventario";
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

    public void cadastrar(int quantidade ,int registro ,String nome ,String descricao, String local ){
        estoque.setQuantidade(quantidade);
        estoque.setRegistro(registro);
        estoque.setNome(nome);
        estoque.setLocal(local);
        estoque.setDescricao(descricao);
        try{
            // Preparando a declaração SQL
            sql = conexao.prepareStatement("INSERT INTO inventario_produto (quantidade, "
                    + "registro, nome_produto, local, descricao) VALUES (?, ?, ?, ?, ?)");
            // Configurando os parâmetros
            sql.setInt(1, quantidade);
            sql.setInt(2, registro);
            sql.setString(3, nome);
            sql.setString(4, local);
            sql.setString(5, descricao);
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
            System.out.println(rs.getString("registro")+
                    " "+ rs.getString("nome_produto")
                    +" "+ rs.getString("local")+" "
                    + rs.getString("quantidade")+" "
                    +rs.getString("descricao"));
         
        }  
              
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro"+  e);
        }
     
    }
    
    
     public String consultar(int registro) {
    String dados = "";
    PreparedStatement sql = null;
    
    try {
        sql = conexao.prepareStatement("SELECT * FROM inventario_produto WHERE registro = ?");
        sql.setInt(1, registro);
        rs = sql.executeQuery();
        
        if (rs.next()) {
            dados = rs.getString("nome_produto") + ";"
                  + rs.getString("descricao") + ";" // Corrigido para o nome correto da coluna
                  + rs.getString("quantidade") + ";"
                  + rs.getString("local") + ";"
                  + rs.getString("registro") + ";";
        } else {
            JOptionPane.showMessageDialog(null, "Registro não encontrado");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao consultar registro: " + e.getMessage());
        e.printStackTrace(); // Isso ajuda a identificar a origem do erro
    } finally {
        try {
            if (rs != null) {
                rs.close();
            }
            if (sql != null) {
                sql.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage());
            e.printStackTrace(); // Isso ajuda a identificar a origem do erro
        }
    }
    
    return dados;
}

     
     public void alterar(int quantidade, int registro, String nome, String descricao, String local) {
    estoque.setQuantidade(quantidade);
    estoque.setRegistro(registro);
    estoque.setNome(nome);
    estoque.setLocal(local);
    estoque.setDescricao(descricao);
    try {
        // Preparando a declaração SQL
        sql = conexao.prepareStatement("UPDATE inventario_produto SET quantidade = ?, nome_produto = ?, local = ?, descricao = ? WHERE registro = ?");
        // Configurando os parâmetros
        sql.setInt(1, quantidade);
        sql.setString(2, nome);
        sql.setString(3, local);
        sql.setString(4, descricao);
        sql.setInt(5, registro);
        // Executando a atualização
        int valor = sql.executeUpdate();
        if (valor == 1) {
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao alterar");
        }
    } catch (Exception e) {
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

    
    
    
}
