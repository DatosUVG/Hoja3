import java.math.*; 
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Numeros {
    public static void main(String [] args){
        
        PrintWriter pr = null;
        
        try {
            pr = new PrintWriter("numeros.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Numeros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int cantidad = 3000;
        
        int array[] = new int[cantidad];
        
        for(int i = 0; i < cantidad; i++){
            array[i] = (int)(Math.random()*cantidad);
            for(int j = 0; j < i; j++){
                if(array[i] == array[j]){
                    i--;
                }
            }
        }
        for(int i = 0; i < cantidad; i++){
            pr.print(array[i] + " ");            
        }
        
        pr.close();
    }
}
