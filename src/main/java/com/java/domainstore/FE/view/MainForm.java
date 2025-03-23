package com.java.domainstore.FE.view;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.java.domainstore.FE.model.UserSession;
import com.java.domainstore.utils.ImageUtils;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainForm extends javax.swing.JFrame {

    private CardLayout cardLayout;

    public MainForm() {
        initComponents();
        this.setTitle("UTC2 Domain Store - App");
        this.setIconImage(ImageUtils.getImage("/icon/logoUTC2_255.png", 255, 255).getImage());
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        init();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBG = new com.java.domainstore.FE.view.component.GradientBackground();
        sideMenu = new com.java.domainstore.FE.view.component.MenuPopup();
        pnContent = new javax.swing.JPanel();
        pnHeader = new javax.swing.JPanel();
        lbHeader = new javax.swing.JLabel();
        pnBody = new javax.swing.JPanel();
        pbHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnAccount = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnCart = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnBills = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnUserManager = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout(3, 3));

        pnBG.setLayout(new java.awt.BorderLayout(3, 3));

        sideMenu.setPreferredSize(new java.awt.Dimension(400, 0));
        pnBG.add(sideMenu, java.awt.BorderLayout.WEST);

        pnContent.setLayout(new java.awt.BorderLayout(3, 3));

        pnHeader.setPreferredSize(new java.awt.Dimension(0, 150));

        lbHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnHeaderLayout = new javax.swing.GroupLayout(pnHeader);
        pnHeader.setLayout(pnHeaderLayout);
        pnHeaderLayout.setHorizontalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnHeaderLayout.setVerticalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnContent.add(pnHeader, java.awt.BorderLayout.NORTH);

        pnBody.setLayout(new java.awt.CardLayout());

        jLabel1.setText("home");

        javax.swing.GroupLayout pbHomeLayout = new javax.swing.GroupLayout(pbHome);
        pbHome.setLayout(pbHomeLayout);
        pbHomeLayout.setHorizontalGroup(
            pbHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbHomeLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(519, Short.MAX_VALUE))
        );
        pbHomeLayout.setVerticalGroup(
            pbHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbHomeLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(349, Short.MAX_VALUE))
        );

        pnBody.add(pbHome, "card_home");

        jLabel2.setText("Account");

        javax.swing.GroupLayout pnAccountLayout = new javax.swing.GroupLayout(pnAccount);
        pnAccount.setLayout(pnAccountLayout);
        pnAccountLayout.setHorizontalGroup(
            pnAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAccountLayout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(364, Short.MAX_VALUE))
        );
        pnAccountLayout.setVerticalGroup(
            pnAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAccountLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(373, Short.MAX_VALUE))
        );

        pnBody.add(pnAccount, "card_account");

        jLabel3.setText("Cart");

        javax.swing.GroupLayout pnCartLayout = new javax.swing.GroupLayout(pnCart);
        pnCart.setLayout(pnCartLayout);
        pnCartLayout.setHorizontalGroup(
            pnCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCartLayout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
        );
        pnCartLayout.setVerticalGroup(
            pnCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCartLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );

        pnBody.add(pnCart, "card_cart");

        jLabel4.setText("Bill");

        javax.swing.GroupLayout pnBillsLayout = new javax.swing.GroupLayout(pnBills);
        pnBills.setLayout(pnBillsLayout);
        pnBillsLayout.setHorizontalGroup(
            pnBillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBillsLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(540, Short.MAX_VALUE))
        );
        pnBillsLayout.setVerticalGroup(
            pnBillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBillsLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
        );

        pnBody.add(pnBills, "card_bills");

        jLabel5.setText("User Manager");

        javax.swing.GroupLayout pnUserManagerLayout = new javax.swing.GroupLayout(pnUserManager);
        pnUserManager.setLayout(pnUserManagerLayout);
        pnUserManagerLayout.setHorizontalGroup(
            pnUserManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUserManagerLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(438, Short.MAX_VALUE))
        );
        pnUserManagerLayout.setVerticalGroup(
            pnUserManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUserManagerLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(357, Short.MAX_VALUE))
        );

        pnBody.add(pnUserManager, "card_userManager");

        pnContent.add(pnBody, java.awt.BorderLayout.CENTER);

        pnBG.add(pnContent, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnBG, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void start() {
        FlatMacLightLaf.registerCustomDefaultsSource("style");
        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JPanel pbHome;
    private javax.swing.JPanel pnAccount;
    private com.java.domainstore.FE.view.component.GradientBackground pnBG;
    private javax.swing.JPanel pnBills;
    private javax.swing.JPanel pnBody;
    private javax.swing.JPanel pnCart;
    private javax.swing.JPanel pnContent;
    private javax.swing.JPanel pnHeader;
    private javax.swing.JPanel pnUserManager;
    private com.java.domainstore.FE.view.component.MenuPopup sideMenu;
    // End of variables declaration//GEN-END:variables

    private void init() {
        pnContent.setOpaque(false);
        pnHeader.setOpaque(false);

        cardLayout = (CardLayout) (pnBody.getLayout());
        sideMenu.setButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("exit")) {
                    logout();
                    return;
                }
                cardLayout.show(pnBody, e.getActionCommand());
            }
        });
    }

    private void logout() {
        UserSession.logout();
        this.dispose();
    }
}
