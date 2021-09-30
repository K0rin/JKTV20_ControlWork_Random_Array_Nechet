/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20_controlwork_random_array_nechet;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class JKTV20_ControlWork_Random_Array_Nechet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1nechet;
        array1nechet = new int [100];
        Random random = new Random();
        int number = 0;
        double summ = 0;
        for(int i =0; i < array1nechet.length;){
            array1nechet[i] = random.nextInt(10 - 1 + 1) + 0;
            double chet = 2;
            if(array1nechet[i]%chet != 0){
                summ = summ +array1nechet[i];
                i++;
            }
        }
        System.out.print("array nechet = ");
        System.out.print("[");
        /*сортируем массив методом пузырька*/
        for(int i = array1nechet.length-1 ; i > 0 ; i--){
        for(int j = 0 ; j < i ; j++){
            if( array1nechet[j] > array1nechet[j+1] ){
                int tmp = array1nechet[j];
                array1nechet[j] = array1nechet[j+1];
                array1nechet[j+1] = tmp;
            }
        }
        
    }
        for(int i = 0; i < array1nechet.length; i++){
            System.out.print(array1nechet[i]);
            System.out.print("; ");
            if(i==9){
                System.out.println("");
            }
            if(i==19){
                System.out.println("");
            }
            if(i==29){
                System.out.println("");
            }
            if(i==39){
                System.out.println("");
            }
            if(i==49){
                System.out.println("");
            }
            if(i==59){
                System.out.println("");
            }
            if(i==69){
                System.out.println("");
            }
            if(i==79){
                System.out.println("");
            }
            if(i==89){
                System.out.println("");
            }
        }
        System.out.println("]");
        System.out.printf("сумма всех рандомных циифр в массиве array1 = %.3f%n", summ);
        double medium_summ = summ/array1nechet.length;
        System.out.printf("среднее арефмитическое рандомных циифр в массиве array1 = %.3f%n", medium_summ);
    }
    
}
