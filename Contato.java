/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author DELL

Criar um programa de agenda para digitar nome, endereço, cidade, telefone, e-mail utilizando arrays.
O programa deve permitir o cadastramento de pelo menos 10 nomes, e deve ter um menu com a opção de 
cadastramento e listagem dos dados cadastrados.



*/
public class Contato {
  
    public static void main(String[] args) {
        
        
        
        int opcao, qtdContatos= 0;
        
        String contatos [][] = new String[10][5]; //  crio o array e defino 5 colunas, para 10 linhas disponiveis.
        
           Scanner scan = new Scanner(System.in);
        do {
        System.out.println("***Agenda***\n");
        
        System.out.println("1 - Cadastrar Contato");
        
        System.out.println("2 - Listar Agenda");
        
        System.out.println("3 - Sair\n");
        
        System.out.println("Opção: ");
        opcao = scan.nextInt();
        
        switch (opcao){
           
            
  
            case 1:
                
                if (qtdContatos <10) {
                    
                    System.out.println("***Cadastro de Contatos***\n");
                    
                    System.out.println("Nome: ");
                    contatos[qtdContatos][0] = scan.next();
                    
                    System.out.println("Endereço: ");
                    contatos[qtdContatos][1] = scan.next();
                    
                    System.out.println("Cidade: ");
                    contatos[qtdContatos][2] = scan.next();
                    
                    System.out.println("Telefone: ");
                    contatos[qtdContatos][3] = scan.next();
                    
                    System.out.println("E-mail: ");
                    contatos[qtdContatos][4] = scan.next();
                    
                    qtdContatos++;
                    
                    System.out.println("Contato cadastrado com sucesso!");
                    
                    
                    
                }
                                      
                break;
            case 2:
                if (qtdContatos==0){
                System.out.println("Nenhum contato cadastrado na sua agenda.\n");
                
                } else {
                
                System.out.println("***Lista de Contatos***");
                    
                for (int i=0; i<qtdContatos; i++){
                    
                    System.out.println("\nContato "+(i+1)+":");
                    System.out.println("Nome: "+contatos[i][0]);
                    System.out.println("Endereço: "+contatos[i][1]);
                    System.out.println("Cidade: "+contatos[i][2]);
                    System.out.println("Telefone: "+contatos[i][3]);
                    System.out.println("E-mail: "+contatos[i][4]);
                }               
                }
                
                break;
                    
                                   
                
        }
        
        }while (opcao!=3);
    }
    
}


                
    
                 
                 
            
        
    
        
  
    

