/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboarddesktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author lmontesg
 */
public interface Controller extends ActionListener{
   
    public Object obtieneDatoDelModel();
    public Object obtieneDatoDelView();
    public void actualizaElView();
    public void solicitaActualizacionDelModel();
    public void actionPerformed(ActionEvent evento);
    
}
