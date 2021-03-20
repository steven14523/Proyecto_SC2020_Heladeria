/* aqui se llevara un registro de los clientes que se registre , seran con un 
arreglo de maximo de 15 clientes. los datos se almacenarán gracia sa un arreglo  
*/

/**
 *
 * @author emily
 */
public class Cliente {
    String Usuario;
    String Contrasena;
    String Nombre;
    String Telefono;
    String FechaCumpleano;
    int Edad;
    int CodigoCliente;
    int FrecuenciaDeConsumo;
    int Descuento;
    
    public Cliente(){}
    public Cliente(String Usuario, String Contrasena, String Nombre, String Telefono, String FechaCumpleano, int Edad, int CodigoCliente, int FrecuenciaDeConsumo, int Descuento) {
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.FechaCumpleano = FechaCumpleano;
        this.Edad = Edad;
        this.CodigoCliente = CodigoCliente;
        this.FrecuenciaDeConsumo = FrecuenciaDeConsumo;
        this.Descuento = Descuento;
    }
   
}
