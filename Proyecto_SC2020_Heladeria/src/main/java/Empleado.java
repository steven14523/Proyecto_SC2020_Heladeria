
import javax.swing.JOptionPane;



/*
Los atributos seran encapsulados y rendremos un maximo de 8 empleados 
los cuales por medio de arreglos seran almacenados
el salario sera el unico dato privado
seran un total de 8 empleados y lo sdatos se llevaran por medio de un arreglo 
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

    private Empleado arreglo[] = new Empleado[3];//deberian ser mas empleados
    
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
    arreglo[1] = new Empleado("Jorge Jimenez","8102482394","Cocina",43,40,700500f); 
    arreglo[2] = new Empleado("Luciana Ricati","1883947392","Genernte",31,40,700000f); 
    }// fin datosEmpleado
    
    public void mostrarEmpleado(){
    JOptionPane.showMessageDialog(null, "Su planilla consta de " + (arreglo.length)
    + " empleados");
    for(int i=0; i<arreglo.length; i++){
    JOptionPane.showMessageDialog(null, 
        "Datos del empleado "+ (i+1) +
        "\nNombre: " + arreglo[i].nombre +
        "\nCédula: " + arreglo[i].cedula +
        "\nCargo: " + arreglo[i].cargo +
        "\nEdad: " + arreglo[i].edad +
        "\nSalario: ");  
        }
    }
    
    public void volverAdministrador(){
        Adminitrador admi = new Adminitrador();
        admi.menu();
    }
    
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
