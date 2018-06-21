/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboarddesktop;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFileChooser;

/**
 *
 * @author lmontesg
 */
public class mainMenu extends Frame implements View{
    
    Font lblFont;
    Label lblMessage;
    TextField txtData;
    Button btnInput;
    Button btnDone;
    
    public mainMenu(){
        Color color;
        setTitle("Menú principal");
        setBounds(100, 100, 450, 400);
        color = new Color(171, 0, 88);
        setBackground(color);
        setLayout(null);
        construyeComponentes();
    }
    /*
    /
    /
    /
    */
    public void construyeComponentes(){
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }});
        lblFont = new Font(Font.SANS_SERIF,Font.BOLD,18);
        lblMessage = new Label("Seleccionar el archivo deseado");
        lblMessage.setFont(lblFont);
        lblMessage.setForeground(Color.WHITE);
        lblMessage.setBounds(100, 100, 300, 25);
        add(lblMessage);
        
        txtData = new TextField();
        txtData.setBounds(125, 150, 200, 25);
        add(txtData);
        
        btnInput = new Button("...");
        btnInput.setBounds(350, 150, 25, 25);
        add(btnInput);
        
        btnDone = new Button("Done");
        btnDone.setBounds(200,200,50,50);
        add(btnDone);
    }
    
     public void setActionListener(Controller theController){
         btnInput.addActionListener(theController);
         btnDone.addActionListener(theController);
     }//end setActionListener

    
    public void inicia(){
        setVisible(true);
    }
            
}
