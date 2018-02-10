/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merge;

import java.io.*;

/**
 *
 * @author Andres
 */
public class Merge {

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
        int array[] = new int[parts.length];
        for(int j = 0; j < parts.length; j++){
            
            array[i] = Integer.parseInt(parts[i]); 
            
        }
        //System.out.println(parts[1]);
        
        //sort va aca
        long startTime = System.currentTimeMillis();
        // ----> aca
        
        
	
        long time_end = System.currentTimeMillis();
        System.out.println(time_end - startTime);
        
        
    }
    
    public int[] Merge( int [] var){
            int i, j, k;
            if(var.length > 1){
                int le = var.length / 2;
                int ri = var.length - le;
                int arrLeft[] = new int[le];
                int arrRight[] = new int[ri];
                
                //copiando los elementos a la izquierda
                for(i = 0; i < le; i++){
                    arrLeft[i] = var[i];
                }
                //copiando los elementos a la derecha
                for (i = le; i < le + ri; i++){
                    arrRight[i - le] = var[i];
                }
                
                arrLeft = Merge(arrLeft);
                arrRight = Merge(arrRight);
                i = 0;
                j = 0;
                k = 0;
                while(arrLeft.length != j && arrRight.length != k){
                    if(arrLeft[i] < arrRight[j]){
                        var[i] = arrLeft[k];
                        i++;
                        j++;
                    }
                    else{
                        var[i] = arrRight[k];
                        i++;
                        k++;
                    }
                }
                while(arrLeft.length != j){
                    var[i] = arrLeft[j];
                    i++;
                    j++;
                }
                while(arrRight.length != k){
                    var[i] = arrRight[k];
                    i++;
                    k++;
                }
            }
            return var;
        }
    
}
