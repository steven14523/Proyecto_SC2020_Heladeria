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
    String cedula;
    String nombre;
    String cargo;
    int edad;
    int horasTrabajadas;
    private float pagoHora;
    private float salario;
    
    public Empleado(){}

    public Empleado(String cedula, String nombre, String cargo, int edad, int horasTrabajadas, float pagoHora) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
        this.edad = edad;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoHora = pagoHora;
    }
    
    public int menu(){
        ArregloEmpleado empleado1 = new ArregloEmpleado();
        
    }

}// fin class Empleado
