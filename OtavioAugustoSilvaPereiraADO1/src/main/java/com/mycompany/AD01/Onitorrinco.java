package com.mycompany.AD01;

/**
 *
 * @author otavio.aspereira
 */
public class Onitorrinco {

    //Atributos
    private String nome;
    private String cor;
    private int idade;
    private double tamanho;

    public Onitorrinco(String nome, String cor, int idade, double tamanho) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        this.tamanho = tamanho;
    }

// Get vai pegar o valor da variavel private.
// O set vai mudar/definir o valor dos dados.
    
    //contrutores Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }  

    //Funções 1
    public void nadar() {
        System.out.printf("\n %s esta nadando. \n", nome);
    }

    public void nadar2(String nome1, String nome2) {
        System.out.printf("\n %s está nadando junto com o %s. \n", nome1, nome2);
    }
    
    public int anuidade() {
        return idade += 1;
    }
    
   

}

//Fim do Código!
