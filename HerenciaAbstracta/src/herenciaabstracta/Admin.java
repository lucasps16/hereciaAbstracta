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
public class Admin extends Empleado {
    
    public Admin(String nombre, double salario, int  id){
      super(nombre, salario, id);  
    }
    
    @Override
    public double calcularSalario(){
        return 100;
    }
}
