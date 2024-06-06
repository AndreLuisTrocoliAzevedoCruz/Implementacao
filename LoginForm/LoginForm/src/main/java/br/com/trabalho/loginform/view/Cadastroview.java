/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.trabalho.loginform.view;


/**
 * Classe que representa a tela de cadastro do aplicativo.
 * 
 * Essa classe estende a classe javax.swing.JFrame e é responsável por criar e gerenciar
 * a interface gráfica da tela de cadastro.
 */

public class Cadastroview extends javax.swing.JFrame {

    /**
     * Inicializa o formulário de cadastro de usuário.
     */
	
    public Cadastroview() {
        initComponents();
    }

    /**
     * Inicializa os componentes do formulário de cadastro de usuário.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonTeladecadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 360, 40));

        jTextField2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 360, 40));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 360, 40));

        jButtonTeladecadastro.setContentAreaFilled(false);
        jButtonTeladecadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTeladecadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTeladecadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 270, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TelaCadastro.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1176, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Trata o evento de ação do campo de texto 2.
     * 
     * Este método é chamado quando o usuário pressiona enter no campo de texto 2.
     * 
     * @param evt o evento de ação do campo de texto 2
     */
    
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    
    
    /**
     * Trata o evento de ação do botão de cadastro.
     * 
     * Este método é chamado quando o usuário clica no botão de cadastro.
     * 
     * @param evt o evento de ação do botão de cadastro
     */
    
    private void jButtonTeladecadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTeladecadastroActionPerformed
      this.setVisible(false);
    }//GEN-LAST:event_jButtonTeladecadastroActionPerformed

    /**
     * Ponto de entrada do programa.
     * 
     * Este método é o ponto de entrada do programa e é responsável por configurar o look and feel
     * do aplicativo e exibir a tela de cadastro.
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
            java.util.logging.Logger.getLogger(Cadastroview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastroview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastroview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastroview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /**
         *  Cria e exibe o formulário.
         */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastroview().setVisible(true);
            }
        });
    }

    /** 
     * Declaracao de variaveis.
     */
    
    private javax.swing.JButton jButtonTeladecadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    
}
