package DAO;

import bin.Fornecedor;
import connection.MysqlFactory;
import interfaces.FornecedorDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class MysqlFornecedorDAO implements FornecedorDAO{
    public void insert(Fornecedor f) {
        Connection con = MysqlFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            String sql = "INSERT INTO Supplier(CompanyName, Address, City, Phone) VALUES(?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, f.getName());
            stmt.setString(2, f.getAddress());
            stmt.setString(3, f.getCity());
            stmt.setString(4, f.getPhone());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar fornecedor!!" + e);
        } finally {
            MysqlFactory.closeConnection();
        }
    }
    
    public Iterator<Fornecedor> read() {
        Connection con = MysqlFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Fornecedor> fornecedores = new ArrayList();
        
        try {
            String sql = "SELECT * FROM Supplier";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Fornecedor fornecedor = new Fornecedor();
                
                fornecedor.setId(rs.getInt("Id"));
                fornecedor.setName(rs.getString("CompanyName"));
                fornecedor.setAddress(rs.getString("Address"));
                fornecedor.setCity(rs.getString("City"));
                fornecedor.setPhone(rs.getString("Phone"));
                fornecedores.add(fornecedor);
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar fornecedor!!" + e);
        } finally {
            MysqlFactory.closeConnection();
        }
        Iterator<Fornecedor> it_fornecedores = fornecedores.iterator();
        return it_fornecedores;
    }
    
    public void update(Fornecedor f) {
        Connection con = MysqlFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            String sql = "UPDATE Supplier SET CompanyName = ?, Address = ?, City = ?, Phone = ? WHERE Id = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, f.getName());
            stmt.setString(2, f.getAddress());
            stmt.setString(3, f.getCity());
            stmt.setString(4, f.getPhone());
            stmt.setInt(5, f.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Fornecedor atualizado com sucesso!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o fornecedor:" + e);
        } finally {
            MysqlFactory.closeConnection();
        }
        
    }
    
    public void delete(Fornecedor f) {
        Connection con = MysqlFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            String sql = "DELETE FROM Supplier WHERE Id = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, f.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Fornecedor excluido com sucesso!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o fornecedor:" + e);
        } finally {
            MysqlFactory.closeConnection();
        }
        
    }
}
