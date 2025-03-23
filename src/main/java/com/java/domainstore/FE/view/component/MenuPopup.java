package com.java.domainstore.FE.view.component;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.java.domainstore.FE.model.UserSession;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.UIManager;

public class MenuPopup extends javax.swing.JPanel {

    private ActionListener actionListener;
    private final List<MenuItem> menuItems = new ArrayList<>();
    private int menuSelected = 0;

    public MenuPopup() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuHeader = new javax.swing.JPanel();
        AppTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        menuContent = new javax.swing.JPanel();
        home = new com.java.domainstore.FE.view.component.MenuItem();
        account = new com.java.domainstore.FE.view.component.MenuItem();
        cart = new com.java.domainstore.FE.view.component.MenuItem();
        bills = new com.java.domainstore.FE.view.component.MenuItem();
        userManager = new com.java.domainstore.FE.view.component.MenuItem();
        menuFooter = new javax.swing.JPanel();
        exit = new com.java.domainstore.FE.view.component.MenuItem();

        setPreferredSize(new java.awt.Dimension(0, 0));
        setLayout(new java.awt.BorderLayout());

        menuHeader.setOpaque(false);
        menuHeader.setPreferredSize(new java.awt.Dimension(400, 150));

        AppTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AppTitle.setText("Domain store");

        javax.swing.GroupLayout menuHeaderLayout = new javax.swing.GroupLayout(menuHeader);
        menuHeader.setLayout(menuHeaderLayout);
        menuHeaderLayout.setHorizontalGroup(
            menuHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AppTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        menuHeaderLayout.setVerticalGroup(
            menuHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuHeaderLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(AppTitle)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        add(menuHeader, java.awt.BorderLayout.NORTH);

        menuContent.setLayout(new java.awt.GridLayout(10, 1));
        menuContent.add(home);
        menuContent.add(account);
        menuContent.add(cart);
        menuContent.add(bills);
        menuContent.add(userManager);

        add(menuContent, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout menuFooterLayout = new javax.swing.GroupLayout(menuFooter);
        menuFooter.setLayout(menuFooterLayout);
        menuFooterLayout.setHorizontalGroup(
            menuFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(menuFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuFooterLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        menuFooterLayout.setVerticalGroup(
            menuFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
            .addGroup(menuFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuFooterLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(menuFooter, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppTitle;
    private com.java.domainstore.FE.view.component.MenuItem account;
    private com.java.domainstore.FE.view.component.MenuItem bills;
    private com.java.domainstore.FE.view.component.MenuItem cart;
    private com.java.domainstore.FE.view.component.MenuItem exit;
    private com.java.domainstore.FE.view.component.MenuItem home;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menuContent;
    private javax.swing.JPanel menuFooter;
    private javax.swing.JPanel menuHeader;
    private com.java.domainstore.FE.view.component.MenuItem userManager;
    // End of variables declaration//GEN-END:variables
    public String getMenuSelected() {
        return menuItems.get(menuSelected).getName();
    }

    public void setMenuSelected(int menuSelected) {
        this.menuSelected = menuSelected;
    }

    private void clearChoosen() {
        for (MenuItem menuItem : menuItems) {
            menuItem.setSelected(false);
        }
    }

    private void init() {
        AppTitle.putClientProperty("FlatLaf.style", UIManager.get("DarkTitleLabel"));
        AppTitle.setIcon(new FlatSVGIcon("svg/logo_dark.svg"));

        // set title and icon for menu button
        home.setIcon("svg/user.svg");
        home.setText("Home");
        home.setName("home");
        menuItems.add(home);

        account.setIcon("svg/user.svg");
        account.setText("My account");
        account.setName("account");
        menuItems.add(account);

        cart.setIcon("svg/cart.svg");
        cart.setText("Shopping Cart");
        cart.setName("cart");
        menuItems.add(cart);

        bills.setIcon("svg/bills.svg");
        bills.setText("Transaction manager");
        bills.setName("bills");
        menuItems.add(bills);

        // button with admin role
        userManager.setIcon("svg/database.svg");
        userManager.setText("User Manager");
        userManager.setName("userManager");
        menuItems.add(userManager);

        if (UserSession.getInstance().getRole().equals("admin")) {
            menuItems.getLast().setVisible(true);
        } else {
            menuItems.getLast().setVisible(false);
        }

        // exit button
        exit.setIcon("svg/logout.svg");
        exit.setText("Log out");
        exit.setName("exit");
        menuItems.add(exit);

        // set defaults button
        menuItems.get(menuSelected).setSelected(true);

        // change color when select a menuItem
        for (MenuItem menuItem : menuItems) {
            menuItem.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (menuSelected != menuItems.indexOf(menuItem)) {
                        clearChoosen();
                        menuItem.setSelected(true);
                        menuSelected = menuItems.indexOf(menuItem);

                        if (actionListener != null) {
                            String actionCommand;
                            if (getMenuSelected().equals("exit")) {
                                actionCommand = getMenuSelected();
                            } else {
                                actionCommand = "card_" + getMenuSelected();
                            }
                            actionListener.actionPerformed(new ActionEvent(this, java.awt.event.ActionEvent.ACTION_PERFORMED, actionCommand));
                        }
                    }
                }
            });
        }
    }

    public void setButtonListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }
}
