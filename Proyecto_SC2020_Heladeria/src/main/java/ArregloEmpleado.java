
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
public class ArregloEmpleado {
    float salario;
    
    public void arreglo(){
    Empleado arreglo[] =new Empleado[2];
    arreglo[0] = new Empleado("a","a","a",1,3,5); 
    arreglo[1] = new Empleado("b","b","b",2,4,6); 
    
    }
    
    public void desplegarInformacion(){
        JOptionPane.showMessageDialog(null, "solo es una prueba");
        
    }
    
}
