/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ledod
 */
public class Node<E> {
    private Paciente value;
    protected  Node<E> left;
    protected  Node<E> right;        
    
    public Node()
    {
        value=null;
        left=null;
        right=null;
    }
    /**
     * esta es la funcion encargada de devolver el nodo del paciente
     * @param value paciente enviado
     */
    public Node (Paciente value) {
        this.value = value;
        left = null;
        right = null;
    }
    
}
