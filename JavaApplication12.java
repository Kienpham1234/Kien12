/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;
import java.util.Scanner;
/**
 *
 * @author 747782
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n ;     
        int array[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("ban muon nhap bao nhieu so ? ");
        n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            System.out.println("Phan tu thu a["+i+"] la: ");
            array[i]=sc.nextInt();            
    }
        for(int i=0;i<n;i++){
            for (int j = i+1; j<n; j++) {
                    if(array[i] == array[j]){
                       array[j]=array[j+1];
                       n--;
                       i--;
                    }
            }
            System.out.println();   
        }
   }
    
 }

 


