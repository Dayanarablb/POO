
package Classes;

import javax.swing.JOptionPane;

public class validation {
    
public boolean ValidationTime(String input) {
    if (input.matches("^([0-1]?[0-9]|2[0-3]|[1-9]):[0-5][0-9]\\s*(?:AM|PM)?$")) {
        System.out.println("Hora valida: " + input);
        return true;
    } else {
        System.out.println("Formato de hora incorrecto. Use HH:mm (opcionalmente AM/PM)");
        JOptionPane.showMessageDialog(null, "Formato de hora incorrecto. Use HH:mm (opcionalmente AM/PM)", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }   
  }  
}
