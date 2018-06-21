/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboarddesktop;

/**
 *
 * @author lmontesg
 */
public class DashboardDesktop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mainMenu interfaz = new mainMenu();
        mediator controller;
        
        controller = new mediator(interfaz);
        interfaz.setActionListener(controller);
        interfaz.inicia();
        
    }
    
}
