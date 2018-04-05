
package herenciaabstracta;


public abstract class Contrato {
    protected int id;
    abstract double calcularSalario();

    public Contrato(int id) {
        this.id = id;
    }
    
    
}
