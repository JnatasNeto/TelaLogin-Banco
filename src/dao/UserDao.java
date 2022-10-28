/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import Login.TelaDeCadastro;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Jonatas Neto
 */
public class UserDao {
    private final Connection connection;
    
    public UserDao (Connection connection){
        this.connection = connection;
    }
            // TODO add your handling code here
    public void Insert(User usuario) throws SQLException{    
            String sql = "insert into usuario(\"User\",\"Senha\") values('"+usuario.getUsuario()+"','"+usuario.getSenha()+"');";
            PreparedStatement  statement = connection.prepareStatement(sql);
            statement.execute();
            connection.close();
    }
}
