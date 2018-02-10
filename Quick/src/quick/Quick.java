/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quick;

import java.io.BufferedReader;
import java.io.FileReader;
import java. util.*;

/**
 *
 * @author Andres
 */
public class Quick {

    public static void main(String []args){
        BufferedReader bf = null;
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
        
        //sort va aca
        long startTime = System.currentTimeMillis();
        
	
        
        long time_end = System.currentTimeMillis();
        System.out.println(time_end - startTime);
        
        
    }
    public static int QuickSort(int var[], int left, int right){
        
        
        
        return 1;
    }
}
