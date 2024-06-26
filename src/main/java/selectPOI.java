import javax.swing.*;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author Matthew Josephson
 */
public class selectPOI extends javax.swing.JDialog {
    
    String  name;
    Icon icon;
    /**
     * Creates new form selectPOI
     */
    public selectPOI(java.awt.Frame parent, boolean modal, Icon icon) {
        super(parent, modal);
        initComponents();
        this.setLocation(700, 300);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        // Store the icon for future favouriting action
        this.icon = icon;
        // Set the icon name
        name = icon.point.getName();
        nameOfPoint.setText(name);
        this.imageLabel.setIcon(icon.imgLabel.getIcon());
        Border yellowBorder = BorderFactory.createLineBorder(Color.YELLOW);
        icon.imgLabel.setBorder(yellowBorder);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameOfPoint = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        Favourite = new javax.swing.JToggleButton();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameOfPoint.setBackground(new java.awt.Color(51, 51, 51));
        nameOfPoint.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        nameOfPoint.setForeground(new java.awt.Color(255, 255, 255));
        nameOfPoint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameOfPoint.setText("jLabel1");
        nameOfPoint.setToolTipText("");
        nameOfPoint.setOpaque(true);
        getContentPane().add(nameOfPoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 30));

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 30));

        Favourite.setText("Favourite");
        Favourite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FavouriteActionPerformed(evt);
            }
        });
        getContentPane().add(Favourite, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 83, 100, 30));

        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLabel.setAlignmentY(0.0F);
        getContentPane().add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 60, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        icon.imgLabel.setBorder(null);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void FavouriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FavouriteActionPerformed
        // TODO add your handling code here:
        icon.point.favourite(!icon.point.isFavourite());

        if(icon.point.isFavourite()){
            icon.imgLabel.setIcon(new ImageIcon("Assets/Icons/" + icon.point.getIconImg().replaceAll("\s", "") + "Favourite" + ".png"));
        }
        else{
            icon.imgLabel.setIcon(new ImageIcon("Assets/Icons/" + icon.point.getIconImg().replaceAll("\s", "") + ".png"));
        }

    }//GEN-LAST:event_FavouriteActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        icon.imgLabel.setBorder(null);
    }//GEN-LAST:event_formWindowClosed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Favourite;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel nameOfPoint;
    // End of variables declaration//GEN-END:variables
}
