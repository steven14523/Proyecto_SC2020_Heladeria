
import javax.swing.JOptionPane;


public class RegistroCliente {
   private Cliente registro [] = new Cliente[10];

    public RegistroCliente() {
        for(int i=0; i<10; i++){
            registro[i] = new Cliente();
        }
    }

   public void registrar(){
    String elUsuario = JOptionPane.showInputDialog("Digite un usuario");
    String laContrasena = JOptionPane.showInputDialog("Digite una contraseña facil de recordar");
    String elNombre = JOptionPane.showInputDialog("Diganos su nombre");
    String elTelefono = JOptionPane.showInputDialog("Diganos su número de teléfono");
    String elCumple = JOptionPane.showInputDialog("Diganos su fecha de cumpleaños (día/mes) ");
    int laEdad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad "));
    
    for(int i=0; i<10; i++){
        if(!registro[i].isEstado()){
            registro[i].setUsuario(elUsuario);
            registro[i].setContrasena(laContrasena);
            registro[i].setNombre(elNombre);
            registro[i].setTelefono(elTelefono);
            registro[i].setFechaCumpleano(elCumple);
            registro[i].setEdad(laEdad);
            JOptionPane.showMessageDialog(null,"Hola " + registro[i].getNombre()+
            " bienvenido(a) al la familia Dulce Tropic"
            + "\nSu registro fue realizado con exito, su usuario y contraseña son las siguientes"
            + "\n\nUsuario: " + registro[i].getUsuario()
            + "\nContraseña: " + registro[i].getContrasena()
            + "\nGuarde con cuidado los datos"
            + "\n\nAl registrarse puede venir el " + registro[i].getFechaCumpleano()
            + " por un helado ¡GRATIS!");
            break;
            }//fin if
    }//for
    }//registrar
}//RegistroCliente
