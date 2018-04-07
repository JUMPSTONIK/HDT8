/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JUMPSTONIK
 */
public class HDT8 {
    static ArrayList listaLineas = new ArrayList<Paciente>();
    static VectorHeap listaPacientes = new VectorHeap<Paciente>();
    static String linea = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    //file = new File("pacientes.txt");
        try {
            File fr = new File("pacientes.txt");
            Scanner inputFile = new Scanner(fr);

            //aqui esta extrayendos linea por linea del txt
            while(inputFile.hasNext()){
                String linea=inputFile.next();
                String[] diccionario = linea.split(">");
                listaLineas.add(new Paciente(diccionario[0],diccionario[1],diccionario[2]));
            }
            
            
        }//esto en caso halla algun error con el archivo
        catch(Exception e) {
            System.out.println("Excepcion leyendo fichero : " + e);
        }
        for (int i=0;i < listaLineas.size();i++){
            listaPacientes.add((Paciente)listaLineas.get(i));
        }
        
        for (int i=0;i < listaLineas.size();i++){
            Paciente e=(Paciente)listaPacientes.remove();
            System.out.println(e.toString());
        }
    }
}
