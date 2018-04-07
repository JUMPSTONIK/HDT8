/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    /**
     * devuelve un string con todos los datos del paciente
     */
    public String toString() {
        return nombre+" "+padecimiento+" "+ prioridad+" ";
    }
    
    public Paciente(){
        nombre=null;
        padecimiento=null;
        prioridad=null;
    }
    /**
     * @return devuleve nombre del paciente 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @return dvuleve el padecimeinto del paciente 
     */
    public String getPadecimiento() {
        return padecimiento;
    }
    /**
     * 
     * @return devuelve la prioridad del padecimiento del paciente 
     */
    public String getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Paciente o) {
        return prioridad.compareTo(o.getPrioridad());
    }
    
}
