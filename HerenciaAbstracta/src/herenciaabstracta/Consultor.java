/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaabstracta;

/**
 *
 * @author Estudiante
 */
public class Consultor extends Contrato {
    private String labor;

    public Consultor(int id) {
        super(id);
        this.labor = labor;
    }
    
    @Override
    double calcularSalario() {
        return 220;
    }
}
