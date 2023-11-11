package controller;

import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class CustomLabel extends JLabel {

    private Color defaultBackgroundColor = Color.BLACK;
    private Color hoverBackgroundColor = new Color(172, 44, 0); // Màu cam khi rê chuột vào
    private Color clickBackgroundColor = new Color(0, 0, 0);
    private Color borderColor = new Color(10, 10, 10);

    public CustomLabel() {
        setBackground(defaultBackgroundColor);
        setOpaque(true); // Đặt thuộc tính opaque thành true để vẽ nền
        setForeground(Color.WHITE);
        setFont(new Font("Arial", Font.BOLD, 20));
        setBorder(new BevelBorder(BevelBorder.RAISED, borderColor, borderColor.darker())); // Border kiểu bevel

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                SwingUtilities.invokeLater(() -> setBackground(hoverBackgroundColor));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                SwingUtilities.invokeLater(() -> setBackground(defaultBackgroundColor));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                SwingUtilities.invokeLater(() -> setBackground(clickBackgroundColor));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                SwingUtilities.invokeLater(() -> setBackground(hoverBackgroundColor));
            }
        });
    }

    public void setHoverBackgroundColor(Color hoverBackgroundColor) {
        this.hoverBackgroundColor = hoverBackgroundColor;
    }

    public void setClickBackgroundColor(Color clickBackgroundColor) {
        this.clickBackgroundColor = clickBackgroundColor;
    }
}
