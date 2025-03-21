package com.java.domainstore.FE.view.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class MyTextField extends JTextField implements FocusListener{
    private int radius = 15; // Độ cong của góc
    private String placeholder;

    public MyTextField() {
        super();
        setOpaque(false); // Loại bỏ nền mặc định
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // Tạo padding bên trong
        setFont(new Font("Tahoma", Font.PLAIN, 18));
        placeholder = "String";
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        // Không vẽ viền mặc định
    }
    
    @Override
    public void focusGained(FocusEvent e) {
        if (getText().equals(placeholder)) {
            setText(""); // Xóa placeholder
            setForeground(Color.BLACK); // Chuyển màu chữ về bình thường
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (getText().isEmpty()) {
            setText(placeholder); // Hiển thị lại placeholder
            setForeground(Color.GRAY); // Đổi màu chữ về màu xám
        }
    }
}
