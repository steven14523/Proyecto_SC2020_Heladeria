/*
 en este apartado van a ir las tres diferentes tipos de crepas a ordenar
cada crepa tendra un precio que al hacer la compra se ira a ganancias y cada 
crepa tendra los ingredientes, que al pedirla estos se rebajaran del inventario
 */

/**
 *
 * @author emily
 */
public class Crepas {
String nombre;
int precio;
String ingredientes;
int cantidad;

    public Crepas(){}
    public Crepas(String nombre, int precio, String ingredientes, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.cantidad = cantidad;
    }

public void comprar(){
    // aqui se deposita el dinero en la clase Ganacia
}    
public void rebajoIngredientes(){
    // aqui se rebaja los ingretes del inventario
}    

public void mostrarCompra(){
    //aqui se ve la compra 
}

}
