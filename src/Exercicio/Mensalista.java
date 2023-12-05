package Exercicio;

import java.util.Scanner;

public class Mensalista extends Funcionario {
    private double salarioMensal = 2000;
    private int idade;
    private String nome;

    Scanner scanner = new Scanner(System.in);

    // Construtor
    public Mensalista(String nome, int idade, double salarioMensal) {
        super(nome, idade);
        this.salarioMensal = salarioMensal;
    }

    // Método para calcular o salário total para Mensalista
    public double calcularSalario() {
       
        return salarioMensal = 2000; 
    }

    // Sobrescreve o método realizarTarefa
    @Override
    public void realizarTarefa() {
        System.out.println("Realizando uma tarefa como Mensalista.");
    }

     // Métodos de encapsulamento (Get e Set)
     
    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}

