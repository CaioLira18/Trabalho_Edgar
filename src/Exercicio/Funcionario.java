package Exercicio;

import java.util.Scanner;

public class Funcionario {
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private int idade;

    // Construtor
    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Metodo "Introdução" para obter os dados do Usuario
    public void introducao(){ 
        System.out.println("Bem Vindo");
        System.out.println();

        System.out.println("Insira seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Insira sua Idade: ");
        idade = scanner.nextInt();

    }

 // Métodos de encapsulamento (Get e Set)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método polimórfico
    public void realizarTarefa() {
        System.out.println("Realizando uma tarefa genérica.");
    }

   
}
