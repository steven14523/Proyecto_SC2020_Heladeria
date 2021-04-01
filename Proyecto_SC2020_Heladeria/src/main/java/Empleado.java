
import javax.swing.JOptionPane;



/*
Los atributos seran encapsulados y rendremos un maximo de 10 empleados 
los cuales por medio de arreglos seran almacenados
el salario sera el unico dato privado
seran un total de 10 empleados y lo sdatos se llevaran por medio de un arreglo 
/**
 *
 * @author emily
 */
public class Empleado {
    String nombre;
    String cedula;
    String cargo;
    int edad;
    private int horasSemana;
    private float pagoHora;
    private float salarioBruto;
    float suma;

    private Empleado arreglo[] = new Empleado[10];//deberian ser mas empleados
    Adminitrador admi = new Adminitrador();

    public Empleado(){}

    public Empleado(String nombre, String cedula, String cargo, int edad, int horasSemana, float pagoHora) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.cargo = cargo;
        this.horasSemana = horasSemana;
        this.pagoHora = pagoHora;
    }

    public void datosEmpleado(){
    arreglo[0] = new Empleado("Emily Rodríguez","116850795","Cocina",23,40,500000f); 
    arreglo[1] = new Empleado("j","8102482394","Cocina",31,40,700500f); 
    arreglo[2] = new Empleado("Luciana Ricati","1883947392","Generente",40,40,700000f);
    arreglo[3] = new Empleado("Valerie García","1883947392","Cocina",22,40,700000f);
    arreglo[4] = new Empleado("Luis Diego Soto","1883947392","Mesero",31,40,700000f);
    arreglo[5] = new Empleado("Esteban Sanchez","1883947392","Generente",31,40,700000f);
    arreglo[6] = new Empleado("Max Pacheco","1883947392","Generente",31,31,700000f);
    arreglo[7] = new Empleado("L","1883947392","Mesero",31,40,700000f);
    arreglo[8] = new Empleado("Guillermo Pacheco","1883947392","Generente",39,40,700000f);
    arreglo[9] = new Empleado("Vanessa Serrano","1883947392","Cocina",38,40,700000f);
    }// fin datosEmpleado
    
    public void mostrarEmpleado(){
    int salir = 0;    
    do{    
    String elNombre = JOptionPane.showInputDialog("Su planilla consta de " + (arreglo.length)
    + " empleados:"
    +"\n1. " + arreglo[0].nombre
    +"\n2. " + arreglo[1].nombre
    +"\n3. " + arreglo[2].nombre
    +"\n4. " + arreglo[3].nombre
    +"\n5. " + arreglo[4].nombre
    +"\n6. " + arreglo[5].nombre
    +"\n7. " + arreglo[6].nombre
    +"\n8. " + arreglo[7].nombre
    +"\n9. " + arreglo[8].nombre
    +"\n10. " + arreglo[9].nombre
    +"\n\nDigite el nombre del empleado que desea consultar"
    + "\nDigite Todos para consultar los datos de todos los empleados"
    +"\nDigite Salir para ir al menú de adminitrador");

    for(int i=0; i<arreglo.length; i++){
        if(arreglo[i].nombre.equals(elNombre)){
            JOptionPane.showMessageDialog(null, 
            "Datos del empleado: \n" + arreglo[i].nombre +
            "\nCédula: " + arreglo[i].cedula +
            "\nCargo: " + arreglo[i].cargo +
            "\nEdad: " + arreglo[i].edad +
            "\nSalario: ");// aqui debo multilicar el salario por la shoras 
            salir = 1;
            break;
            
        }else if (elNombre.equals("Todos")){
            for(int j=0; j<arreglo.length; j++){
            JOptionPane.showMessageDialog(null, 
            "Datos del empleado " + (j+1) +
            "\nNombre: " + arreglo[j].nombre +        
            "\nCédula: " + arreglo[j].cedula +
            "\nCargo: " + arreglo[j].cargo +
            "\nEdad: " + arreglo[j].edad +
            "\nSalario: ");// aqui debo multilicar el salario por la shoras 
            }
            break;    
        }else if (elNombre.equals("Salir")){
            salir = 0;
        }
        
    }//ciclo for
    }while(salir != 0);
    }//mostrarEmpleado

    //Setter and Getters ----------------------------------------------------

    public int getHorasSemana() {
        return horasSemana;
    }

    public void setHorasSemana(int horasSemana) {
        this.horasSemana = horasSemana;
    }

    public float getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(float pagoHora) {
        this.pagoHora = pagoHora;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }


    
}// fin class Empleado
