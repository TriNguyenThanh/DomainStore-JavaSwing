package com.java.domainstore.FE.view;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.java.domainstore.FE.controller.LoginController;
import com.java.domainstore.utils.ImageUtils;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.UIManager;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
        this.setTitle("UTC2 Domain Store - Login");
        this.setIconImage(ImageUtils.getImage("/icon/utc2.png", 128, 128).getImage());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        cbbLanguage.setEnabled(false);
        setStyle();
    }

    private void setStyle() {
        lbBannerTitle.setIcon(new FlatSVGIcon("svg/logo.svg", 32, 32));
        lbBannerTitle.putClientProperty("FlatLaf.style", UIManager.get("TitleLabel"));

        img.setIcon(ImageUtils.getImage("/image/loginBG.png", 480, 450));

        lbFormTitle.putClientProperty("FlatLaf.style", "font: 48 bold Tahoma; foreground: #FFFFFF");

        lbUsernameErr.putClientProperty("FlatLaf.style", UIManager.get("ErrLabel"));
        lbUsername.putClientProperty("FlatLaf.style", "font: 18 Tahoma; foreground: #FFFFFF");

        lbPassErr.putClientProperty("FlatLaf.style", UIManager.get("ErrLabel"));
        lbPass.putClientProperty("FlatLaf.style", "font: 18 Tahoma; foreground: #FFFFFF");

        tfUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Số điện thoại");
        tfUsername.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("svg/user.svg"));
        tfPass.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Mật khẩu");
        tfPass.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("svg/key.svg"));
        tfPass.putClientProperty(FlatClientProperties.STYLE, "showRevealButton: true");

        lbRegisterLink.putClientProperty("FlatLaf.style", "font: 12 Tahoma; foreground: #000000");

        lbRegisterLink.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lbRegisterLink.setForeground(Color.BLUE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lbRegisterLink.setForeground(Color.BLACK);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                moveToRegister();

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new com.java.domainstore.FE.view.component.GradientBackground();
        banner = new javax.swing.JPanel();
        BannerTitle = new javax.swing.JPanel();
        lbBannerTitle = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        form = new javax.swing.JPanel();
        formTitle = new javax.swing.JPanel();
        lbFormTitle = new javax.swing.JLabel();
        mainForm = new javax.swing.JPanel();
        lbUsername = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        lbUsernameErr = new javax.swing.JLabel();
        lbPassErr = new javax.swing.JLabel();
        btLogin = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        lbRegisterLink = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        tfPass = new javax.swing.JPasswordField();
        pnLanguage = new javax.swing.JPanel();
        cbbLanguage = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Login"); // NOI18N

        background.setPreferredSize(new java.awt.Dimension(1000, 600));
        background.setLayout(new java.awt.BorderLayout());

        banner.setOpaque(false);
        banner.setPreferredSize(new java.awt.Dimension(550, 600));
        banner.setLayout(new java.awt.BorderLayout());

        BannerTitle.setOpaque(false);
        BannerTitle.setPreferredSize(new java.awt.Dimension(600, 100));

        lbBannerTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBannerTitle.setText("UTC2 DomainStore");

        javax.swing.GroupLayout BannerTitleLayout = new javax.swing.GroupLayout(BannerTitle);
        BannerTitle.setLayout(BannerTitleLayout);
        BannerTitleLayout.setHorizontalGroup(
            BannerTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BannerTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBannerTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BannerTitleLayout.setVerticalGroup(
            BannerTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerTitleLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbBannerTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        banner.add(BannerTitle, java.awt.BorderLayout.NORTH);

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        banner.add(img, java.awt.BorderLayout.CENTER);

        background.add(banner, java.awt.BorderLayout.CENTER);

        form.setMinimumSize(new java.awt.Dimension(400, 100));
        form.setOpaque(false);
        form.setPreferredSize(new java.awt.Dimension(450, 600));
        form.setLayout(new java.awt.BorderLayout());

        formTitle.setMinimumSize(new java.awt.Dimension(400, 100));
        formTitle.setOpaque(false);

        lbFormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFormTitle.setText("ĐĂNG NHẬP");

        javax.swing.GroupLayout formTitleLayout = new javax.swing.GroupLayout(formTitle);
        formTitle.setLayout(formTitleLayout);
        formTitleLayout.setHorizontalGroup(
            formTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formTitleLayout.createSequentialGroup()
                .addComponent(lbFormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );
        formTitleLayout.setVerticalGroup(
            formTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formTitleLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(lbFormTitle)
                .addContainerGap())
        );

        form.add(formTitle, java.awt.BorderLayout.NORTH);

        mainForm.setOpaque(false);
        mainForm.setPreferredSize(new java.awt.Dimension(400, 400));

        lbUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUsername.setText("Số điện thoại:");

        lbPass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPass.setText("Mật khẩu:");

        lbUsernameErr.setText(" ");

        lbPassErr.setText(" ");

        btLogin.setText("Đăng nhập");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        btExit.setText("Thoát");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        lbRegisterLink.setText("Chưa có tài khoản? Đăng ký ngay");

        javax.swing.GroupLayout mainFormLayout = new javax.swing.GroupLayout(mainForm);
        mainForm.setLayout(mainFormLayout);
        mainFormLayout.setHorizontalGroup(
            mainFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(lbPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbUsernameErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPassErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainFormLayout.createSequentialGroup()
                        .addGroup(mainFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(mainFormLayout.createSequentialGroup()
                                    .addComponent(btExit)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btLogin))
                                .addComponent(tfPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainFormLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(lbRegisterLink)
                .addGap(209, 209, 209))
        );
        mainFormLayout.setVerticalGroup(
            mainFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFormLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbUsernameErr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsername)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(lbPassErr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPass)
                    .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(mainFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLogin)
                    .addComponent(btExit))
                .addGap(18, 18, 18)
                .addComponent(lbRegisterLink)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        form.add(mainForm, java.awt.BorderLayout.CENTER);

        pnLanguage.setOpaque(false);

        cbbLanguage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiếng việt", "English", "Chinese", "Japanese", "Russia" }));

        javax.swing.GroupLayout pnLanguageLayout = new javax.swing.GroupLayout(pnLanguage);
        pnLanguage.setLayout(pnLanguageLayout);
        pnLanguageLayout.setHorizontalGroup(
            pnLanguageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLanguageLayout.createSequentialGroup()
                .addContainerGap(339, Short.MAX_VALUE)
                .addComponent(cbbLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnLanguageLayout.setVerticalGroup(
            pnLanguageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLanguageLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(cbbLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        form.add(pnLanguage, java.awt.BorderLayout.SOUTH);

        background.add(form, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moveToRegister() {
        this.dispose();
        RegisterForm.start();
    }
    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        LoginController loginController = new LoginController();
        List<Integer> errList = loginController.verify(tfUsername.getText(), tfPass.getPassword());

        if (errList.isEmpty()) {
            lbUsernameErr.setText(" ");
            lbPassErr.setText(" ");
            this.dispose();
            MainForm.start();
            return;
        }
        if (errList.contains(1)) {
            lbUsernameErr.setText("* Thiếu số điện thoại");
        } else {
            lbUsernameErr.setText(" ");
        }
        if (errList.contains(2)) {
            lbPassErr.setText("* Thiếu mật khẩu");
        } else {
            lbPassErr.setText(" ");
        }
        if (errList.contains(3)) {
            lbUsernameErr.setText("* Số điện thoại hoặc mật khẩu không đúng");
            lbPassErr.setText("* Số điện thoại hoặc mật khẩu không đúng");
        }
    }//GEN-LAST:event_btLoginActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btExitActionPerformed

    public static void start() {
        FlatMacLightLaf.registerCustomDefaultsSource("style");
        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BannerTitle;
    private com.java.domainstore.FE.view.component.GradientBackground background;
    private javax.swing.JPanel banner;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btLogin;
    private javax.swing.JComboBox<String> cbbLanguage;
    private javax.swing.JPanel form;
    private javax.swing.JPanel formTitle;
    private javax.swing.JLabel img;
    private javax.swing.JLabel lbBannerTitle;
    private javax.swing.JLabel lbFormTitle;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbPassErr;
    private javax.swing.JLabel lbRegisterLink;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lbUsernameErr;
    private javax.swing.JPanel mainForm;
    private javax.swing.JPanel pnLanguage;
    private javax.swing.JPasswordField tfPass;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
