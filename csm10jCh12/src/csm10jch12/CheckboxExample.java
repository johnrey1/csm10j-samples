/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch12;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ItemEvent;

/**
 *
 * @author johnr
 */
public class CheckboxExample extends javax.swing.JFrame {

    /**
     * Creates new form CheckboxExample
     */
    public CheckboxExample() {
        fontBold = Font.PLAIN;
        fontItalic = Font.PLAIN;
        fontSize = 24;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chkBold = new javax.swing.JCheckBox();
        chkItalic = new javax.swing.JCheckBox();
        chkLarge = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 300));

        chkBold.setText("Bold");
        chkBold.setName("chkBold"); // NOI18N
        chkBold.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkBoldItemStateChanged(evt);
            }
        });

        chkItalic.setText("Italic");
        chkItalic.setName("chkItalic"); // NOI18N
        chkItalic.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkItalicItemStateChanged(evt);
            }
        });

        chkLarge.setText("Large");
        chkLarge.setName("chkLarge"); // NOI18N
        chkLarge.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkLargeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(chkBold)
                .addGap(10, 10, 10)
                .addComponent(chkItalic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkLarge)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkBold)
                    .addComponent(chkItalic)
                    .addComponent(chkLarge))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkLargeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkLargeItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            fontSize = 48;
        } else {
            fontSize = 24;
        }
        
        repaint();
    }//GEN-LAST:event_chkLargeItemStateChanged

    private void chkItalicItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkItalicItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            fontItalic = Font.ITALIC;
        } else {
            fontItalic = Font.PLAIN;
        }
        
        repaint();
    }//GEN-LAST:event_chkItalicItemStateChanged

    private void chkBoldItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkBoldItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            fontBold = Font.BOLD;
        } else {
            fontBold = Font.PLAIN;
        }
        
        repaint();
    }//GEN-LAST:event_chkBoldItemStateChanged

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.red);
        g.setFont(new Font("Courier", fontBold + fontItalic, fontSize));
        g.drawString("Java programming check boxes", 0, 50);
    }

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
            java.util.logging.Logger.getLogger(CheckboxExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckboxExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckboxExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckboxExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckboxExample().setVisible(true);
            }
        });
    }

    private int fontBold, fontItalic, fontSize;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkBold;
    private javax.swing.JCheckBox chkItalic;
    private javax.swing.JCheckBox chkLarge;
    // End of variables declaration//GEN-END:variables
}