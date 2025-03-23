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
public class CadAluno {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        int numMatricula;
        String nomeAluno;
        double vlrMensalidade;
        
        System.out.println("Informe seu nome:\n");
        nomeAluno = scan.next();
        
        System.out.println("Informe o numero de matrícula:\n");
        numMatricula = scan.nextInt();
        
        System.out.println("Informe o valor de mensalidade:\n");
        vlrMensalidade = scan.nextDouble();
        
        System.out.println("Nome: "+nomeAluno+"\n");
        System.out.println("Matricula: "+numMatricula+"\n");
        System.out.println("Valor de Mensalidade: "+vlrMensalidade+"\n");
    }
}
