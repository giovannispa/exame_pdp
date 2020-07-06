
package DAO;

import bin.Categoria;
import connection.SqliteFactory;
import interfaces.CategoriaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class SqliteCategoriaDAO implements CategoriaDAO{
    
    
    public void insert(Categoria c) {
        Connection con = SqliteFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            String sql = "INSERT INTO Category(CategoryName,Description) VALUES (?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, c.getName());
            stmt.setString(2, c.getDescription());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Categoria cadastrada com sucesso!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar a categoria:" + e);
        } finally {
            SqliteFactory.closeConnection();
        }
        
    }
    
    public Iterator<Categoria> read() {
        Connection con = SqliteFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Categoria> categorias = new ArrayList();
        
        try {
            String sql = "SELECT * FROM Category";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Categoria categoria = new Categoria();
                
                categoria.setId(rs.getInt("Id"));
                categoria.setName(rs.getString("CategoryName"));
                categoria.setDescription(rs.getString("Description"));
                categorias.add(categoria);
            }
        } catch(SQLException e) {
            throw new RuntimeException("Whoops!! Erro ao listar no banco de dados...", e);
        } finally {
            SqliteFactory.closeConnection();
        }
        Iterator<Categoria> it_categorias = categorias.iterator();
        return it_categorias;
    }
    
    public void update(Categoria c) {
        Connection con = SqliteFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            String sql = "UPDATE Category SET CategoryName = ?,Description = ? WHERE Id = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, c.getName());
            stmt.setString(2, c.getDescription());
            stmt.setInt(3, c.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Categoria atualizada com sucesso!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a categoria:" + e);
        } finally {
            SqliteFactory.closeConnection();
        }
        
    }
    
    public void delete(Categoria c) {
        Connection con = SqliteFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            String sql = "DELETE FROM Category WHERE Id = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, c.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Categoria excluida com sucesso!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir a categoria:" + e);
        } finally {
            SqliteFactory.closeConnection();
        }
        
    }
    
    
    public Categoria retornaCategoria(String category) {
        Categoria categoria = new Categoria();
        
        Connection con = SqliteFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
    
        
        try {
            String sql = "SELECT * FROM Category WHERE CategoryName = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, category);
            rs = stmt.executeQuery();
            
            categoria.setId(rs.getInt("Id"));
            categoria.setName(rs.getString("CategoryName"));
            categoria.setDescription(rs.getString("Description"));
            
        } catch(SQLException e) {
            throw new RuntimeException("Whoops!! Erro ao listar no banco de dados...", e);
        } 
        
        return categoria;
    }
    
    
}
