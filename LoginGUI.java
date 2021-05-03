/**
 *
 * @author Kyle
 */
public class LoginGUI extends javax.swing.JFrame {
    
    public String password;
    public String username;
    public boolean reg;
    public boolean exit;

    /**
     * Creates new form Login
     */
    public LoginGUI() {
        initComponents();
        
        password = null;
        username = null;
        reg = false;
        exit = false;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getUsername() {
        return username;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bluePanel = new javax.swing.JPanel();
        welcomeText = new javax.swing.JTextField();
        creamPanel = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JPasswordField();
        exitButton = new javax.swing.JButton();
        userNameText = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bluePanel.setBackground(new java.awt.Color(160, 231, 229));

        welcomeText.setEditable(false);
        welcomeText.setBackground(new java.awt.Color(160, 231, 229));
        welcomeText.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 24)); // NOI18N
        welcomeText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        welcomeText.setText("Welcome!");
        welcomeText.setBorder(null);

        javax.swing.GroupLayout bluePanelLayout = new javax.swing.GroupLayout(bluePanel);
        bluePanel.setLayout(bluePanelLayout);
        bluePanelLayout.setHorizontalGroup(
            bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bluePanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(welcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        bluePanelLayout.setVerticalGroup(
            bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bluePanelLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(welcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        creamPanel.setBackground(new java.awt.Color(251, 231, 198));

        passwordLabel.setBackground(new java.awt.Color(251, 231, 198));
        passwordLabel.setText("jPasswordField2");
        passwordLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        passwordLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordLabelFocusGained(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(242, 224, 197));
        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitButton.setText("X");
        exitButton.setBorder(null);
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        userNameText.setBackground(new java.awt.Color(251, 231, 198));
        userNameText.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 12)); // NOI18N
        userNameText.setText("Username");
        userNameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userNameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userNameTextFocusGained(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(251, 231, 198));
        loginButton.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 12)); // NOI18N
        loginButton.setText("Sign In");
        loginButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 221, 198), 1, true));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });

        signUpButton.setBackground(new java.awt.Color(251, 231, 198));
        signUpButton.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 12)); // NOI18N
        signUpButton.setText("Sign Up");
        signUpButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 221, 198), 1, true));
        signUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout creamPanelLayout = new javax.swing.GroupLayout(creamPanel);
        creamPanel.setLayout(creamPanelLayout);
        creamPanelLayout.setHorizontalGroup(
            creamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creamPanelLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(creamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(creamPanelLayout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(userNameText)
                    .addComponent(passwordLabel))
                .addGap(175, 175, 175))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creamPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        creamPanelLayout.setVerticalGroup(
            creamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creamPanelLayout.createSequentialGroup()
                .addComponent(exitButton)
                .addGap(81, 81, 81)
                .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(creamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bluePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(creamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bluePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(creamPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        exit = true;
    	System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void userNameTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameTextFocusGained
        userNameText.setText("");
    }//GEN-LAST:event_userNameTextFocusGained

    private void passwordLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordLabelFocusGained
        passwordLabel.setText("");
    }//GEN-LAST:event_passwordLabelFocusGained

	private void signUpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseClicked
        dispose();
        reg = true;
        
        //call following in client
        /*RegistrationGUI register = new RegistrationGUI();
        
        register.setVisible(true);
        register.setLocationRelativeTo(null);
        register.setDefaultCloseOperation(EXIT_ON_CLOSE);*/
    }//GEN-LAST:event_signUpButtonMouseClicked
	
    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        dispose();
        password = passwordLabel.getText();
        username = userNameText.getText();
        
        //call following in client
        /*ProfileGUI profile = new ProfileGUI();
        
        profile.setVisible(true);
        profile.setLocationRelativeTo(null);
        profile.setDefaultCloseOperation(EXIT_ON_CLOSE);*/
    }//GEN-LAST:event_loginButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bluePanel;
    private javax.swing.JPanel creamPanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField passwordLabel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField userNameText;
    private javax.swing.JTextField welcomeText;
    // End of variables declaration//GEN-END:variables
}