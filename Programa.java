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
public class Programa {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.num= 802;
        minhaConta.dono= "Thomas Anibaletto";
        minhaConta.saldo=2000.06;
        minhaConta.limite=5000.0;
        System.out.println("A conta numero "+ minhaConta.num+ "de "+minhaConta.dono+"tem saldo de"+minhaConta.saldo+"e o limite de crédito disponivel é "+minhaConta.limite);
        
        minhaConta.sacar(550.5);
        System.out.println("Meu novo saldo é de R$ "+minhaConta.saldo);
    }
}
