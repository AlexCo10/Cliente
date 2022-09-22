
package Paquete;

public class Agregacion {
    
    private Cliente cliente;

    public Agregacion() {
        
        this.cliente= new Cliente();                
    }
    
    public void cargar(){
        
        cliente.setCodigo(7);
        cliente.setNombre("Alex");
        
        Tarjeta tarjeta= new Tarjeta();
        tarjeta.setCodigo(2);
        tarjeta.setLimite(2D);
        
        cliente.setTarjeta(tarjeta);
        
        cliente.getVendedor().setCodigo(5);
        cliente.getVendedor().setNombre("Carlos");
        
    }
    
    public void imprimir(){
        System.out.println(cliente.toString());      
        
    }
    
    public static void main(String[] args) {
        
        Agregacion a = new Agregacion();
        a.cargar();
        a.imprimir();
        
    }        
}
