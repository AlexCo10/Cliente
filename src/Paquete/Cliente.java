
package Paquete;


public class Cliente {
    
    private Integer codigo;
    private String nombre;    
    private Tarjeta tarjeta;
    private Vendedor vendedor;

    public Cliente() {
        vendedor = new Vendedor();
    }

    public Cliente(Integer codigo, String nombre, Tarjeta tarjeta, Vendedor vendedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tarjeta = tarjeta;
        this.vendedor = new Vendedor();
        
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    @Override
    public String toString(){
        return "Cliente:\nCodigo::"+ codigo + "\nNombre: "
                + nombre + "\n***************\nTarjeta:\nCodigo: "+ tarjeta.getCodigo() + 
                "\nLimite: "+tarjeta.getLimite()+"\n***************"+
                "\nVendedor: \nNombre: "+  vendedor.getNombre() + "\nCodigo: "+
                vendedor.getCodigo();
        
    }
    
    
    
}
