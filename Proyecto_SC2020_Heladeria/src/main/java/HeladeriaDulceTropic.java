
import javax.swing.JOptionPane;

/*
Esta en la primera pagina a mostrar en la cual el usuario eligirá si desea continuar
cómo adminitrador o puede realizar un pedido.

aquí se realizará un ciclo While para entrar a un menú y con un 
Swith se elegirá entre tres ociones:
1- Ordenar
2- Entrar como adminitrador
0- Salir
*/

public class HeladeriaDulceTropic {

    public static void main(String[] args) {
        MenuPrincipal();
    }    
    
    public static void MenuPrincipal(){   
    Adminitrador admi1 = new Adminitrador();
    Ordenar cliente1 = new Ordenar();

    String usuario;
    String contrasena;
    
    int opcion = 0;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Bienvenido a Dulce Tropic"
                     + "\nElija la opción que desea:"
                     + "\n1. Ordenar"
                     + "\n2. Entrar como administrador"
                     + "\n0. Salir"));
            switch (opcion){
                case 1:
                cliente1.menu();
                break;
                case 2:
                JOptionPane.showMessageDialog(null,"Bienvenido al menú de adminitrador");
                int contador = 1;
                
                do{
                usuario = JOptionPane.showInputDialog("Escriba su usuario");
                contrasena = JOptionPane.showInputDialog("Escriba su contraseña");
                
                    if (usuario.equals(admi1.getUsuario()) && contrasena.equals(admi1.getContrasena())){
                    JOptionPane.showMessageDialog(null,"Bienvenido");
                    admi1.menu();// aquí entra al menú de adminitrador
                    break;
                    }// aqui el usuario y contrasenna son iguales y entran al menú adminitradtivo.
                    else if (!usuario.equals(admi1.getUsuario()) && !contrasena.equals(admi1.getContrasena())){            
                    JOptionPane.showConfirmDialog(null,"Su usuario o contraseña son incorrectos"
                    +"\nLleva " + contador + " intentos de 3, \n¿Desea volver a intentarlo?");
                        if(contador == 3){
                            JOptionPane.showMessageDialog(null,"Lo sentimos, ya utilizó los 3 intentos permitidos");
                            break;
                        }
                    }// fin sentencia if
                    contador++;  
                    
                }while(contador <= 3); // se repite el ciclo de pedir contraseña 3 veces
                
                JOptionPane.showMessageDialog(null, "Fin de sesión administrador");
                break;
                
                case 0:// salir 
                break; 
                
            }// fin switch para entrar al menú adminitrativo        
            
        } while (opcion != 0);// fin ciclo while del menú

    }// fin main
    
}// fin class HeladeriaDulceTropic