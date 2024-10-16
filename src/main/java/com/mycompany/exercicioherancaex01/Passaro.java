package com.mycompany.exercicioherancaex01;

public class Passaro extends Animal {

    public String TamanhoDaAsas;

    public Passaro(String nome, int idade, String TamanoDaAsas) {

        super(nome, idade);
        this.TamanhoDaAsas = TamanhoDaAsas;

    }

    public Passaro() {
        this.TamanhoDaAsas = "ERRO";
    }

    public void voar() {

    }

    @Override
    public void fazerSom() {
        System.out.println("Piu-piu");

    }
}
