package controller;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomButton extends JButton {

    private Color defaultBackgroundColor = Color.BLACK;
    private Color hoverBackgroundColor = new Color(172, 44, 0); // Màu cam khi rê chuột vào
    private Color clickBackgroundColor = new Color(0, 0, 0);
    private Color borderColor = Color.BLACK;
    private int radius = 0;

    public CustomButton() {
        setBackground(defaultBackgroundColor);
        setBorder(new LineBorder(borderColor, 2));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(hoverBackgroundColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(defaultBackgroundColor);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(clickBackgroundColor);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setBackground(hoverBackgroundColor);
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
