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

/**
 *
 * @author JUMPSTONIK
 */
public class HDT8 {
    ArrayList listaLineas = new ArrayList<>();
    String linea = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    file = new File("pacientes.txt");
    try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            //aqui esta extrayendos linea por linea del txt
            while((linea = br.readLine()) != null){
                String[] diccionario = linea.split(">");
                listaLineas.add(diccionario[0]);
                listaLineas.add(diccionario[1]);
            fr.close();
        }
        }//esto en caso halla algun error con el archivo
        catch(Exception e) {
            System.out.println("Excepcion leyendo fichero : " + e);
        }
    
}
