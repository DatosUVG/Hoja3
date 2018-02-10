/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertion;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author andyq
 */
public class Insertion {

    public static void main(String[] args) {
        BufferedReader bf = null;
        String direccion = "C:\\Users\\Andres\\Documents\\NetBeansProjects\\Hoja3\\numeros.txt";
        String texto = "";
        int i = 0;

        //lee el archivo de texto
        try {
            bf = new BufferedReader(new FileReader(direccion));
            String temporal = "";
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {
                temporal = temporal + bfRead;
            }

            texto = temporal;

        } catch (Exception e) {
            //Error por si no ecuentra el archivo
            System.out.println("No se encontro archivo");

        }

        //Separa el
        String parts[] = texto.split(" ");

        //convertir el array de String a integer
        int array[] = new int[parts.length];
        for (int j = 0; j < parts.length; j++) {

            array[i] = Integer.parseInt(parts[i]);
            array[] = insertionSort(array[i], direccion);
        }
        //System.out.println(parts[1]);

        //sort va aca
        long startTime = System.currentTimeMillis();
        // ----> aca
   
        

    

}
     public void insertionSort(int[] a, String direction){
        int input, output;
        for (output = 1; output < a.length; output++) {
            int temporal = a[output];
            input = output;
            while ((input > 0 && a[input - 1] >= temporal && direction.equalsIgnoreCase("A")) || (input > 0) && a[input - 1] <= temporal && direction.equalsIgnoreCase("D")) {
                a[input] = a[input - 1];
                --input;
            }
            a[input] = temporal;

        }
}

