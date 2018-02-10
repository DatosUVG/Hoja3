
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
            
            var[j] = Integer.parseInt(parts[j]); 
            //System.out.println(var[j]);
        }
        
        
        //declaracion de los arrays porque no me funciono con un solo array
        
        int [] gnom = var;
        int [] merg = var;
        int [] quicc = var;
        int [] radix = var;
        int [] cocc = var;
        
        //otro debuggeo
       /* for(int x = 0; x < var.length; x++){
            System.out.println(cocc[x] + " ");
        }*/
        
        //Gnome
        long startTime = System.currentTimeMillis();
        gnom = s.Gnome(gnom);
        long time_end = System.currentTimeMillis();
        System.out.println("Gnome Sort = " + (time_end - startTime));
        //Debuggeando el sort
        /*for(int x = 0; x < var.length; x++){
            System.out.println(gnom[x] + " ");
        }*/
        
        
        //Merge
        
        //Este da problemas, ya que tira un error de infinite recusrion
        
        long startTim = System.currentTimeMillis();
        //merg = s.mergeSort(merg);
        long time_en = System.currentTimeMillis();
        System.out.println("Merge Sort = " + (time_en - startTim));
        //Debuggeando el sort
        /*for(int x = 0; x < var.length; x++){
            System.out.println(merg[x] + " ");
        }*/
        
        
        //Quick
        long startTi = System.currentTimeMillis();
        quicc = s.ordenar(quicc);
        long time_e = System.currentTimeMillis();
        System.out.println("Quick Sort = " + (time_e - startTi));
        //Debuggeando el sort
        /*for(int x = 0; x < var.length; x++){
            System.out.println(var[x] + " ");
        }*/
        
        
        //Radix
        long startT = System.currentTimeMillis();
        radix = s.Radix(radix);
        long time = System.currentTimeMillis();
        System.out.println("Radix Sort = " + (time - startT));
        //Debuggeando el sort
        /*for(int x = 0; x < var.length; x++){
            System.out.println(radix[x] + " ");
        }*/
        
        
        //Cocktail
        long start = System.currentTimeMillis();
        cocc = s.Cocktail(cocc);
        long tim = System.currentTimeMillis();
        System.out.println("Cocktail Sort = " + (tim - start));
        //Debuggeando el sort
        /*for(int x = 0; x < var.length; x++){
            System.out.println(cocc[x] + " ");
        }*/
    }
    
    
    
    
    
}
