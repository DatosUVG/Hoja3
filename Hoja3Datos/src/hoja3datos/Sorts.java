/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja3datos;

/**
 *
 * @author Andres
 */
public class Sorts {
    public int [] Gnome(int [] var, String [] parts){
        int i;
        for(i = 0; i < parts.length; i++){
            if(var[i] <= var[i-1]){
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
        return var;
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
    
    public void ordenar(int[] var){
        var = QuickSort1(var);
    }
    public int[] QuickSort1(int[] var){
        return QuickSort2(var, 0, var.length-1);
    }
    public int[] QuickSort2(int var[], int left, int right){
        if(left >= right){
            return var;
        }
        int i = left, d = right;
        if(left != right){
            int pivote;
            int aux;
            pivote = left;
            while (left != right){
                while(var[right] >= var[pivote] && left < right){
                    right--;
                    while(var[left] < var[pivote] && left < right){
                        left++;
                    }
                }
            
                if(right != left){
                    aux = var[right];
                    var[right] = var[left];
                    var[left] = aux;
                }
            
                if(left == right){
                    QuickSort2(var, i, left-1);
                    QuickSort2(var, left+1, d);
                }            
            }
        }
        else{
             return var;
        }
        return var;
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
