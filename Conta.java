/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Conta {
   
        int num;
        String dono;
        double limite;
        double saldo;
        
        public void sacar (double qtd){
            double novoSaldo = saldo - qtd;
            saldo = novoSaldo;
        }
    }
    

