/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboarddesktop;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author lmontesg
 */
public class mediator implements Controller{
    
    mainMenu view;
    
    public mediator(mainMenu theView)
    {
        
        view = theView;
        
    }//end constructor


    @Override
    public Object obtieneDatoDelModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object obtieneDatoDelView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizaElView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void solicitaActualizacionDelModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        Button boton;
        
        boton = (Button) evento.getSource();
        
        if(boton == view.btnInput){
            JFileChooser fileChooser = new JFileChooser();
            int selection = fileChooser.showOpenDialog(view);
            
            if (selection == JFileChooser.APPROVE_OPTION){
                File fileSelected = fileChooser.getSelectedFile();
                
                view.txtData.setText(fileSelected.getAbsolutePath());
                return;
            }
            
        }
        if(boton == view.btnDone){
            if (view.txtData.getText().endsWith(".xlsx")){
                ExcelFile excel = new ExcelFile(view.txtData.getText());
                excel.countRows("VITRO");
            }
        }
    }
    
}
