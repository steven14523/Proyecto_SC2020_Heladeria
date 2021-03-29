
import javax.swing.JOptionPane;

/* aqui se llevara un registro de los clientes que se registre , seran con un 
arreglo de maximo de 15 clientes. los datos se almacenarán gracia sa un arreglo  
*/

/**
 *
 * @author emily
 */
public class Cliente {
    private String Usuario;
    private String Contrasena;
    private String Nombre;
    private String Telefono;
    private String FechaCumpleano;
    private int Edad;
    
    public Cliente(){}

    public Cliente(String Usuario, String Contrasena, String Nombre, String Telefono, String FechaCumpleano, int Edad) {
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.FechaCumpleano = FechaCumpleano;
        this.Edad = Edad;
    }
    
    
//Setter and Getters -----------------------------------------------------------

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getFechaCumpleano() {
        return FechaCumpleano;
    }

    public void setFechaCumpleano(String FechaCumpleano) {
        this.FechaCumpleano = FechaCumpleano;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
    
    
    
}
