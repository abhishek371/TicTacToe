/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacTes;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HP_PC
 */
public class TicTacToe_s extends javax.swing.JFrame {
    
    private String startGame="X";
    private int xCount=0;
    private int oCount=0;
    /**
     * Creates new form TicTacToe_s
     */
    public TicTacToe_s() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
    }

    
    private void gameScore()
    {
        jlblPlayerX.setText(String.valueOf(xCount));
        jlblPlayerO.setText(String.valueOf(oCount));
    }
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame="O";
        }
        else
        {
            startGame="X";
        }
    }
    private void winningGame()
    {
        String b1=jButton1.getText();
        String b2=jButton2.getText();
        String b3=jButton3.getText();
        
        String b4=jButton16.getText();
        String b5=jButton17.getText();
        String b6=jButton18.getText();
        
        String b7=jButton19.getText();
        String b8=jButton20.getText();
        String b9=jButton21.getText();
        
        //for X
        //Horizontal
        if(b1==("X")&&b2==("X")&&b3==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.cyan);
            jButton2.setBackground(Color.cyan);
            jButton3.setBackground(Color.cyan);
        }
        
        if(b4==("X")&&b5==("X")&&b6==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton16.setBackground(Color.cyan);
            jButton17.setBackground(Color.cyan);
            jButton18.setBackground(Color.cyan);
        }
        
        if(b7==("X")&&b8==("X")&&b9==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton19.setBackground(Color.cyan);
            jButton20.setBackground(Color.cyan);
            jButton21.setBackground(Color.cyan);
        }
        
        //Vertical
        if(b1==("X")&&b4==("X")&&b7==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.cyan);
            jButton16.setBackground(Color.cyan);
            jButton19.setBackground(Color.cyan);
        }
        
        if(b2==("X")&&b5==("X")&&b8==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton2.setBackground(Color.cyan);
            jButton17.setBackground(Color.cyan);
            jButton20.setBackground(Color.cyan);
        }
        
        if(b3==("X")&&b6==("X")&&b9==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton3.setBackground(Color.cyan);
            jButton18.setBackground(Color.cyan);
            jButton21.setBackground(Color.cyan);
        }
        
        //Diagonal
        if(b1==("X")&&b5==("X")&&b9==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.cyan);
            jButton17.setBackground(Color.cyan);
            jButton21.setBackground(Color.cyan);
        }
        if(b3==("X")&&b5==("X")&&b7==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton3.setBackground(Color.cyan);
            jButton17.setBackground(Color.cyan);
            jButton19.setBackground(Color.cyan);
        }
        
        
        // For O
        //horizontal
        if(b1==("O")&&b2==("O")&&b3==("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton1.setBackground(Color.YELLOW);
            jButton2.setBackground(Color.YELLOW);
            jButton3.setBackground(Color.YELLOW);
        }
        
        if(b4==("O")&&b5==("O")&&b6==("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton16.setBackground(Color.YELLOW);
            jButton17.setBackground(Color.YELLOW);
            jButton18.setBackground(Color.YELLOW);
        }
        
        if(b7==("O")&&b8==("O")&&b9==("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton19.setBackground(Color.YELLOW);
            jButton20.setBackground(Color.YELLOW);
            jButton21.setBackground(Color.YELLOW);
        }
        
        //Vertical
        if(b1==("O")&&b4==("O")&&b7==("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton1.setBackground(Color.YELLOW);
            jButton16.setBackground(Color.YELLOW);
            jButton19.setBackground(Color.YELLOW);
        }
        
        if(b2==("O")&&b5==("O")&&b8==("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton2.setBackground(Color.YELLOW);
            jButton17.setBackground(Color.YELLOW);
            jButton20.setBackground(Color.YELLOW);
        }
        
        if(b3==("O")&&b6==("O")&&b9==("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton3.setBackground(Color.YELLOW);
            jButton18.setBackground(Color.YELLOW);
            jButton21.setBackground(Color.YELLOW);
        }
        
        //Diagonal
        if(b1==("O")&&b5==("O")&&b9==("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton1.setBackground(Color.YELLOW);
            jButton17.setBackground(Color.YELLOW);
            jButton21.setBackground(Color.YELLOW);
        }
        if(b3==("O")&&b5==("O")&&b7==("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton3.setBackground(Color.YELLOW);
            jButton17.setBackground(Color.YELLOW);
            jButton19.setBackground(Color.YELLOW);
        }
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jlblPlayerX = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jlblPlayerO = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Trajan Pro 3", 1, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Reckoner Bold", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("player x :");
        jPanel6.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jlblPlayerX.setFont(new java.awt.Font("Reckoner Bold", 1, 60)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jPanel7.add(jlblPlayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton16.setActionCommand("jButton4");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton16, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton17, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setLayout(new java.awt.BorderLayout());

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton18, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Reckoner Bold", 1, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("player o :");
        jPanel13.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jlblPlayerO.setFont(new java.awt.Font("Reckoner Bold", 1, 60)); // NOI18N
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jPanel8.add(jlblPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton19, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton20, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton21, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setLayout(new java.awt.BorderLayout());

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel16.add(jbtnReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setLayout(new java.awt.BorderLayout());

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm you want to exit","Tic Tac Toe",
            JOptionPane.YES_NO_OPTION  )==JOptionPane.YES_NO_CANCEL_OPTION);
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        jButton1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
                   jButton1.setForeground(Color.ORANGE); 
        }
        else
        {
            jButton1.setForeground(Color.GREEN);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
                   jButton2.setForeground(Color.ORANGE); 
        }
        else
        {
            jButton2.setForeground(Color.GREEN);
        }
        choose_a_Player();
        winningGame();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
                   jButton3.setForeground(Color.ORANGE); 
        }
        else
        {
            jButton3.setForeground(Color.GREEN);
        }
        choose_a_Player();
        winningGame();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jButton16.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
                   jButton16.setForeground(Color.ORANGE); 
        }
        else
        {
            jButton16.setForeground(Color.GREEN);
        }
        choose_a_Player();
        winningGame();

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
       jButton17.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
                   jButton17.setForeground(Color.ORANGE); 
        }
        else
        {
            jButton17.setForeground(Color.GREEN);
        }
        choose_a_Player();
        winningGame();

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jButton18.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
                   jButton18.setForeground(Color.ORANGE); 
        }
        else
        {
            jButton18.setForeground(Color.GREEN);
        }
        choose_a_Player();
        winningGame();

    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        jButton19.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
                   jButton19.setForeground(Color.ORANGE); 
        }
        else
        {
            jButton19.setForeground(Color.GREEN);
        }
        choose_a_Player();
        winningGame();

    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jButton20.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
                   jButton20.setForeground(Color.ORANGE); 
        }
        else
        {
            jButton20.setForeground(Color.GREEN);
        }
        choose_a_Player();
        winningGame();

    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
       
        jButton21.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
                   jButton21.setForeground(Color.ORANGE); 
        }
        else
        {
            jButton21.setForeground(Color.GREEN);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        
        jButton16.setText(null);
        jButton17.setText(null);
        jButton18.setText(null);
        
        jButton19.setText(null);
        jButton20.setText(null);
        jButton21.setText(null);
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton16.setBackground(Color.LIGHT_GRAY);
        jButton17.setBackground(Color.LIGHT_GRAY);
        jButton18.setBackground(Color.LIGHT_GRAY);
        
        jButton19.setBackground(Color.LIGHT_GRAY);
        jButton20.setBackground(Color.LIGHT_GRAY);
        jButton21.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jbtnResetActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_s().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    // End of variables declaration//GEN-END:variables
}
