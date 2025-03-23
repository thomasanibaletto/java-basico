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
public class ExemploArray {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        
        int [] listaNum = new int[20];
        
            for (int i=0; i < 20; i++) {
                //atribuindo valores ao array
                System.out.println("Digite um numero: ");
                listaNum[i] = leitura.nextInt();
                }
            
            System.out.println("\nVocê digitou os seguintes números");
            for (int i=0; i <20; i++){
                System.out.println(listaNum[i]);
            }
    }
}
