/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt8;

/**
 *
 * @author ledod
 */
public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String padecimiento;
    private String prioridad;

    public Paciente(String nombre, String padecimiento, String prioridad) {
        this.nombre = nombre;
        this.padecimiento = padecimiento;
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return nombre+" "+padecimiento+" "+ prioridad+" ";
    }
    
    public Paciente(){
        nombre=null;
        padecimiento=null;
        prioridad=null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPadecimiento() {
        return padecimiento;
    }

    public String getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Paciente o) {
        return prioridad.compareTo(o.getPrioridad());
    }
    
}
