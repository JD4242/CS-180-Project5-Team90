/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5;

/**
 *
 * @author Kyle
 */
public class ProfileGUI extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    public ProfileGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bluePanel = new javax.swing.JPanel();
        mainProfileLabel = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        mintPanel = new javax.swing.JPanel();
        userRealName = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        userNameText = new javax.swing.JLabel();
        friendsButton = new javax.swing.JButton();
        intrestsButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bluePanel.setBackground(new java.awt.Color(160, 231, 229));

        mainProfileLabel.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 18)); // NOI18N
        mainProfileLabel.setText("Main Profile");

        userIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/penguin.jpg"))); // NOI18N

        logoutButton.setBackground(new java.awt.Color(160, 231, 229));
        logoutButton.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 14)); // NOI18N
        logoutButton.setText("Log Out");
        logoutButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(180, 248, 200), 1, true));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bluePanelLayout = new javax.swing.GroupLayout(bluePanel);
        bluePanel.setLayout(bluePanelLayout);
        bluePanelLayout.setHorizontalGroup(
            bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bluePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainProfileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        bluePanelLayout.setVerticalGroup(
            bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bluePanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(mainProfileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mintPanel.setBackground(new java.awt.Color(180, 248, 200));

        userRealName.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 18)); // NOI18N
        userRealName.setText("Name:");

        userName.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 18)); // NOI18N
        userName.setText("Username:");

        nameLabel.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 14)); // NOI18N
        nameLabel.setText("Full Name");

        userNameText.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 14)); // NOI18N
        userNameText.setText("Username");

        friendsButton.setBackground(new java.awt.Color(180, 248, 200));
        friendsButton.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 14)); // NOI18N
        friendsButton.setText("Click to see friends!");
        friendsButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(180, 248, 200), 1, true));
        friendsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                friendsButtonMouseClicked(evt);
            }
        });

        intrestsButton.setBackground(new java.awt.Color(180, 248, 200));
        intrestsButton.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 14)); // NOI18N
        intrestsButton.setText("Click to see interests!");
        intrestsButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(180, 248, 200), 1, true));
        intrestsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                intrestsButtonMouseClicked(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(180, 248, 200));
        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitButton.setText("X");
        exitButton.setBorder(null);
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mintPanelLayout = new javax.swing.GroupLayout(mintPanel);
        mintPanel.setLayout(mintPanelLayout);
        mintPanelLayout.setHorizontalGroup(
            mintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mintPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(mintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mintPanelLayout.createSequentialGroup()
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(mintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(userNameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(132, 132, 132))
                    .addGroup(mintPanelLayout.createSequentialGroup()
                        .addGroup(mintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(intrestsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(friendsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mintPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mintPanelLayout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(userRealName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(370, Short.MAX_VALUE)))
        );
        mintPanelLayout.setVerticalGroup(
            mintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mintPanelLayout.createSequentialGroup()
                .addComponent(exitButton)
                .addGap(57, 57, 57)
                .addComponent(nameLabel)
                .addGap(51, 51, 51)
                .addGroup(mintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameText))
                .addGap(71, 71, 71)
                .addComponent(friendsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(intrestsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
            .addGroup(mintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mintPanelLayout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(userRealName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(468, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bluePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mintPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bluePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mintPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void friendsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_friendsButtonMouseClicked
        dispose();
        FriendsGUI friends = new FriendsGUI();
        
        friends.setVisible(true);
        friends.setLocationRelativeTo(null);
        friends.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }//GEN-LAST:event_friendsButtonMouseClicked

    private void intrestsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_intrestsButtonMouseClicked
        dispose();
        InterestsGUI interests = new InterestsGUI();
        
        interests.setVisible(true);
        interests.setLocationRelativeTo(null);
        interests.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }//GEN-LAST:event_intrestsButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        ConfirmGUI confirm = new ConfirmGUI();
        
        confirm.setVisible(true);
        confirm.setLocationRelativeTo(null);
        confirm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        dispose();
    }//GEN-LAST:event_logoutButtonMouseClicked

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
            java.util.logging.Logger.getLogger(ProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bluePanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton friendsButton;
    private javax.swing.JButton intrestsButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel mainProfileLabel;
    private javax.swing.JPanel mintPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel userIcon;
    private javax.swing.JLabel userName;
    private javax.swing.JLabel userNameText;
    private javax.swing.JLabel userRealName;
    // End of variables declaration//GEN-END:variables
}
