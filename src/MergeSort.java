/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Julianny Meireles
 */
public class MergeSort {
    
    static void merge(int[] A, int indiceEsq, int indiceMeio, int indiceDir) {
                
        int n1 = indiceMeio - indiceEsq + 1;
        int n2 = indiceDir - indiceMeio;

        //Cria os arrays auxiliares com tamanho n+1 para entrar o valor máximo no final
        int[] L = new int[n1+1];
        int[] R = new int[n2+1];

        //coloca os valores de A em L e R
        for (int i = 0; i < n1; i++) {
                L[i] = A[indiceEsq + i];
        }
        for (int j = 0; j < n2; j++) {
                R[j] = A[indiceMeio + 1 + j];
        }


        //Coloca um valor máximo no último elemento dos arrays para detectar que o mesmo chegou ao seu fim;
        //Sem esses valores, precisaria de um código explícito para detectar e manipular o final das listas
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        
        for (int k = indiceEsq; k <= indiceDir; k++) {
                if (L[i] <= R[j]) {
                        A[k] = L[i];
                        i = i+1;
                } else {
                        A[k] = R[j];
                        j = j+1;
                }
        }
}

    
    static void mergeSort(int[] A, int indiceEsq, int indiceDir) {
        
        if (indiceEsq < indiceDir) {
			
            // não precisa do floor que tem no algoritmo pois o tipo int já arredonda (tira a casa decimal)
            int indiceMeio = (indiceEsq + indiceDir) / 2;             
            
            mergeSort(A, indiceEsq, indiceMeio);            
            mergeSort(A, indiceMeio+1, indiceDir);
           
            merge(A, indiceEsq, indiceMeio, indiceDir);
        }
    }
    
    
    //Lê o arquivo e armazenar os valores
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
        
        //Coloca os elementos da Lista no array A
        int A[] = new int [lista.size()];
           for(int i = 0; i<lista.size();i++){
               A[i]=lista.get(i);
           } 
        
        int indiceEsq = 0;
        int indiceDir = A.length-1;

        mergeSort(A, indiceEsq, indiceDir);
        
        //printa
        System.out.print("Sorted: " + Arrays.toString(A));
		
	}
    
}
