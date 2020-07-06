package DAO;

import bin.Produto;
import connection.SqliteFactory;
import interfaces.ProdutoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class SqliteProdutoDAO implements ProdutoDAO{
    
    public void insert(Produto p) {
        Connection con = SqliteFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            String sql = "INSERT INTO Product(ProductName, UnitsInStock, QuantityPerUnit, UnitPrice, CategoryId, SupplierId) VALUES(?,?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, p.getName());
            stmt.setInt(2, p.getStock());
            stmt.setInt(3, p.getQuantity());
            stmt.setDouble(4, p.getPrice());
            stmt.setInt(5, p.getCategoryId());
            stmt.setInt(6, p.getSupplierId());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto!!" + e);
        } finally {
            SqliteFactory.closeConnection();
        }
    }
    
    public Iterator<Produto> read() {
        Connection con = SqliteFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Produto> produtos = new ArrayList();
        
        try {
            String sql = "SELECT pr.Id, pr.ProductName, pr.UnitsInStock, pr.QuantityPerUnit, pr.UnitPrice, cat.Id, cat.CategoryName AS category_name, fn.CompanyName"
                    + " FROM Product AS pr INNER JOIN Category AS cat ON pr.CategoryId = cat.Id INNER JOIN Supplier as fn ON fn.Id = pr.SupplierId";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Produto produto = new Produto();
                
                produto.setId(rs.getInt("Id"));
                produto.setName(rs.getString("ProductName"));
                produto.setStock(rs.getInt("UnitsInStock"));
                produto.setQuantity(rs.getInt("QuantityPerUnit"));
                produto.setPrice(rs.getDouble("UnitPrice"));
                produto.setCategory(rs.getString("category_name"));
                produto.setSupplier(rs.getString("CompanyName"));
                produtos.add(produto);
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar produto!!" + e);
        } finally {
            SqliteFactory.closeConnection();
        }
        Iterator<Produto> it_produtos = produtos.iterator();
        return it_produtos;
    }
    
    public void update(Produto p) {
        Connection con = SqliteFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            String sql = "UPDATE product SET ProductName = ?, UnitsInStock = ?, QuantityPerUnit = ?, UnitPrice = ?, categoryId = ?, SupplierId = ? WHERE Id = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, p.getName());
            stmt.setInt(2, p.getStock());
            stmt.setInt(3, p.getQuantity());
            stmt.setDouble(4, p.getPrice());
            stmt.setInt(5, p.getCategoryId());
            stmt.setInt(6, p.getSupplierId());
            stmt.setInt(7, p.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o produto:" + e);
        } finally {
            SqliteFactory.closeConnection();
        }
        
    }
    
    public void delete(Produto p) {
        Connection con = SqliteFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            String sql = "DELETE FROM Product WHERE Id = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, p.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o produto:" + e);
        } finally {
            SqliteFactory.closeConnection();
        }
        
    }
}
