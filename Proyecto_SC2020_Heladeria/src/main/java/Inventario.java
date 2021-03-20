/*
aqui va a ir el inventario y mediante rebajos en la compra se va a saber cuanto queda de 
cada producto, el inventario se llevara con un Arreglo, de igual manera en este 
programa el cliente puede reponer productos 
 */

/**
 *
 * @author emily
 */
class Inventario {
String sucursal;
String producto;
int rebajo;
int cantidad;
int agregar;
    
    public Inventario(){}
    public Inventario(String sucursal, String producto, int cantidad) {
        this.sucursal = sucursal;
        this.producto = producto;
        this.cantidad = cantidad;
        this.rebajo = rebajo;
        this.agregar = agregar;
    }
public void rebajarProducto(){
    int resta = cantidad - rebajo;
}
public void agregarProducto(){
    int suma = cantidad + agregar;
}
public void mostrarProductos(){
    //JOptio.......
}
}
