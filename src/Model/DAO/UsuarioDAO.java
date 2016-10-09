package Model.DAO;

import Connection.ConnectionFactory;
import Model.bean.Usuario;
import Tratamento_Exception.UsuarioInvalidoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {

    public boolean create( Usuario u){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            String sql = "INSERT INTO usuario (User_Nome,User_Login,User_Senha,User_Tipo) VALUES(?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getLogin());
            stmt.setString(3, u.getSenha());
            stmt.setString(4, u.getTipo_user());            
            stmt.executeQuery(sql);
            return true;
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return false;
    }
    
    public int procura_usuario(String login) throws UsuarioInvalidoException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql;
        
        try {
             sql = "SELECT User_ID FROM usuario WHERE User_Login ='"+login+"'";
             stmt = con.prepareStatement(sql);
             rs = stmt.executeQuery(sql);
             
             if(rs.first()){
                return rs.getInt(1);  
             }
             else{
                 throw new UsuarioInvalidoException();
             }

        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return -1;
    }

}