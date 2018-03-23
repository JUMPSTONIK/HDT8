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

    public Node (Paciente value) {
        this.value = value;
        left = null;
        right = null;
    }
    
}
