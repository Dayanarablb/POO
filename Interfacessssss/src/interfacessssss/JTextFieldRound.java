/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacessssss;

/**
 *
 * @author EFRAIN
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.BeanInfo;
import java.beans.BeanProperty;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import javax.swing.JTextField;

public class JTextFieldRound extends JTextField {

    private int roundTopLeft = 0;
    private int roundTopRight = 0;
    private int roundBottomLeft = 0;
    private int roundBottomRight = 0;
    private int offsetX = 0;
    private int offsetY = 0;

    public JTextFieldRound() {
        setOpaque(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                offsetX = e.getX();
                offsetY = e.getY();
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                setLocation(getLocation().x + e.getX() - offsetX, getLocation().y + e.getY() - offsetY);
            }
        });
    }



    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, roundTopLeft, roundTopLeft);
        g2.dispose();
        super.paintComponent(grphcs);
    }
    @BeanProperty

    public int getRoundTopLeft() {
        return roundTopLeft;
    }
@BeanProperty
    public void setRoundTopLeft(int roundTopLeft) {
        this.roundTopLeft = roundTopLeft;
        repaint();
    }
@BeanProperty
    public int getRoundTopRight() {
        return roundTopRight;
    }
@BeanProperty
    public void setRoundTopRight(int roundTopRight) {
        this.roundTopRight = roundTopRight;
        repaint();
    }
@BeanProperty
    public int getRoundBottomLeft() {
        return roundBottomLeft;
    }
@BeanProperty
    public void setRoundBottomLeft(int roundBottomLeft) {
        this.roundBottomLeft = roundBottomLeft;
        repaint();
    }
@BeanProperty
    public int getRoundBottomRight() {
        return roundBottomRight;
    }
@BeanProperty
    public void setRoundBottomRight(int roundBottomRight) {
        this.roundBottomRight = roundBottomRight;
        repaint();
    }
}