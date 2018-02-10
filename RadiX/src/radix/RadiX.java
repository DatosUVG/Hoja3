/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radix;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Andres
 */
public class RadiX {

    public void main(String []args){
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
        
        Radix(var);
        
        long time_end = System.currentTimeMillis();
        System.out.println(time_end - startTime);
        
        
    }
    
    public int[] Radix(int[] array){
        
        int i;
        int j;
        int k;
        
        int arr[] = new int[array.length];
        for (k = Integer.SIZE-1; k >= 0; k--){
            int aux[] = new int[array.length];        
            j=0;
            
            for (i=0;i<array.length;i++){
                boolean mover = array[i] << k >=0;
                
                if(k ==0 ? !mover:mover){
                    aux[j] = array[i]; 
                    j++;
                }else{
                    array[i-j] = array[i];   
                }
            }
            
            for (i=j; i < aux.length; i++){
                aux[i] = array[i-j];
            }
            array = aux;
            arr=array;
        }
        return arr;
    }
    
}
