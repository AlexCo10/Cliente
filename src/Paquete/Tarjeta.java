
package Paquete;


public class Tarjeta {
    
    private Integer codigo;
    private Double limite;

    public Tarjeta() {
    }

    public Tarjeta(Integer codigo, Double limite) {
        this.codigo = codigo;
        this.limite = limite;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
    
    
    
}
