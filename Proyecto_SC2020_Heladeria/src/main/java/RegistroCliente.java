
import javax.swing.JOptionPane;


public class RegistroCliente {
   private Cliente registro [] = new Cliente[10];

    public RegistroCliente() {
        for(int i=0; i<10; i++){
            registro[i] = new Cliente();
        }
    }

   public void registrar(){
    JOptionPane.showMessageDialog(null,"El registro consta de 6 pasos");
    String elUsuario = JOptionPane.showInputDialog("1/6 \nDigite un usuario");
    String laContrasena = JOptionPane.showInputDialog("2/6 \nDigite una contraseña facil de recordar");
    String elNombre = JOptionPane.showInputDialog("3/6 \nDiganos su nombre");
    String elTelefono = JOptionPane.showInputDialog("4/6 \nDiganos su número de teléfono");
    String elCumple = JOptionPane.showInputDialog("5/6 \nDiganos su fecha de cumpleaños (día/mes) ");
    int laEdad = Integer.parseInt(JOptionPane.showInputDialog("6/6 \nDigite su edad "));
    
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
            + "\nSu registro fue realizado con exito, su usuario y contraseña son las siguientes:"
            + "\n\nUsuario: " + registro[i].getUsuario()
            + "\nContraseña: " + registro[i].getContrasena()
            + "\nGuarde con cuidado los datos"
            + "\n\nAl completar dicho registro podrá venir el " + registro[i].getFechaCumpleano()
            + " por un helado ¡GRATIS!");
            break;
            }//fin if
    }//for
    }//registrar
   
    public void iniciarSesion(){
    int contador = 1;    
        do{
        for(int i=0; i<registro.length; i++){    
        String elUsuario = JOptionPane.showInputDialog("Escriba su usuario");
        String laContrasena = JOptionPane.showInputDialog("Escriba su contraseña");        
            if(registro[i].getUsuario().equals(elUsuario) && registro[i].getContrasena().equals(laContrasena)){
                JOptionPane.showMessageDialog(null,"Bienvenido "+ registro[i].getNombre());
                contador = 3;
                break;
            }// inicia sesión
            else if (!registro[i].getUsuario().equals(elUsuario) || !registro[i].getContrasena().equals(laContrasena)){
                JOptionPane.showConfirmDialog(null,"Su usuario o contraseña son incorrectos"
                    +"\nLleva " + contador + " intentos de 3, \n¿Desea volver a intentarlo?");
                if (contador == 3){
                    JOptionPane.showMessageDialog(null,"Lo sentimos, ya utilizó los 3 intentos permitidos");
                    break;
                }// fin contador        
            }// error en inicio sesión
            contador++;
        }// for
        } while(contador != 3);
    }// iniciarSesion
    
    public void mostrarClientes(){
    JOptionPane.showMessageDialog(null,"Dulce Topic consta de " + (registro.length)
    + " clientes registrados, los cuales son: ");
    for (int i=0; i<10; i++){
        JOptionPane.showMessageDialog(null,"Los datos del cliente " + (i+1) + "son: "
        + "\nNombre: " + registro[i].getNombre()
        + "\nEdad: " + registro[i].getEdad()
        + "\nCumpleaños: " + registro[i].getFechaCumpleano()
        + "\nTelefono:" + registro[i].getTelefono());
        }//for
    }//mostrarClientes
    
}//RegistroCliente
     