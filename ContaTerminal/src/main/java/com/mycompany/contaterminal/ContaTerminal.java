/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.terminaljava;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author emmil
 */
public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o número da sua conta: ");
        int numero = scanner.nextInt();
        
        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();
        
        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();
        //TODO: conhecer e importar a classe scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela Scanner os valores digitados no terminal
        //Exibir a mensagem conta criada
        
    }
}

