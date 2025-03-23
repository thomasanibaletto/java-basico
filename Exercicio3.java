/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int resultado;
       for (int  j=1; j<=10; j++){
           System.out.println("Tabuada do "+j+"\n");
        for (int i=1; i<=10; i++){
            resultado = j*i;
            
            System.out.println(j+" x "+i+ "="+ resultado);
            
        }
    }
    }
    
}
