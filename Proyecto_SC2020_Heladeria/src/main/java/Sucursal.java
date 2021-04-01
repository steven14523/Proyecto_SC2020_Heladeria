
import javax.swing.JOptionPane;

/* en las sucursales tendremos como maximos 2 
/**
 *
 * @author emily
 */
public class Sucursal {
    private String nombre = "Dulce Tropic";
    private String direccion = "Barrio Escalante, 10101, Escalante, San José Province";
    private String telefono = " 4081-8813";
    private String encargado;
    private String horario = "Lunes - Viernes: 11:00 am a 8:00pm - Sábado y Domigo: 8:00am a 8:00pm";
    
    
    public Sucursal(){}

    public void datosSucursal(){
        JOptionPane.showMessageDialog(null,"Datos del Local"
        + "\nNombre: " + nombre 
        + "\nDireccion: " + direccion
        + "\nTeléfono: " + telefono
        + "\nGerente: " + encargado
        +"\nHorario: "+ horario);
    
    }

    
    
}// fin sucursal
