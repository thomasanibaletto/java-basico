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
public class Exercicio1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        int salario;
        
        System.out.println("Informe seu salário:");
        salario = scan.nextInt();
        
        if (salario <= 1000) {
            System.out.println("Você não tem limite disponível.");
        }
       else if (salario >=1001 && salario<=2000 ){
            System.out.println("Você tem limite de R$500,00 disponível.");
    }
        if (salario >=2001 && salario<=3000){
            System.out.println("Você tem limite de R$1.000,00 disponível.");
        }
        else if (salario >= 3001 && salario <=5000) {
            System.out.println("Você tem limite de R$1.500,00 disponível.");
        }
        if (salario >=5001) {
            System.out.println("Você tem limite de R$2.000,00 disponível.");
        }
        
        
        
    }
    
}
