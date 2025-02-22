import java.sql.*;
import javax.swing.*;
public class Conecta {
    public static void main(String[] args) {
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/banco";
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "");
            JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso");
            connection.close();
        } catch (ClassNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado!\n"
                    + erro.toString());
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Problema na conexão com a fonte de dados\n"
                    + erro.toString());
        }
    }
}
