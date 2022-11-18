/*
File Name:      CulminatingAssignment
Programmers:	Mathan Thatparananthan, Belinda Chen, Innilan Sathieskumar, Rafat Hossain
Date:		August 22, 2022
Description:	A program that simulates a game of hangman.
*/

import java.util.*;
import javax.swing.*;

public class FrmHangman extends javax.swing.JFrame {
       
    // Create String array to store potential words
    String [] wordBank; 
    
    // Declare variable for the word to find
    String wordToFind;
    
    // Declare and initialize variable to generate random number
    Random randomNum = new Random();
    
    // Declare char array to store found letters in the word
    char [] lettersFound;
    
    // Create ArrayList to store all incorrect guesses
    ArrayList <String> wrongLetters = new ArrayList<>();
    
    // Constant for max number of incorrect guesses
    final int MAX_ERRORS = 6;
    
    // Counter for the number of incorrect guesses
    int wrongGuesses = 0;
    
    public FrmHangman(String [] wordBank, String theme) {
        
        initComponents();
        
        // Make sure this screen is not initially visible
        this.setVisible(false);
        
        /* Enable/disable buttons initially to later set conditions for when  
           buttons can be pressed */
        btnPlay.setEnabled(true);
        btnGuessLetter.setEnabled(false);
        btnGuessWord.setEnabled(false);
        
        // Obtain word bank corresponding to user's them choice from main menu
        this.wordBank = wordBank;
        
        // Output the user's theme choice in the screen title
        lblTitle.setText("Hangman: " + theme);        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnMainMenu = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtWord = new javax.swing.JTextField();
        lblIcon = new javax.swing.JLabel();
        txtGuessLetter = new javax.swing.JTextField();
        lblGuessWord = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtIncorrectGuesses = new javax.swing.JTextArea();
        btnGuessLetter = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblGuessesRemaining = new javax.swing.JLabel();
        txtGuessWord = new javax.swing.JTextField();
        btnGuessWord = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInputInfo = new javax.swing.JTextArea();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hangman: Play");

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 255, 255));

        lblTitle.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Hangman");

        btnMainMenu.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        btnMainMenu.setText("Main Menu");
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtWord.setEditable(false);
        txtWord.setBackground(new java.awt.Color(255, 255, 255));
        txtWord.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        txtWord.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWordActionPerformed(evt);
            }
        });

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3.jpg"))); // NOI18N

        txtGuessLetter.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        txtGuessLetter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGuessLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuessLetterActionPerformed(evt);
            }
        });

        lblGuessWord.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N

        txtIncorrectGuesses.setEditable(false);
        txtIncorrectGuesses.setBackground(new java.awt.Color(255, 255, 255));
        txtIncorrectGuesses.setColumns(20);
        txtIncorrectGuesses.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        txtIncorrectGuesses.setLineWrap(true);
        txtIncorrectGuesses.setRows(5);
        txtIncorrectGuesses.setTabSize(7);
        txtIncorrectGuesses.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtIncorrectGuesses);

        btnGuessLetter.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        btnGuessLetter.setText("Guess a letter:");
        btnGuessLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuessLetterActionPerformed(evt);
            }
        });

        btnPlay.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        btnPlay.setText("Play");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel1.setText("Input Information");

        jLabel2.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel2.setText("Incorrect Guesses");

        lblGuessesRemaining.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        lblGuessesRemaining.setText("Guesses Remaining: 6");

        txtGuessWord.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        txtGuessWord.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGuessWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuessWordActionPerformed(evt);
            }
        });

        btnGuessWord.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        btnGuessWord.setText("Risk the game and guess a word:");
        btnGuessWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuessWordActionPerformed(evt);
            }
        });

        txtInputInfo.setEditable(false);
        txtInputInfo.setBackground(new java.awt.Color(255, 255, 255));
        txtInputInfo.setColumns(20);
        txtInputInfo.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        txtInputInfo.setLineWrap(true);
        txtInputInfo.setRows(5);
        txtInputInfo.setTabSize(7);
        txtInputInfo.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtInputInfo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuessWord)
                    .addComponent(btnGuessLetter))
                .addGap(22, 68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtGuessWord, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(txtGuessLetter))
                .addGap(138, 138, 138))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPlay)
                .addGap(248, 248, 248))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtWord))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblIcon)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnMainMenu)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnExit))
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                            .addComponent(jScrollPane1)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addGap(96, 96, 96))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lblGuessesRemaining)
                                .addGap(293, 293, 293)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGuessWord)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlay)
                .addGap(21, 21, 21)
                .addComponent(txtWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGuessLetter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuessLetter))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGuessWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuessWord))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblGuessWord))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblGuessesRemaining)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIcon)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnMainMenu)
                                    .addComponent(btnExit))))))
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
    
    /* 
     MY METHOD DEFINITION 
          Method Name: getWord
          Description: This function randomly selects a word for the user from
                       the word bank.
          Parameter Type: void
          Return Type: String
     */
    public String getWord(){
        return (wordBank[randomNum.nextInt(wordBank.length)]);
    }
    
    /* 
     MY METHOD DEFINITION 
          Method Name: newGame
          Description: This function resets everything so a new word can be used
          Parameter Type: void
          Return Type: void
     */
    public void newGame(){
        // Reset wrong guess counter
        wrongGuesses = 0;
        // Clear incorrect letter array list
        wrongLetters.clear();
        // Obtain the word to use
        wordToFind = getWord();
        
        // Initialize lettersFound array to have the size of the # of letter
        // found in the random word
        lettersFound = new char [wordToFind.length()];
        
        // Use for loop to set the array of letters found in the word to underscores
        for (int i = 0; i < lettersFound.length; i++){
            lettersFound[i] = '_';        
        }
        // Display array in word text field
        txtWord.setText(new String(lettersFound));
    }
    
    /* 
     MY METHOD DEFINITION 
          Method Name: setIcon
          Description: This function changes the hangman icon whenever an 
                       incorrect guess is entered
          Parameter Type: String
          Return Type: void
     */
    public void setIcon(){
        if(wrongGuesses == 1){
            lblIcon.setIcon(new ImageIcon("src/5.jpg"));
        }
        else if(wrongGuesses == 2){
            lblIcon.setIcon(new ImageIcon("src/6.jpg"));
        }
        else if(wrongGuesses == 3){
            lblIcon.setIcon(new ImageIcon("src/7.jpg"));
        }
        else if(wrongGuesses == 4){
            lblIcon.setIcon(new ImageIcon("src/8.jpg"));
        }
        else if(wrongGuesses == 5){
            lblIcon.setIcon(new ImageIcon("src/9.jpg"));
        }
        else{
            lblIcon.setIcon(new ImageIcon("src/10.jpg"));
        }
    }
    
    /* 
     MY METHOD DEFINITION 
          Method Name: enterLetter
          Description: This function checks if the letter entered can be added 
                       to the lettersFound array
          Parameter Type: String
          Return Type: void
     */
    public void enterLetter(String guessedLetter){
        // Clear input info text area
        txtInputInfo.setText("");
        
        // Condition when the guessedLetter has not been entered as neither a correct nor incorrect answer
        if (!wrongLetters.contains(guessedLetter) && !new String(lettersFound).contains(guessedLetter)){
            // Condition when word to find contains the guessedLetter
            if (wordToFind.contains(guessedLetter)){
                
                // Find first index of guessed letter in generated word
                int index = wordToFind.indexOf(guessedLetter);
                
                // Use while loop to find all instances of the guessedLetter and replace it in the correct slots
                while (index >= 0) {
                    lettersFound[index] = guessedLetter.charAt(0);
                    index = wordToFind.indexOf(guessedLetter, index + 1);           
                }
                // Change input information text area to output that the guessed letter is in the word
                txtInputInfo.setText("'" + guessedLetter + "' IS a character found in the word.");
            } 
            // Condition when word does not contain guessedLetter
            else{
                // Change input information text area to output that the guessed letter is not in the word
                txtInputInfo.setText("'" + guessedLetter + "' is NOT a character found in the word.");
                
                // Increment wrongGuesses counter
                wrongGuesses++;
                
                // Change icon depending on the # of remaining guesses
                setIcon();
                
                // guessedLetter is added to the wrong letters array list
                wrongLetters.add(guessedLetter);
                
                // Declare and initialize String variable
                String temp = "";
                
                // Using advanced for loop to output wrongLetters array
                for (String incorrectLetter : wrongLetters){
                    temp = temp + incorrectLetter + " ";
                }
                txtIncorrectGuesses.setText(temp);     
            }
        }
        // Condition when entered letter has already been entered
        else{
            // Change input information text area
            txtInputInfo.setText("'" + guessedLetter + "' is a character that you HAVE entered before.");
        }
    }

    /* 
     MY METHOD DEFINITION 
          Method Name: wordFoundContent
          Description: This function returns a String of the state of the word
                       found so far by the user
          Parameter Type: void
          Return Type: String
     */
    
    public String wordFoundContent(){
        // Declare and initialize StringBuilder
        StringBuilder builder = new StringBuilder();
        
        // Using for loop to add all discovered and undiscovered characters to
        // a StringBuilder
        for (int i = 0; i < lettersFound.length; i++) {
            builder.append(lettersFound[i]);
        }
        return (builder.toString());    
    }
    
    /* 
     MY METHOD DEFINITION 
          Method Name: wordFound
          Description: This function returns true if the word is found
          Parameter Type: void
          Return Type: boolean
     */
    public boolean wordFound() {
        // Converts the lettersFound array to a String and checks if it is equal to the chosen word
        return (wordToFind.contentEquals(new String(lettersFound)));
    }
    
    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        // Close current window
        this.dispose();
        // Open main menu form
        new FrmMainMenu().setVisible(true);
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Close the application
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWordActionPerformed

    private void txtGuessLetterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuessLetterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuessLetterActionPerformed

    private void btnGuessLetterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuessLetterActionPerformed

        // Obtain input from the user
        String guessedLetter = txtGuessLetter.getText().toUpperCase();

        // Condition when entered input consists of only of letters in the english alphabet
        if (guessedLetter.matches("[a-zA-Z]+")){
            // Only keep the first character if more than 1 letter is entered
            if (guessedLetter.length() > 1) {
                guessedLetter = guessedLetter.substring(0, 1);
            }

            // Update the word found so far by checking character entered
            enterLetter(guessedLetter);
            
            // Display current state of the word
            txtWord.setText(wordFoundContent());
            
            // Condition and output if word is found 
            if (wordFound()){
                // Close current screen and open win screen
                new FrmWin().setVisible(true);
                this.dispose();
                
            } // Condition if word is not found 
            else{
                // Condition where there are less incorrect guesses than the max allowed
                if (wrongGuesses < MAX_ERRORS){
                    // Display the tries remaining for the user
                    lblGuessesRemaining.setText("Guesses remaining: " + (MAX_ERRORS - wrongGuesses));   
                }
                // Condition when the user runs out of guesses  
                else{
                    // Close current screen and open lose screen while transferring wordToFind variable
                    new FrmLose(wordToFind).setVisible(true);
                    this.dispose();
                }
            }
        }
        // Condition and output when entered input consists of at least one character that is not in the english alphabet
        else{
            txtInputInfo.setText("INVALID INPUT - Make sure to enter only a single letter.");
        }
    }//GEN-LAST:event_btnGuessLetterActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        // Use method to start new game
        newGame();
        // Disable play button and enable buttons necessary to play the game
        btnPlay.setEnabled(false);
        btnGuessLetter.setEnabled(true);
        btnGuessWord.setEnabled(true);
    }//GEN-LAST:event_btnPlayActionPerformed

    private void txtGuessWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuessWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuessWordActionPerformed

    private void btnGuessWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuessWordActionPerformed
        
        // Obtain input from the user
        String guessedWord = txtGuessWord.getText().toUpperCase();

        // Condition when entered input consists of only of letters in the english alphabet
        if (guessedWord.matches("[a-zA-Z]+")){
            // Condition when guessed word is the same as the generated word
            if (guessedWord.equals(wordToFind)){
                // Close current screen and open win screen
                new FrmWin().setVisible(true);
                this.dispose();
            }
            // Condition when user reaches max number of mistakes 
            else {
                // Close current screen and open lose screen while transferring wordToFind variable
                new FrmLose(wordToFind).setVisible(true);
                this.dispose();
            }
        }
        // Condition and output when entered input consists of at least one character that is not in the english alphabet 
        else {
            txtInputInfo.setText("INVALID INPUT - Make sure to enter only letters.");
        }
    }//GEN-LAST:event_btnGuessWordActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrmHangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGuessLetter;
    private javax.swing.JButton btnGuessWord;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGuessWord;
    private javax.swing.JLabel lblGuessesRemaining;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtGuessLetter;
    private javax.swing.JTextField txtGuessWord;
    private javax.swing.JTextArea txtIncorrectGuesses;
    private javax.swing.JTextArea txtInputInfo;
    private javax.swing.JTextField txtWord;
    // End of variables declaration//GEN-END:variables
}
