package com.java.domainstore.FE.view.component;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.event.MouseListener;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class MenuItem extends javax.swing.JPanel {

    private boolean selected = false;
    private String exit = "";

    public MenuItem() {
        initComponents();
        setStyle();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbMenuname = new javax.swing.JLabel();
        tag = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(0, 50));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        lbMenuname.setText("Menu name");

        javax.swing.GroupLayout tagLayout = new javax.swing.GroupLayout(tag);
        tag.setLayout(tagLayout);
        tagLayout.setHorizontalGroup(
            tagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        tagLayout.setVerticalGroup(
            tagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbMenuname)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbMenuname)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        if (!selected) {
            this.setBackground(UIManager.getColor(exit + "MenuItem.hover"));
        }
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        if (!selected) {
            this.setBackground(UIManager.getColor(exit + "MenuItem.background"));
        }
    }//GEN-LAST:event_formMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbMenuname;
    private javax.swing.JPanel tag;
    // End of variables declaration//GEN-END:variables

    private void setStyle() {
        lbMenuname.putClientProperty("FlatLaf.style", UIManager.get("Label"));
    }

    public void setIcon(String iconPath) {
        lbMenuname.setIcon(new FlatSVGIcon(iconPath));
    }

    // set text and mark a tag color for item
    public void setText(String name) {
        lbMenuname.setText(name);
        exit = lbMenuname.getText().equals("Log out") ? "Exit" : "";
        tag.setOpaque(true);
        tag.setBackground(new Color(UIManager.getColor(exit + "MenuItem.foreground").getRGB(), true));
    }

    public String getText() {
        return lbMenuname.getText();
    }

    public boolean isSelected() {
        return selected;
    }

    // set the status of item and change background color
    public void setSelected(boolean selected) {
        this.selected = selected;
        if (selected) {
            this.setBackground(new Color(UIManager.getColor(exit + "MenuItem.focus").getRGB(), true));
        } else {
            this.setBackground(new Color(UIManager.getColor(exit + "MenuItem.background").getRGB(), true));
        }
        this.repaint();
        this.revalidate();
    }

}
