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
        
	if(array.length > 1)
	{	
		int elementsInA1 = array.length / 2;
		
		int elementsInA2 = array.length - elementsInA1;
                
		int arr1[] = new int[elementsInA1];
		int arr2[] = new int[elementsInA2];
		
		for(int k = 0; k < elementsInA1; k++)
			arr1[i] = array[i];
		for(int k = elementsInA1; k < elementsInA1 + elementsInA2; k++)
			arr2[i - elementsInA1] = array[i];
		arr1 = mergeSort(arr1);
		arr2 = mergeSort(arr2);
		int i = 0, j = 0, k = 0;
		while(arr1.length != j && arr2.length != k)
		{
			if(arr1[j] < arr2[k])
			{
				array[i] = arr1[j];
				i++;
				j++;
			}
			else
			{
				array[i] = arr2[k];
				i++;
				k++;
			}
		}
		while(arr1.length != j)
		{
			array[i] = arr1[j];
			i++;
			j++;
		}
		while(arr2.length != k)
		{
			array[i] = arr2[k];
			i++;
			k++;
		}
	}
        long time_end = System.currentTimeMillis();
        System.out.println(time_end - startTime);
        
        
    }
    
}
