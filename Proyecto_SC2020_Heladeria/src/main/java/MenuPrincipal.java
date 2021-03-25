
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

public class MenuPrincipal {

    public static void main(String[] args) {
    Adminitrador admi1 = new Adminitrador();
    Ordenar cliente1 = new Ordenar();
    
    String usuario;
    String contrasena;
    
    int opcion = 0;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Bienvenido a la Heladeria (nombre de heladeria)"
                     + "\nDigite la opción que desea realizar"
                     + "\n1. Ordenar"
                     + "\n2. Entrar como administrador"
                     + "\n0. Salir"));
            switch (opcion){
                case 1:
                JOptionPane.showConfirmDialog(null, "ejemplo");
                break;
                
                case 2:
                int contador = 1;
                
                do{
                usuario = JOptionPane.showInputDialog("Escriba su usuario");
                contrasena = JOptionPane.showInputDialog("Escriba su contraseña");
                
                    if (usuario == admi1.getUsuario() && contrasena == admi1.getContrasena()){
                    admi1.menu();
                    }// aqui el usuario y contrasenna son iguales y entran al menú adminitradtivo.
                    else if (usuario != admi1.getUsuario() || contrasena != admi1.getContrasena()){             
                    JOptionPane.showMessageDialog(null,"Su usuario o contraseña son incorrectos"
                    +"\nLleva " + contador + " intentos de 3");
                    }// fin sentencia if
                    contador++;  
                    
                }while(contador <4); // se repite el ciclo de pedir contrasena\
                JOptionPane.showMessageDialog(null, "Ya ulizó los 3 intentos");
                break;
                
                case 0:// salir 
                break; 
                
            }// fin switch         
            
        } while (opcion == 0);// fin ciclo while del menú

    }// fin main
    
}// fin class MenuPrincipal
