
package hoja3datos;

import java.util.*;
import java.io.*;

/**
 *
 * @author Andres
 */
public class Hoja3Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String []args){
        Sorts s = new Sorts();
        BufferedReader bf = null;
        
        //aqui va el archivo de texto
        String direccion = "C:\\Users\\Andres\\Documents\\NetBeansProjects\\Hoja3\\numeros.txt";
        String texto = "";
        int i = 0;        
        
        
        //lee el archivo de texto
        try{
            bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) !=null){
                temp = temp + bfRead;
            }
            
            texto = temp;
            
        }catch(Exception e){
            //Error por si no ecuentra el archivo
            System.out.println("No se encntro archivo");
            
        }
        
        //Separa el
        String parts[] = texto.split(" ");
        
        //convertir el array de String a integer
        int var[] = new int[parts.length];
        for(int j = 0; j < parts.length; j++){
            
            var[i] = Integer.parseInt(parts[i]); 
            
        }
        //System.out.println(parts[1]);
        
        //Gnome
        long startTime = System.currentTimeMillis();
        //s.Gnome(var, parts);
        long time_end = System.currentTimeMillis();
        System.out.println("Gome Sort = " + (time_end - startTime));
        
        
        //merge
        long startTim = System.currentTimeMillis();
        s.Merge(var);
        long time_en = System.currentTimeMillis();
        System.out.println("Merge Sort = " + (time_en - startTim));
        
        
        //Quick
        long startTi = System.currentTimeMillis();
        s.ordenar(var);
        long time_e = System.currentTimeMillis();
        System.out.println("Quick Sort = " + (time_e - startTi));
        
        
        //Radix
        long startT = System.currentTimeMillis();
        s.Radix(var);
        long time = System.currentTimeMillis();
        System.out.println("Radix Sort = " + (time - startT));
        
        
    }
    
    
    
    
    
}
