package connection;

import DAO.MysqlCategoriaDAO;
import DAO.MysqlFornecedorDAO;
import DAO.MysqlProdutoDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Classe factory de conexão com o banco
public class MysqlFactory extends DAOFactory{
    //Atributo para controlar o Singleton
    private static Connection instance = null;
    private static final String DRIVE = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/northwind";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection(){
        
        try {
            
            //Se não houver conexão, ele realiza.
            if(instance == null) {
                Class.forName(DRIVE);
                
                instance = DriverManager.getConnection(URL, USER, PASSWORD);
            }
            
        } catch(SQLException e){
            throw new RuntimeException("Whoops!! Erro ao conectar com o banco de dados...", e);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("Whoops!! Erro ao encontrar o driver...", ex);
        }
        return instance;
        
    }
    
    public static void closeConnection() {
        
        try {
            
            if(instance != null) {
                instance.close();
                instance = null;
            }
            
        } catch(SQLException e) {
            throw new RuntimeException("Whoops!! Erro ao fechar o banco de dados...", e);
        }  
    }
    
     public MysqlCategoriaDAO getCategoriaDAO() {
        return new MysqlCategoriaDAO();
    }
    
    public MysqlProdutoDAO getProdutoDAO() {
        return new MysqlProdutoDAO();
    }
    
    public MysqlFornecedorDAO getFornecedorDAO() {
        return new MysqlFornecedorDAO();
    }
}
