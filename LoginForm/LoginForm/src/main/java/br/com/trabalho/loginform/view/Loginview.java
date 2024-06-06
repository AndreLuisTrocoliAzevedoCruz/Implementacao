package br.com.trabalho.loginform.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.autenticator.Database.AbstractAuthenticationService;
import com.autenticator.Database.AuthenticationServiceImpl;
import com.autenticator.Database.UserDAO;
import com.autenticator.Database.UserDAOImpl;

/**
 * Classe que representa a tela de login do aplicativo.
 * 
 * Essa classe estende a classe javax.swing.JFrame e é responsável por criar e gerenciar
 * a interface gráfica da tela de login.
 * 
 */

public class Loginview extends javax.swing.JFrame {

    private AbstractAuthenticationService authenticationService;
    private javax.swing.JPasswordField jPasswordField1; // Declare jPasswordField1 as a field of the LoginView class

    /**
     * Inicializa o formulário de login.
     */
    
    public Loginview() {
        initComponents();
        
        UserDAO userDAO = new UserDAOImpl();
        authenticationService = new AuthenticationServiceImpl(userDAO);
    }

    /**
     * Inicializa os componentes do formulário de login.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonCadastro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 370, 50));

        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 370, 50));

        jButtonEntrar.setContentAreaFilled(false);
        jButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 240, 70));

        jButtonCadastro.setContentAreaFilled(false);
        jButtonCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 640, 170, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TelaLogin.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 1185, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     *  Configurações do botão "Entrar" 
     */
    
    private void jButtonEntrarActionPerformed(ActionEvent evt) {
        String username = jTextField1.getText();
        String password = String.valueOf(jPasswordField1.getPassword());

        if (authenticationService.authenticate(username, password)) {
            // Authentication successful
            // Perform further actions, such as opening the main application window
            JOptionPane.showMessageDialog(Loginview.this, "Authentication successful!");
            dispose();
        } else {
            // Authentication failed
            JOptionPane.showMessageDialog(Loginview.this, "Authentication failed!");
        }
    }

    /**
     *Configurações do botão "Cadastro"
     */
    
    private void jButtonCadastroActionPerformed(ActionEvent evt) {
        Cadastroview teladeCadastro = new Cadastroview();
        teladeCadastro.setVisible(true);
    }

    /**
     * Ponto de entrada do programa.
     * 
     * Este método é o ponto de entrada do programa e é responsável por configurar o look and feel
     * do aplicativo e exibir a tela de Login.
     * 
     * @param args os argumentos de linha de comando.
     */
    
    public static void main(String args[]) {
    	/** Define a aparência do Nimbus */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loginview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /**
         *  Cria e exibe o formulário.
         */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginview().setVisible(true);
            }
        });
    }

   /**
    * Declaracao das variaves.
    */
    
    private javax.swing.JButton jButtonCadastro;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
}