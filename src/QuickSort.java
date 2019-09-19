
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julianny Meireles
 */
public class QuickSort {
    
    static int partition(int[] A, int inicio, int fim){
       
        // pega o pivo como o primeiro elemento
        int pivo = A[inicio];
        int i = inicio;
        int j = fim ;
        
        while(i < j){
            
            //move o índice pra direita pra pular o pivô
            i+=1;
           
           //encontra elementos maiores que o pivô na direita
           while(i <= fim &&A[i] <= pivo){
               i+=1; 
            }
           //encontra elementos maiores que o pivô na esquerda
            while(j >= inicio && A[j] > pivo){
                 j-=1;
            }
            if (i <= fim && i < j) {
                    // swap ao redor do pivô  
                    swap(A, i, j);
                }
           
        }
         
        //coloca o pivô no lugar certo 
        swap(A, inicio, j);
      
         return j;
        
    }
    
    static void swap(int A[], int i, int j){  
        int temp = A[i]; 
            A[i] = A[j]; 
            A[j] = temp; 
    }
    
    static void quickSort (int [] A, int inicio, int fim){
       
        if(inicio < fim){
           
           int q = partition(A, inicio, fim);
           quickSort(A, inicio, q-1);
           quickSort(A, q+1, fim);
           
        }
        
    }
    
     //Ler o arquivo e armazenar os valores
    static  ArrayList<Integer> lista = new ArrayList<>();
        
        static ArrayList<Integer> arquivo(String arq) throws FileNotFoundException {

            Scanner ler = null;
           ler = new Scanner(new File(arq));
           while (ler.hasNext()) {
               lista.add(ler.nextInt());
           }
           ler.close();
           return lista;
       }
    
        
    public static void main(String[] args) throws FileNotFoundException {
         arquivo("src/num.1000.1.in");
        
        int A[] = new int [lista.size()];
           for(int i = 0; i<lista.size();i++){
               A[i]=lista.get(i);
           } 
        
        quickSort(A, 0, A.length - 1);
        System.out.println("Sorted: " + Arrays.toString(A));
    }
    
    
}
