
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class ExemploScanner {
   
   
    private long codigo;
    private String nome;
    private String sobrenome;
    private byte idade;
    
    public static void main(String[] args) {
        ExemploScanner.lendoUm();
    }
    private static void lendoUm() {
        Scanner scan = new Scanner(System.in);
        ExemploScanner exScan = new ExemploScanner();
        
        System.out.print("Digite seu codigo: ");
        exScan.codigo = scan.nextLong();
        
        System.out.print("Digite seu nome: ");
        exScan.nome = scan.next();
        
        System.out.print("Digite seu sobrenome: ");
        exScan.sobrenome = scan.next();
        
        System.out.print("Digite sua idade: ");
        exScan.idade = scan.nextByte();
        
        System.out.println(exScan.toString());
    }
    
    @Override
    public String toString(){
        return "Pessoa[codigo=" + codigo + ", nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade + "]";
    }
    

    
    }

