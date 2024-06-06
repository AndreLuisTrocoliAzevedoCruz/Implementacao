
package com.autenticator.Database;

import com.autenticator.User;

/**
 * Implementação concreta do serviço de autenticação.
 */

public class AuthenticationServiceImpl extends AbstractAuthenticationService {

    
	/**
     * Construtor da classe.
     * 
     * @param userDAO Objeto DAO para acesso aos dados de usuário.
     */
	
	public AuthenticationServiceImpl(UserDAO userDAO) {
        super(userDAO);
    }

    /**
     * Verifica se o usuário está autenticado.
     * 
     * @return true se o usuário está autenticado, false caso contrário.
     */

    @Override
    public boolean isAuthenticated() {
        return authenticatedUser != null;
    }

    /**
     * Faz logout do usuário atual.
     */

    @Override
    public void logout() {
        authenticatedUser = null;
    }

    /**
     * Retorna o usuário atualmente autenticado.
     */

    @Override
    public User getAuthenticatedUser() {
        return authenticatedUser;
    }
}