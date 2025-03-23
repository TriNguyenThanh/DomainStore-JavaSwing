package com.java.domainstore.FE.view;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.FlatLightLaf;
import com.java.domainstore.FE.controller.RegisterController;
import com.java.domainstore.FE.model.RegisterModel;
import com.java.domainstore.utils.ImageUtils;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class RegisterForm extends javax.swing.JFrame {

    private RegisterController registerController = new RegisterController();
    private RegisterModel data = new RegisterModel();

    public RegisterForm() {
        initComponents();
        this.setTitle("UTC2 Domain Store - Register");
        this.setIconImage(ImageUtils.getImage("/icon/utc2.png", 128, 128).getImage());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        cbbLanguage.setEnabled(false);
        setStyle();
    }

    private void setStyle() {
        lbBannerTitle.setIcon(new FlatSVGIcon("svg/logo.svg", 32, 32));
        lbBannerTitle.putClientProperty("FlatLaf.style", UIManager.get("TitleLabel"));
        img.setIcon(ImageUtils.getImage("/image/RegisterBG.png", 480, 450));

        lbFormTitle.putClientProperty("FlatLaf.style", "font: 48 bold Tahoma; foreground: #FFFFFF");

        lbErrUsername.putClientProperty("FlatLaf.style", UIManager.get("ErrLabel"));
        lbErrEmail.putClientProperty("FlatLaf.style", UIManager.get("ErrLabel"));
        lbErrPhone.putClientProperty("FlatLaf.style", UIManager.get("ErrLabel"));
        lbErrPsID.putClientProperty("FlatLaf.style", UIManager.get("ErrLabel"));
        lbErrPass.putClientProperty("FlatLaf.style", UIManager.get("ErrLabel"));
        lbErrConfirmPass.putClientProperty("FlatLaf.style", UIManager.get("ErrLabel"));

        lbUsername.putClientProperty("FlatLaf.style", "font: 18 Tahoma; foreground: #FFFFFF");
        lbEmail.putClientProperty("FlatLaf.style", "font: 18 Tahoma; foreground: #FFFFFF");
        lbPhone.putClientProperty("FlatLaf.style", "font: 18 Tahoma; foreground: #FFFFFF");
        lbPsID.putClientProperty("FlatLaf.style", "font: 18 Tahoma; foreground: #FFFFFF");
        lbPass.putClientProperty("FlatLaf.style", "font: 18 Tahoma; foreground: #FFFFFF");
        lbConfirmPass.putClientProperty("FlatLaf.style", "font: 18 Tahoma; foreground: #FFFFFF");

        lbLoginLink.putClientProperty("FlatLaf.style", "font: 12 Tahoma; foreground: #000000");
        lbPassRules.putClientProperty("FlatLaf.style", "font: 12 italic Tahoma; foreground: #757575");

        tfPass.putClientProperty(FlatClientProperties.STYLE, "showRevealButton: true");
        tfConfirmPass.putClientProperty(FlatClientProperties.STYLE, "showRevealButton: true");

        lbLoginLink.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lbLoginLink.setForeground(Color.BLUE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lbLoginLink.setForeground(Color.BLACK);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                moveToLogin();
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
        pnUserName = new javax.swing.JPanel();
        lbUsername = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        lbErrUsername = new javax.swing.JLabel();
        pnEmail = new javax.swing.JPanel();
        tfEmail = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        lbErrEmail = new javax.swing.JLabel();
        pnPhone = new javax.swing.JPanel();
        tfPhone = new javax.swing.JTextField();
        lbPhone = new javax.swing.JLabel();
        lbErrPhone = new javax.swing.JLabel();
        pnPsID = new javax.swing.JPanel();
        tfPsID = new javax.swing.JTextField();
        lbPsID = new javax.swing.JLabel();
        lbErrPsID = new javax.swing.JLabel();
        pnPass = new javax.swing.JPanel();
        lbPass = new javax.swing.JLabel();
        lbErrPass = new javax.swing.JLabel();
        tfPass = new javax.swing.JPasswordField();
        pnConfirmPass = new javax.swing.JPanel();
        lbConfirmPass = new javax.swing.JLabel();
        lbErrConfirmPass = new javax.swing.JLabel();
        tfConfirmPass = new javax.swing.JPasswordField();
        pbButton = new javax.swing.JPanel();
        btRegister = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        lbLoginLink = new javax.swing.JLabel();
        pnLanguage = new javax.swing.JPanel();
        cbbLanguage = new javax.swing.JComboBox<>();
        lbPassRules = new javax.swing.JLabel();

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
        formTitle.setPreferredSize(new java.awt.Dimension(450, 60));

        lbFormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFormTitle.setText("ĐĂNG KÝ");

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
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(lbFormTitle)
                .addContainerGap())
        );

        form.add(formTitle, java.awt.BorderLayout.NORTH);

        mainForm.setOpaque(false);
        mainForm.setPreferredSize(new java.awt.Dimension(400, 490));
        mainForm.setLayout(new java.awt.GridLayout(7, 1));

        pnUserName.setOpaque(false);

        lbUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUsername.setText("Tên người dùng");

        lbErrUsername.setText(" ");

        javax.swing.GroupLayout pnUserNameLayout = new javax.swing.GroupLayout(pnUserName);
        pnUserName.setLayout(pnUserNameLayout);
        pnUserNameLayout.setHorizontalGroup(
            pnUserNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUserNameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnUserNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnUserNameLayout.createSequentialGroup()
                        .addComponent(lbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbErrUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnUserNameLayout.setVerticalGroup(
            pnUserNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUserNameLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lbErrUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnUserNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsername)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        mainForm.add(pnUserName);

        pnEmail.setOpaque(false);

        lbEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbEmail.setText("Email");

        lbErrEmail.setText(" ");

        javax.swing.GroupLayout pnEmailLayout = new javax.swing.GroupLayout(pnEmail);
        pnEmail.setLayout(pnEmailLayout);
        pnEmailLayout.setHorizontalGroup(
            pnEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEmailLayout.createSequentialGroup()
                        .addComponent(lbEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEmailLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbErrEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnEmailLayout.setVerticalGroup(
            pnEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEmailLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lbErrEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        mainForm.add(pnEmail);

        pnPhone.setOpaque(false);

        lbPhone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPhone.setText("Số điện thoại");

        lbErrPhone.setText(" ");

        javax.swing.GroupLayout pnPhoneLayout = new javax.swing.GroupLayout(pnPhone);
        pnPhone.setLayout(pnPhoneLayout);
        pnPhoneLayout.setHorizontalGroup(
            pnPhoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhoneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPhoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPhoneLayout.createSequentialGroup()
                        .addComponent(lbPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPhoneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbErrPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnPhoneLayout.setVerticalGroup(
            pnPhoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhoneLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lbErrPhone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPhoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPhone)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        mainForm.add(pnPhone);

        pnPsID.setOpaque(false);

        lbPsID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPsID.setText("Số CCCD");

        lbErrPsID.setText(" ");

        javax.swing.GroupLayout pnPsIDLayout = new javax.swing.GroupLayout(pnPsID);
        pnPsID.setLayout(pnPsIDLayout);
        pnPsIDLayout.setHorizontalGroup(
            pnPsIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPsIDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPsIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPsIDLayout.createSequentialGroup()
                        .addComponent(lbPsID, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPsID, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPsIDLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbErrPsID, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnPsIDLayout.setVerticalGroup(
            pnPsIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPsIDLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lbErrPsID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPsIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPsID)
                    .addComponent(tfPsID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        mainForm.add(pnPsID);

        pnPass.setOpaque(false);

        lbPass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPass.setText("Mật khẩu");

        lbErrPass.setText(" ");

        javax.swing.GroupLayout pnPassLayout = new javax.swing.GroupLayout(pnPass);
        pnPass.setLayout(pnPassLayout);
        pnPassLayout.setHorizontalGroup(
            pnPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPassLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbErrPass, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPassLayout.createSequentialGroup()
                        .addComponent(lbPass, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnPassLayout.setVerticalGroup(
            pnPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPassLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lbErrPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPass)
                    .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        mainForm.add(pnPass);

        pnConfirmPass.setOpaque(false);

        lbConfirmPass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbConfirmPass.setText("Xác nhận mật khẩu");

        lbErrConfirmPass.setText(" ");

        javax.swing.GroupLayout pnConfirmPassLayout = new javax.swing.GroupLayout(pnConfirmPass);
        pnConfirmPass.setLayout(pnConfirmPassLayout);
        pnConfirmPassLayout.setHorizontalGroup(
            pnConfirmPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConfirmPassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnConfirmPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnConfirmPassLayout.createSequentialGroup()
                        .addComponent(lbConfirmPass, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnConfirmPassLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbErrConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnConfirmPassLayout.setVerticalGroup(
            pnConfirmPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConfirmPassLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lbErrConfirmPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnConfirmPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbConfirmPass)
                    .addComponent(tfConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        mainForm.add(pnConfirmPass);

        pbButton.setOpaque(false);

        btRegister.setText("Đăng ký");
        btRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterActionPerformed(evt);
            }
        });

        btExit.setText("Thoát");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        lbLoginLink.setText("Đã có tài khoản? Đăng nhập ngay");

        javax.swing.GroupLayout pbButtonLayout = new javax.swing.GroupLayout(pbButton);
        pbButton.setLayout(pbButtonLayout);
        pbButtonLayout.setHorizontalGroup(
            pbButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbButtonLayout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(pbButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbLoginLink)
                    .addGroup(pbButtonLayout.createSequentialGroup()
                        .addComponent(btExit)
                        .addGap(76, 76, 76)
                        .addComponent(btRegister)))
                .addGap(41, 41, 41))
        );
        pbButtonLayout.setVerticalGroup(
            pbButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbButtonLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(lbLoginLink)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pbButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExit)
                    .addComponent(btRegister))
                .addGap(16, 16, 16))
        );

        mainForm.add(pbButton);

        form.add(mainForm, java.awt.BorderLayout.CENTER);

        pnLanguage.setOpaque(false);
        pnLanguage.setPreferredSize(new java.awt.Dimension(450, 50));

        cbbLanguage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiếng việt", "English", "Chinese", "Japanese", "Russia" }));

        lbPassRules.setText("Mật khẩu từ 8-16 ký tự bao gồm chữ cái, số, @,  .");

        javax.swing.GroupLayout pnLanguageLayout = new javax.swing.GroupLayout(pnLanguage);
        pnLanguage.setLayout(pnLanguageLayout);
        pnLanguageLayout.setHorizontalGroup(
            pnLanguageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLanguageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbbLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(lbPassRules)
                .addContainerGap())
        );
        pnLanguageLayout.setVerticalGroup(
            pnLanguageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLanguageLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(cbbLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnLanguageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPassRules, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        form.add(pnLanguage, java.awt.BorderLayout.SOUTH);

        background.add(form, java.awt.BorderLayout.WEST);

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

    private void moveToLogin() {
        this.dispose();
        LoginForm.start();
    }

    private void btRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterActionPerformed
        data.setName(tfUsername.getText());
        data.setEmail(tfEmail.getText());
        data.setPhone(tfPhone.getText());
        data.setPsID(tfPsID.getText());
        data.setPass(tfPass.getPassword());
        data.setCfPass(tfConfirmPass.getPassword());
        List<Integer> errorList = registerController.verify(data);

        if (errorList.contains(1)) {
            lbErrUsername.setText("* Thiếu họ và tên");
        } else {
            lbErrUsername.setText(" ");
        }
        if (errorList.contains(2)) {
            lbErrPhone.setText("* Số điện thoại không hợp lệ");
        } else {
            lbErrPhone.setText(" ");
        }
        if (errorList.contains(3)) {
            lbErrEmail.setText("* Email không hợp lệ");
        } else {
            lbErrEmail.setText(" ");
        }
        if (errorList.contains(4)) {
            lbErrPsID.setText("* Số CCCD không hợp lệ");
        } else {
            lbErrPsID.setText(" ");
        }
        if (errorList.contains(5)) {
            lbErrPass.setText("* Mật khẩu không hợp lệ");
        } else {
            lbErrPass.setText(" ");
        }
        if (errorList.contains(6)) {
            lbErrConfirmPass.setText("* Xác nhận mật khẩu không trùng khớp");
        } else {
            lbErrConfirmPass.setText(" ");
        }
        if (errorList.isEmpty()) {
            lbErrUsername.setText(" ");
            lbErrPhone.setText(" ");
            lbErrEmail.setText(" ");
            lbErrPsID.setText(" ");
            lbErrPass.setText(" ");
            lbErrConfirmPass.setText(" ");
            JOptionPane.showMessageDialog(null, "Tạo tài khoản mới thành công");
            this.dispose();
            LoginForm.start();
        }
        if (errorList.contains(7)) {
            lbErrUsername.setText(" ");
            lbErrPhone.setText(" ");
            lbErrEmail.setText(" ");
            lbErrPsID.setText(" ");
            lbErrPass.setText(" ");
            lbErrConfirmPass.setText(" ");
            JOptionPane.showMessageDialog(null, "Tạo tài khoản mới thất bại, hãy kiểm tra kết nối");
        }
    }//GEN-LAST:event_btRegisterActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btExitActionPerformed

    public static void start() {
        FlatLightLaf.registerCustomDefaultsSource("style");
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BannerTitle;
    private com.java.domainstore.FE.view.component.GradientBackground background;
    private javax.swing.JPanel banner;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btRegister;
    private javax.swing.JComboBox<String> cbbLanguage;
    private javax.swing.JPanel form;
    private javax.swing.JPanel formTitle;
    private javax.swing.JLabel img;
    private javax.swing.JLabel lbBannerTitle;
    private javax.swing.JLabel lbConfirmPass;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbErrConfirmPass;
    private javax.swing.JLabel lbErrEmail;
    private javax.swing.JLabel lbErrPass;
    private javax.swing.JLabel lbErrPhone;
    private javax.swing.JLabel lbErrPsID;
    private javax.swing.JLabel lbErrUsername;
    private javax.swing.JLabel lbFormTitle;
    private javax.swing.JLabel lbLoginLink;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbPassRules;
    private javax.swing.JLabel lbPhone;
    private javax.swing.JLabel lbPsID;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JPanel mainForm;
    private javax.swing.JPanel pbButton;
    private javax.swing.JPanel pnConfirmPass;
    private javax.swing.JPanel pnEmail;
    private javax.swing.JPanel pnLanguage;
    private javax.swing.JPanel pnPass;
    private javax.swing.JPanel pnPhone;
    private javax.swing.JPanel pnPsID;
    private javax.swing.JPanel pnUserName;
    private javax.swing.JPasswordField tfConfirmPass;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JPasswordField tfPass;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfPsID;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
