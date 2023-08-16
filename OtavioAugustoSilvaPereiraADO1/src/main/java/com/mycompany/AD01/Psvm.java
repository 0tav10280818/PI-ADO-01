/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.AD01;

/**
 *
 * @author otavio.aspereira
 * Otávio A. silva Pereira Turma B Noturno ADS(Análise e Desenvolvimento de Sistemas)
 */
public class Psvm {

    public static void main(String[] args) {
        Onitorrinco oni1 = new Onitorrinco("joao", "vermelho", 16, 1.5);

        Onitorrinco oni2 = new Onitorrinco("Junin do Corre", "Madeira Ébano", 33, 1.20);

    //Função 1
       
        //Função para colocar dois nomes no código
            String nome1 = oni1.getNome();
            String nome2 = oni2.getNome();
            int idade = oni1.anuidade();

    // Funções 
        //Função Nadar  
            oni1.nadar();

        //Puxei a função 
             oni2.nadar2(nome1, nome2);

    
        //Print função para fazer tempo passado
        System.out.printf("\n %d anos se passaram da ultima vez que %s e %s nadaram pela ultima vez. \n", idade, nome1, nome2);
        
        System.out.printf("\n Após %d, %s e %s se encontraram e começaram a caçar para comer.\n ",idade,nome1,nome2);
        
        System.out.printf("\n %s e %s conseguiram a caça e agora estão comendo sua caça. \n", nome1, nome2);
        
        System.out.println("\n Fim da história!!!!");
        
        System.out.println("\n ;)");
    }
}
