
import javax.swing.JOptionPane;

/*
en la clase adminitrador se podrá entrar unicamente con una contraseña y usuario 
correctos , esto se hara gracias a un (no recuerdo como se hacía)

mediante un menú se van a deplegar ociones para poder consultar 
1. Empleado
2. Sucursal
3. Inventario
4. Cliente
5. Ganancia
0. Salir

al deplegar la información sera mediante el getter
 */

/**
 *
 * @author emily
 */
public class administrador {
    int opcion;
    private int usuario;
    private int contrasena;

    
    
    public void menu(){
    int opcion = 0;
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
                break;           
            }// fin switch
            
        }//Fin ciclo while
    }// fin menu

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getContrasena() {
        return contrasena;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }
    
}// fin class adminitrador
