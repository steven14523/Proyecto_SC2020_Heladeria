
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emily
 */
public class Ordenar {
  
public void menu(){
    MenuRestaurante menuR = new MenuRestaurante();
    RegistroCliente registro1 = new RegistroCliente();
    
    int opcion = 0;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
            "Binevenido(a) a Dulce Tropic"+ 
            "\nAproveche nuestras ofertas para quienes formen parte de la familia Dulce Tropic"+
            "\n\nDigite la opción que desea realizar"+
            "\n1.Iniciar sesion "+
            "\n2.Registrarse "+
            "\n3.Ingresar como invitado"+
            "\n0.Salir"));
            
            switch(opcion){
                case 1:
                    
                break;
                case 2:
                registro1.registrar(); 
                break;
                case 3:
                    
                break;       
            }
            
    }while(opcion!=0);
   }

}
