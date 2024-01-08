/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazgraficavehiculo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author EFRAIN
 */
public class Vehiculo extends JFrame {
    
    public JPanel panel;//Esto controla todo lo que va en la ventana registro - Coloco el panel aqui para utilizarlo en todas las funciones o metodos
    public Vehiculo(){//Dentro del panel habra una ventana llamada registro
    this.setSize(500,500);
    //El titulo en la ventana SERA REGISTRO
    setTitle("V E H I C U L O ");
        //TODOS ESTOS COMANDOS ESTAN EN EL API DE JAVA
    setDefaultCloseOperation(EXIT_ON_CLOSE);//sirve para que se cierre el sistema
        
    //CENTRAR LA VENTANA 
    //setBounds(500,200,500,500);//Estoy dando dimension para esta pantalla - Aqui estoy dando las coordenadas para que se sentren - Esto solo hara que se centre solo en mi pantalla
    //Centrar para toda pantalla
    setLocationRelativeTo(null);//Con esta linea de codigo si o si se va a centrar la pantalla en cualquir computadora - donde uno quiera
    iniciarComponentes();
    }
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiquetas();
      ColocarCajaTexto();
        
    }
     private void colocarPanel(){
        panel = new JPanel();
        //lE DAMOS UN COLOR AL PANEL 
        panel.setBackground(Color.GRAY);
        //Poner el panel sobre la ventana registro
        this.getContentPane().add(panel);//add. agregro panel     
    }
    //Metodo en donde se crean etiquetas
    public void colocarEtiquetas(){
        //Esto es un Label
        JLabel label = new JLabel("Vehiculos",SwingConstants.CENTER);
        //Inscrustamos
        panel.add(label);
        //bloqueamos los diseños para hacer diseños propios
        panel.setLayout(null);//anulamos el diseño del panel que viene por defecto
        label.setBounds(65, 10,350,50);//Cambia el lugar en donde esta el texto
        //Color de fondo de la etiqueta
        label.setForeground(Color.BLACK);
         //panel.setBackground(Color.ORANGE);
         label.setOpaque(true); //Api de java - Jlabel - y ahi esta todo
         //Creamos Objeto
         JLabel labell = new JLabel();
         labell.setText("Placa: ");
         //AGREGAMOS LA ETIQUETA AL PANEL
         panel.add(labell);
         //Ubicamos la etiqueta
         labell.setHorizontalAlignment(HEIGHT);
         //Cambiar la Fuente
         labell.setForeground(Color.BLACK);
         labell.setFont(new Font("arial",Font.PLAIN, 20));
         labell.setBounds(30, 110,350,50);
         
        /* public void ColocarBotones(){
        JButton boton = new JButton("CLICK");
        boton.setBounds(30,350,100,50);
        panel.add(boton);
        boton.setEnabled(true);
        boton.setMnemonic('a');
       
        
         JButton boton1 = new JButton("imagen");
         ImageIcon imagen1 =new ImageIcon("boton.jfif");
         
        boton1.setBounds(150,350,100,50);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('b');
        boton1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(boton1.getWidth(),boton1.getHeight(), Image.SCALE_SMOOTH)));
         
    }*/
     //Comando para volovar caja de texto
    
         //PONER IMAGEN
         /*JLabel labelimagen=new JLabel();
         ImageIcon imagen =new ImageIcon("registro.jfif");
         labelimagen.setBounds(20, 70, 100, 50);
         panel.add(labelimagen);
         
         labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(),labelimagen.getHeight(), Image.SCALE_SMOOTH)));*/
         
    }
    public void ColocarCajaTexto(){
    JTextField cajaTexto1 = new JTextField();
    cajaTexto1.setBounds(100,125,100,20);
    panel.add(cajaTexto1);
    cajaTexto1.setText("  ");
    System.out.println("El texto de la caja es: "+cajaTexto1.getText());
    }
 
}
