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
public class ExercicioSwitch {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int nota;     
        
        System.out.println("Informe sua nota: ");
        nota = scan.nextInt();
        
       if (nota <11 && nota >-1){ 
        switch (nota){
            case 10:
                System.out.println("Excelente");
                break;
                
            case 9:
                System.out.println("Ótimo");
                break;
                
            case 8:
                System.out.println("Bom");
                break;
                
            case 7:
                System.out.println("Satisfatório");
                break;
                
            default:
                System.out.println("Regular");
                break;
                
            
        }
        }
    }
}
