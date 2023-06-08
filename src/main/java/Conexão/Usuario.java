package Conexão;

import java.sql.Connection;
import Conexão.GetSet;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Usuario {
    
    Connection conn;
    
    public ResultSet autenticacao(GetSet us){
        conn = new ConexãoBanco().conectaBD();
        try {
            String sql = "select * from LoginSenha where login = ? and senha = ? ";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, us.getLogin());
            pstm.setString(2, us.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            
            return rs;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    boolean next() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
