/*
 aqui se van a almacenar las ganacias del las dos sucursales
 */

/**
 *
 * @author emily
 */
public class Ganancia {
    private double montoActual;
    
    public Ganancia(){}
    
    public Ganancia(int montoActual) {
        this.montoActual = montoActual;
    }
    
    public double getMontoActual() {
        return montoActual;
    }

    public void setMontoActual(double montoActual) {
        this.montoActual = montoActual;
    }
        public void depositar(double ingreso){
        montoActual = montoActual + ingreso;
    }
        
}
