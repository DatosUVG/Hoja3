package gnome;


import java.io.*;
import java.util.*;

public class Gnome {
    
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
        for(i = 0; i < parts.length; i++){
            if(var[i-1] <= var[i]){
                i++;
            }
            else{
                int temp = var[i];
                var[i] = var[i-1];
                var[i-1] = temp;
                --i;            
                if(i == 0){
                    i = 1;
                }
            }
        }
        long time_end = System.currentTimeMillis();
        System.out.println(time_end - startTime);
        
        
    }
    
}
