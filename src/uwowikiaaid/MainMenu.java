package uwowikiaaid;


import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import uwowikiaaid.Quests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simon
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MainMenu() {
        initComponents();
        this.setIconImage();
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnQuestsTemplate = new javax.swing.JButton();
        btnItems = new javax.swing.JButton();
        btnDiscovery = new javax.swing.JButton();
        btnBooks = new javax.swing.JButton();
        btnTradeGoods = new javax.swing.JButton();
        btnSkills = new javax.swing.JButton();
        btnCities = new javax.swing.JButton();
        btnShipsTemplate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frmMainMenu"); // NOI18N
        setSize(new java.awt.Dimension(100, 100));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnQuestsTemplate.setText("Quest Template");
        btnQuestsTemplate.setActionCommand("btnQuestsTemplate");
        btnQuestsTemplate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuestsTemplateMouseClicked(evt);
            }
        });
        getContentPane().add(btnQuestsTemplate, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 50, 150, -1));

        btnItems.setText("Items Template");
        btnItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnItemsMouseClicked(evt);
            }
        });
        btnItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemsActionPerformed(evt);
            }
        });
        getContentPane().add(btnItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 80, 150, -1));

        btnDiscovery.setText("Discovery Template");
        getContentPane().add(btnDiscovery, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, -1));

        btnBooks.setText("Book Template");
        btnBooks.setToolTipText("");
        btnBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBooksMouseClicked(evt);
            }
        });
        getContentPane().add(btnBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, -1));

        btnTradeGoods.setText("Trade Goods Template");
        btnTradeGoods.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTradeGoodsMouseClicked(evt);
            }
        });
        getContentPane().add(btnTradeGoods, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, -1));

        btnSkills.setText("Skills Template");
        btnSkills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkillsActionPerformed(evt);
            }
        });
        getContentPane().add(btnSkills, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, -1));

        btnCities.setText("Cities Template");
        btnCities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitiesActionPerformed(evt);
            }
        });
        getContentPane().add(btnCities, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, -1));

        btnShipsTemplate.setText("jButton1");
        getContentPane().add(btnShipsTemplate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, -1));

        setSize(new java.awt.Dimension(200, 356));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private void setIconImage() {
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("GVOnline.ico")));
}
    private void btnQuestsTemplateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuestsTemplateMouseClicked
     new Quests().setVisible(true);        // TODO add your handling code here:
     
    }//GEN-LAST:event_btnQuestsTemplateMouseClicked

    private void btnItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnItemsActionPerformed

    private void btnItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnItemsMouseClicked
        new Items().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnItemsMouseClicked

    private void btnBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBooksMouseClicked
        // TODO add your handling code here:
        new Books().setVisible(true);
    }//GEN-LAST:event_btnBooksMouseClicked

    private void btnTradeGoodsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTradeGoodsMouseClicked
        // TODO add your handling code here:
        new TradeGoods().setVisible(true);
    }//GEN-LAST:event_btnTradeGoodsMouseClicked

    private void btnSkillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkillsActionPerformed
        // TODO add your handling code here:
        new Skills().setVisible(true);
        
    }//GEN-LAST:event_btnSkillsActionPerformed

    private void btnCitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitiesActionPerformed
        // TODO add your handling code here:
        new CitiesTemplate().setVisible(true);
    }//GEN-LAST:event_btnCitiesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("GVOnline.ico")));

            Image myImg;
            ImageIcon icon = new ImageIcon("."+"GVOnline.ico");

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
  try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
                new File("C:\\UWOTextFiles\\Items").mkdirs();
                new File("C:\\UWOTextFiles\\Quests").mkdir();
                new File("C:\\UWOTextFiles\\Discoveries").mkdir();
                new File("C:\\UWOTextFiles\\Books").mkdir();
                new File("C:\\UWOTextFiles\\TradeGoods").mkdir();
                new File("C:\\UWOTextFiles\\Skills").mkdir();
                new File("C:\\UWOTextFiles\\Ships").mkdir();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBooks;
    private javax.swing.JButton btnCities;
    private javax.swing.JButton btnDiscovery;
    private javax.swing.JButton btnItems;
    private javax.swing.JButton btnQuestsTemplate;
    private javax.swing.JButton btnShipsTemplate;
    private javax.swing.JButton btnSkills;
    private javax.swing.JButton btnTradeGoods;
    // End of variables declaration//GEN-END:variables
}
