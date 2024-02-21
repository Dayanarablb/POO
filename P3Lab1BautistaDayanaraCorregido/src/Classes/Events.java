
package Classes;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import Interface.Event;

// DAYANARA BAUTISTA / LAB 1 / UNIDAD 3 / POO

public class Events implements Event{
    @Override
    public void quantityKeyPress(KeyEvent evt) {
    char num = evt.getKeyChar();
    String text = ((JTextField) evt.getSource()).getText();
    if (!Character.isDigit(num) || (text.length() >= 6 && num != KeyEvent.VK_BACK_SPACE)) {
        evt.consume();
    }
}
    @Override
    public void codeKeyPress(KeyEvent evt) {
    char num = evt.getKeyChar();
    String text = ((JTextField) evt.getSource()).getText();
    if (!Character.isDigit(num) || (text.length() >= 6 && num != KeyEvent.VK_BACK_SPACE)) {
        evt.consume();
    }
}
    @Override
    public void priceKeyPress(KeyEvent evt) {
    char num = evt.getKeyChar();
    String text = ((JTextField) evt.getSource()).getText();
    if ((!Character.isDigit(num) && num != '.' && num != KeyEvent.VK_BACK_SPACE) || (text.contains(".") && num == '.')) {
        evt.consume();
    }
}
    @Override
    public void nameKeyPress(KeyEvent evt) {
    char txt = evt.getKeyChar();
    if ((!Character.isLetter(txt) && txt != ' ' && txt != KeyEvent.VK_BACK_SPACE) || (Character.isLowerCase(txt) && !Character.isLetter(txt))) {
        evt.consume();
    }
}


    
}
