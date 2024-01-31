
package com.mycompany.p2tarea3grupo2.classe;

import com.mycompany.p2tarea3grupo2.interfaceone.Events;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class Event implements Events{

    public Event() {
    }
    
    @Override
    public void textSpaceKeyPress(KeyEvent evt) {
        char txt = evt.getKeyChar();
        if(!Character.isLetter(txt) && txt != KeyEvent.VK_BACK_SPACE && txt != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }   
    
    @Override
    public void textKeyPress(KeyEvent evt) {
        char txt = evt.getKeyChar();
        if(!Character.isLetter(txt) && txt != KeyEvent.VK_BACK_SPACE) {
            
            evt.consume();
            JOptionPane.showMessageDialog(null, " Ingrese solo letras");
        }
    }
    
    @Override
    public void numberKeyPress(KeyEvent evt) {
        char num = evt.getKeyChar();
        if(!Character.isDigit(num) && num != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }
    
    @Override
    public void numFloatKeyPress(KeyEvent evt) {
        char flt = evt.getKeyChar();
        if(!Character.isDigit(flt) && flt != KeyEvent.VK_SPACE && flt != KeyEvent.VK_PERIOD) {
            evt.consume();
        }
    }
    
    public void validationID(KeyEvent evt){
        char txt = evt.getKeyChar();
        if (!Character.isDigit(txt) && txt != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo digitos");
        } else {
            String currentText = ((javax.swing.JTextField) evt.getSource()).getText();
            if (currentText.length() >= 10) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "La cedula debe tener 10 digitos");
            }
        }
    
        
    }
    public void phoneValidation(KeyEvent evt){
        char inputChar = evt.getKeyChar();

        // Obtiene el contenido actual del campo de texto
        String currentText = ((javax.swing.JTextField) evt.getSource()).getText();

        // Verifica si el carácter ingresado es un dígito
        if (Character.isDigit(inputChar)) {
            // Verifica si el número de teléfono tiene exactamente 10 dígitos y comienza con 0
            if (currentText.length() < 10 || (currentText.length() == 9 && currentText.startsWith("0"))) {
                // Permite la entrada del dígito
            } else {
                evt.consume();
                JOptionPane.showMessageDialog(null, "El número de teléfono debe tener exactamente 10 dígitos y comenzar con 0");
            }
        } else {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo dígitos");
        }
    }
    }
    

    
       

