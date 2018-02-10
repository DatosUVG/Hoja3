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
    public int [] Gnome(int [] var){        
        int i;
        int temp;
        for(i = 1; i < var.length; i++){
            if(var[i - 1] <= var[i]){
                i++;
            }
            else{
                temp = var[i];
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
    public static int [] mergeSort(int[] array){
        /*if(array.length <= 1){
            return array;
        }*/
        
        int medio = array.length / 2;
        int []left = new int[medio];
        int [] right = new int[medio];
        int [] result = new int[array.length];
        int x = 0;
        
        //asignacion de las dos partes
        for(int i = 0; i < medio; i++){
            left[i] = array[i];
        }
        for(int i = medio; i < medio; i++){
            if(x < right.length){
                right[x] = array[i];
                x++;
            }
        }
        //separacion de las dos partes (otra vez)
        left = mergeSort(left);
        right = mergeSort(right);
        
        result = Merge(array, left, right);
        
        
        return result;
    }
    
    public static int[] Merge( int []array, int []left, int []right){
        int []resul = new int[array.length];
        int indexL = 0;
        int indexR = 0;
        int indexRes = 0;
        
        while(indexL < left.length || indexR < right.length){
            if(indexL < left.length && indexR < right.length){
                if(left[indexL] <= right[indexR]){
                    resul[indexRes] = left[indexL];
                    indexL++;
                    indexR++;
                }
                else{
                    resul[indexRes] = right[indexR];
                    indexR++;
                    indexRes++;
                }
            }
            else if(indexL < left.length){
                resul[indexRes] = left[indexL];
                indexL++;
                indexRes++;
            }
            
        }
        
            return resul;
        }
    
    public int [] ordenar(int[] var){
        var = QuickSort1(var);
        return var;
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
    
    
    public int [] Cocktail(int [] array){
        boolean flag = true;
        int i = 0;
        int j = array.length - 1;
        while (i < j && flag){
            flag = false;
            //se recorre el array ascendentemente
            for(int k = i; k < j; k++){
                //if para el cambio de lugar
                if(array[k] > array[k +1]){
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                    flag = true;
                }
            }
            
            j--;
            
            if(flag){
                flag = false;
                //se recorre descendentemente
                for(int k = j; k > i; k--){
                    if(array[k] < array[k - 1]){
                        int temp = array[k];
                        array[k] = array[k - 1];
                        array[k - 1] = temp;
                        flag = true;
                    }
                }
            }
        }
        return array;
    }
    
}
