package project5;

/**
 *
 * @author Kyle
 */
public class RegistrationGUI extends javax.swing.JFrame {
    
    public String username;
    public String fullName;
    public String password;
    public String email;

    /**
     * Creates new form Registration
     */
    public RegistrationGUI() {
        initComponents();
        
        username = userName.getText();
        fullName = userFullName.getText();
        password = userPassword.getText();
        email = userEmail.getText();
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getEmail() {
        return email;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mintPanel = new javax.swing.JPanel();
        registrationText = new javax.swing.JTextField();
        pinkPanel = new javax.swing.JPanel();
        userInputs = new javax.swing.JTextArea();
        userPasswordConfirm = new javax.swing.JPasswordField();
        userPassword = new javax.swing.JPasswordField();
        userFullName = new javax.swing.JTextField();
        userName = new javax.swing.JTextField();
        userEmail = new javax.swing.JTextField();
        exitButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mintPanel.setBackground(new java.awt.Color(180, 248, 200));

        registrationText.setEditable(false);
        registrationText.setBackground(new java.awt.Color(180, 248, 200));
        registrationText.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 24)); // NOI18N
        registrationText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        registrationText.setText("Registration");
        registrationText.setBorder(null);

        javax.swing.GroupLayout mintPanelLayout = new javax.swing.GroupLayout(mintPanel);
        mintPanel.setLayout(mintPanelLayout);
        mintPanelLayout.setHorizontalGroup(
            mintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mintPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(registrationText, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        mintPanelLayout.setVerticalGroup(
            mintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mintPanelLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(registrationText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pinkPanel.setBackground(new java.awt.Color(255, 174, 188));

        userInputs.setEditable(false);
        userInputs.setBackground(new java.awt.Color(255, 174, 188));
        userInputs.setColumns(20);
        userInputs.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 18)); // NOI18N
        userInputs.setRows(5);
        userInputs.setText("Full Name:\n\n\n\nUsername:\n\n\n\nPassword:\n\n\n\nConfirm Password:\n\n\n\nEmail:");
        userInputs.setBorder(null);

        userPasswordConfirm.setBackground(new java.awt.Color(255, 174, 188));
        userPasswordConfirm.setText("jPasswordField1");
        userPasswordConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userPasswordConfirmFocusGained(evt);
            }
        });

        userPassword.setBackground(new java.awt.Color(255, 174, 188));
        userPassword.setText("jPasswordField2");
        userPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userPasswordFocusGained(evt);
            }
        });

        userFullName.setBackground(new java.awt.Color(255, 174, 188));
        userFullName.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 14)); // NOI18N
        userFullName.setText("Full Name");
        userFullName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userFullNameFocusGained(evt);
            }
        });

        userName.setBackground(new java.awt.Color(255, 174, 188));
        userName.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 14)); // NOI18N
        userName.setText("Username");
        userName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userNameFocusGained(evt);
            }
        });

        userEmail.setBackground(new java.awt.Color(255, 174, 188));
        userEmail.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 12)); // NOI18N
        userEmail.setText("Email");
        userEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userEmailFocusGained(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 174, 188));
        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitButton.setText("X");
        exitButton.setBorder(null);
        exitButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                exitButtonFocusGained(evt);
            }
        });

        signUpButton.setBackground(new java.awt.Color(255, 174, 188));
        signUpButton.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 12)); // NOI18N
        signUpButton.setText("Sign Up!");
        signUpButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 174, 188), 1, true));
        signUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pinkPanelLayout = new javax.swing.GroupLayout(pinkPanel);
        pinkPanel.setLayout(pinkPanelLayout);
        pinkPanelLayout.setHorizontalGroup(
            pinkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinkPanelLayout.createSequentialGroup()
                .addGroup(pinkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pinkPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(userInputs, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(pinkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pinkPanelLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(130, 130, 130))
            .addComponent(exitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pinkPanelLayout.setVerticalGroup(
            pinkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinkPanelLayout.createSequentialGroup()
                .addComponent(exitButton)
                .addGap(29, 29, 29)
                .addGroup(pinkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pinkPanelLayout.createSequentialGroup()
                        .addComponent(userFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(userPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(userPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(userEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(signUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mintPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pinkPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mintPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pinkPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userFullNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFullNameFocusGained
        userFullName.setText("");
    }//GEN-LAST:event_userFullNameFocusGained

    private void userNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameFocusGained
        userName.setText("");
    }//GEN-LAST:event_userNameFocusGained

    private void userPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userPasswordFocusGained
        userPassword.setText("");
    }//GEN-LAST:event_userPasswordFocusGained

    private void userPasswordConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userPasswordConfirmFocusGained
        userPasswordConfirm.setText("");
    }//GEN-LAST:event_userPasswordConfirmFocusGained

    private void userEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userEmailFocusGained
        userEmail.setText("");
    }//GEN-LAST:event_userEmailFocusGained

    private void exitButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_exitButtonFocusGained
        dispose();
    }//GEN-LAST:event_exitButtonFocusGained

    private void signUpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseClicked
        dispose();
        ProfileGUI profile = new ProfileGUI();
        
        profile.setVisible(true);
        profile.setLocationRelativeTo(null);
        profile.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_signUpButtonMouseClicked

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
            java.util.logging.Logger.getLogger(RegistrationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel mintPanel;
    private javax.swing.JPanel pinkPanel;
    private javax.swing.JTextField registrationText;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField userEmail;
    private javax.swing.JTextField userFullName;
    private javax.swing.JTextArea userInputs;
    private javax.swing.JTextField userName;
    private javax.swing.JPasswordField userPassword;
    private javax.swing.JPasswordField userPasswordConfirm;
    // End of variables declaration//GEN-END:variables
}
