package com.mycompany.exercicioherancaex01;

public class Animal {

    public String nome;
    public int idade;

    public Animal(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;

    }

    public Animal() {

        this.nome = "Digita o nome";
        this.idade = 0;

    }
    
    public void fazerSom(){
               System.out.println("Piu-piu");

    }
}
