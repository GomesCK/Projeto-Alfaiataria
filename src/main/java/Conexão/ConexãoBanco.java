package Conexão;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class ConexãoBanco {
    
    public Connection conectaBD(){
        Connection conn = null;
    
        try {
            String url = "D:\\wamp64\\tmp\\LoginSenha.csv";
            conn = DriverManager.getConnection(url);
            
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
        return conn;
}
}
