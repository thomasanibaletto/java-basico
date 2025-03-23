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
public class Emprestimo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Informe o seu salário: ");
        double salario = scan.nextDouble();

        System.out.println("Informe o valor do imóvel que deseja comprar: ");
        double vlr_imovel = scan.nextDouble();

        System.out.println("Informe  em quantos anos deseja pagar: ");
        int anos = scan.nextInt();

        int meses = anos * 12;
        double prestacao = vlr_imovel / meses;

        double limiteParcela = salario *0.30;

        if (prestacao <= limiteParcela ) {
            System.out.println("Empréstimo Aprovado!\n");
            System.out.println("Valor da prestação é" + prestacao);
        }
                    else {
                    System.out.println("Empréstimo negado!\n");
                    System.out.println("Valor de parcela: "+prestacao+"\n");
                    System.out.println("Valor máximo de parcela: "+limiteParcela+"\n");
                    }
        }
    }

    

