import javax.swing.JOptionPane;
/**
 *
 * @author emily
 */
public class Adminitrador {
private String usuario;
private String contrasena;
public int opcion;

public Adminitrador(){}

/*public Adminitrador(String usuario, String contrasena) {
    this.usuario = usuario;
    this.contrasena = contrasena;
    this.opcion = opcion;
    }
*/
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
// Aqui va el menú para ver las otras opciones---------------------------------
 public int menu(){
    Empleado empleado1 = new Empleado();
    Sucursal sucursal1 = new Sucursal();
    Inventario inventario1 = new Inventario();
    Cliente cliente1 = new Cliente();
    Ganancia ganancia1 = new Ganancia();
    
    while (opcion !=0){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Bienvenido a la Heladeria "
                     + "Digite la opción que desea consultar"
                     + "\n1. Empleado"
                     + "\n2. Sucursal"
                     + "\n3. Inventario"
                     + "\n4. Cliente"
                     + "\n5. Ganancias"
                     + "0. Salir"));
            switch (opcion){
                case 1://empleado
                case 2://sucursal
                case 3://inventario
                case 4://cliente
                case 5://ganancia
                case 0://salir    
//                break;           
            }// fin switch
        }//Fin ciclo while
    return 0;
    
 }
} 