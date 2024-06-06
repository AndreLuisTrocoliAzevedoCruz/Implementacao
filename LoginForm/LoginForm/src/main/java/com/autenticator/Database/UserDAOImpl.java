
package com.autenticator.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.autenticator.User;


/**
 * Implementação concreta do DAO de usuário.
 */

public class UserDAOImpl implements UserDAO {

	
	/**
     * Mapa que armazena os usuários, onde a chave é o nome de usuário e o valor é o
     * objeto User.
     */
	
	private Map<String, User> users = new HashMap<>();

	@Override
    public void saveUser(User user) {
        try {

        	/**
        	 *  Conecta ao banco de dados
        	 */
        	
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydatabase", "postgres",
                    "mypassword");

            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO users (username, password, email, phone_number, role) VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getPhoneNumber());
            stmt.setString(5, user.getRole());
            stmt.executeUpdate();
            users.put(user.getUsername(), user); /** adiciona o novo usuário ao mapa
            */

            /**
             *  Fecha a conexão
             */
            
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Encontra um usuário pelo nome salvo.
     */

    @Override
    public User findByUsername(String username) {
        User user = users.get(username);
        if (user == null) {
            throw new UsuarioInexistenteException("Usuario nao encontrado " + username);
        }
        return user;
    }
}


