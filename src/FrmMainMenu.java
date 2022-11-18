/*
File Name:      CulminatingAssignment
Programmers:	Mathan Thatparananthan, Belinda Chen, Innilan Sathieskumar, Rafat Hossain
Date:		August 22, 2022
Description:	A program that simulates a game of hangman.
*/

public class FrmMainMenu extends javax.swing.JFrame {
    
    // Create String arrays to store words for each theme
    String [] videoGameBank = {"VALORANT", "FORTNITE", "TERRARIA", "MINECRAFT", 
                                   "PUBG", "COUNTERSTRIKE", "OVERWATCH", "SPLATOON", 
                                   "TETRIS", "MARIOKART"};

    String [] movieTitleBank = {"INSIDIOUS", "THOR", "INCEPTION", "AVENGERS", 
                                "UNCHARTED", "SPIDERMAN", "ALIENS", "MINIONS", 
                                "AVATAR", "FROZEN"};
    
    String [] celebrityBank = {"BLACKPINK", "KHALID", "HALSEY", "ADELE", 
                               "DRAKE", "MADONNA", "ZENDAYA", "RIHANNA", 
                               "EMINEM", "BEYONCE"};
    
    String [] foodWordBank = {"PIZZA", "QUESADILLA", "KIMCHI", "SALAD", 
                              "BURGER", "POUTINE", "RAMEN", "TAKOYAKI", 
                              "MACARON", "PASTA"};
    
    String [] rareWordBank = {"THALASSEMIA", "COMMISERATE", "OBTRUSIVELY","IMPERTINENT", 
                              "ACQUIESCENT", "ZEALOUSNESS", "SERENDIPITY", "FACETIOUSLY", 
                              "NEUROPATHIC", "DISCOTHEQUE"};
    
    public FrmMainMenu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaInstructions = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnVideoGames = new javax.swing.JButton();
        btnFood = new javax.swing.JButton();
        btnMovies = new javax.swing.JButton();
        btnRareWords = new javax.swing.JButton();
        btnCelebrities = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hangman: Main Menu");

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        lblTitle.setFont(new java.awt.Font("Goudy Old Style", 1, 48)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("HANGMAN");

        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel1.setText("INSTRUCTIONS:");

        txtAreaInstructions.setEditable(false);
        txtAreaInstructions.setBackground(new java.awt.Color(255, 255, 255));
        txtAreaInstructions.setColumns(20);
        txtAreaInstructions.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        txtAreaInstructions.setLineWrap(true);
        txtAreaInstructions.setRows(5);
        txtAreaInstructions.setText("This game of Hangman requires the user to first choose a theme of their choice. There are 5 themes: video games, movies, celebrities, foods, and rare words. When the user selects a theme and clicks play, a random word from the corresponding theme's word bank will be chosen.\n\nThe objective of the game is guess the word before the man is hanged. To do this, the user must guess which letters are in the word while only having information on the word's length. Every time the user guesses the wrong letter, a part of the hangman is added to the screen. \n\nWhen the entire man is drawn (after six failed guesses), the game will end.  However, if the user guesses the correct letter, it will display the letter at the correct placement(s) which will help in guessing the word. If they guess all the letters before the hangman is drawn, they win the game. Additionally, the user can guess the entire word but if it is wrong, the user loses. ");
        txtAreaInstructions.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtAreaInstructions);

        jLabel2.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel2.setText("Choose a theme to PLAY:");

        btnVideoGames.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        btnVideoGames.setText("Video Games");
        btnVideoGames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVideoGamesActionPerformed(evt);
            }
        });

        btnFood.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        btnFood.setText("Food");
        btnFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodActionPerformed(evt);
            }
        });

        btnMovies.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        btnMovies.setText("Movies");
        btnMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoviesActionPerformed(evt);
            }
        });

        btnRareWords.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        btnRareWords.setText("Rare Words");
        btnRareWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRareWordsActionPerformed(evt);
            }
        });

        btnCelebrities.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        btnCelebrities.setText("Celebrities");
        btnCelebrities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelebritiesActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(lblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnVideoGames)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMovies, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCelebrities)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFood, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRareWords)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMovies)
                        .addComponent(btnCelebrities, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFood, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRareWords))
                    .addComponent(btnVideoGames))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoviesActionPerformed
        // Open and send movie word bank to hangman game form
        new FrmHangman(movieTitleBank, "Movies").setVisible(true);
        // Close current window
        this.dispose();
    }//GEN-LAST:event_btnMoviesActionPerformed

    private void btnRareWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRareWordsActionPerformed
        // Open and send rare words bank to hangman game form
        new FrmHangman(rareWordBank, "Rare Words").setVisible(true);
        // Close current window
        this.dispose();
    }//GEN-LAST:event_btnRareWordsActionPerformed

    private void btnFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodActionPerformed
        // Open and send food word bank to hangman game form
        new FrmHangman(foodWordBank, "Food").setVisible(true);
        // Close current window
        this.dispose();
    }//GEN-LAST:event_btnFoodActionPerformed

    private void btnCelebritiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelebritiesActionPerformed
        // Open and send celebrity word bank to hangman game form
        new FrmHangman(celebrityBank, "Celebrities").setVisible(true);
        // Close current window
        this.dispose();
    }//GEN-LAST:event_btnCelebritiesActionPerformed

    private void btnVideoGamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVideoGamesActionPerformed
        // Open and send video game word bank to hangman game form
        new FrmHangman(videoGameBank, "Video Games").setVisible(true);
        // Close current window
        this.dispose();
    }//GEN-LAST:event_btnVideoGamesActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Close window
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCelebrities;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFood;
    private javax.swing.JButton btnMovies;
    private javax.swing.JButton btnRareWords;
    private javax.swing.JButton btnVideoGames;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtAreaInstructions;
    // End of variables declaration//GEN-END:variables
}
