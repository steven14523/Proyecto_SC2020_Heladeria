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
    String codigoEmpleado;
    String cedula;
    String nombre;
    String cargo;
    int edad;
    int horasTrabajadas;
    private int salario;
    int bono;
    
    public Empleado(){}
    
    public Empleado(String codigoEmpleado, String cedula, String nombre, int edad, int horasTrabajadas, int salario, int bono) {
        this.codigoEmpleado = codigoEmpleado;
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.horasTrabajadas = horasTrabajadas;
        this.salario = salario;
        this.bono = bono;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int imprimirEmpleado(){
       return 0; 
    }
    
}// fin class Empleado
