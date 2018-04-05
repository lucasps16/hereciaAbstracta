/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaabstracta;
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class LiderProyecto extends Programador {
    private ArrayList <Programador> programadores;

    public LiderProyecto(String nombre, double salario, int id, String lenguaje, ArrayList programadores) {
        super(nombre, salario, id, lenguaje);
        this.programadores = new ArrayList<>();
    }
    
    public boolean addProgramador(Programador progrmador){
        return this.programadores.add(progrmador);
    }
    
    @Override
    public double calcularSalario(){
        double extra = (salario*0.1);
        for(Programador programador : programadores){
            extra += extra;
        }
        return (this.salario + extra);
    }
}
