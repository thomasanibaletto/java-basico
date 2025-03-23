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
public class TabuadaScanner {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num, resultado;
        System.out.println("Informe o número que você deseja calcular a tabuada: ");
        num = scan.nextInt();
        
        System.out.println("Tabuada do "+num+"\n");

        for (int i=0;i<=10; i++){
            
            resultado = num * i;
            
            System.out.println(num+" "+"X "+i+" ="+resultado);
        
    }
    }
}
