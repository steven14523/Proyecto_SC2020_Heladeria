import javax.swing.JOptionPane;
/**
 *
 * @author emily
 */
public class Adminitrador {
private String usuario = "emily.rp";
private String contrasena = "1234";
public int opcion;

    public Adminitrador(){}
    
// Aqui va el menú para ver las otras opciones---------------------------------
    public void menu(){
        HeladeriaDulceTropic menu = new HeladeriaDulceTropic();
        Empleado empleado1 = new Empleado();
        Sucursal sucursal1 = new Sucursal();
        Inventario inventario1 = new Inventario();
        Cliente cliente1 = new Cliente();
        Ganancia ganancia1 = new Ganancia();
        
         do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Usted se encuntra en el menú Administrador"
                     + "\nDigite la opción que desea consultar"
                     + "\n1. Empleados"
                     + "\n2. Sucursales"
                     + "\n3. Inventario"
                     + "\n4. Clientes"
                     + "\n5. Ganancias"      
                     + "\n0. Salir"));
            
            switch (opcion){
                case 1:
                    empleado1.datosEmpleado();
                    empleado1.mostrarEmpleado();
                    empleado1.volverAdministrador();
                    break;
                case 2://sucursal
                    break;
                case 3://inventario
                    break;
                case 4://cliente
                    break;
                case 5://ganancia
                    break;
                case 6:
                    
                    break;
                    
      
            }// fin switch
        } while(opcion != 0);//Fin ciclo while  
 }
//------------------------------------------------------------------------------
   
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
} 