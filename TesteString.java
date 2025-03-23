/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class TesteString {
    public static void main(String[] args) {
        String string = "Testando";
        String string2 = string;
        string = string.concat (" as Strings");
        System.out.println (string);
        System.out.println (string2);
        String string3;
        string3 = string + " " + string2;
        System.out.println("O valor da string 3 é " +string3);
    }
}
