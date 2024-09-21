/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabanco;

import java.util.Scanner;
/**
 *
 * @author emmil
 */
public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();
        
        System.out.println("\nDigite o número da sua conta: ");
        int numero = Integer.parseInt(scanner.nextLine());
        
        System.out.println("\nDigite sua agência: ");
        String agencia = scanner.nextLine();
        
        System.out.println("\nDigite seu saldo: ");
        double saldo = Double.parseDouble(scanner.nextLine());
        
        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", a conta é " + numero + " e seu saldo de R$" + saldo + " já esta disponível para saque.");
        
    }
}

