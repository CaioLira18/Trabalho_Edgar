package Exercicio;

import java.util.Scanner;

public class Main {

    static Funcionario funcionario = new Funcionario(null, 0); // Instanciando a Classe Funcionario
    static Horista horista = new Horista(null, 0, 0, 0, 0); // Instanciando a Classe Horista
    static Mensalista mensalista = new Mensalista(null, 0, 0);  // Instanciando a Classe Mensalista
    static Scanner scanner = new Scanner(System.in); // Implementando o Scanner

    public static void main(String[] args) {

        System.out.println("Voce recebe a hora ? (True/Falset)"); // 
        boolean profissao = scanner.nextBoolean(); // Scanner Bollean pra saber se o usuario e um Mensalista ou Horista
        System.out.println(); // Pula uma Linha

        if (profissao) {
            horista.realizarTarefa();  // Chama a Tarefa Horista
            funcionario.introducao();  // Chama o Metodo Introducao
            horista.calcularSalario(); // Calcula o Salario do Horista
            System.out.println(); // Pula Linha
            System.out.println("CONTA CRIADA COM SUCESSO"); // Retorna as Informações do Funcionario
            System.out.println(); // Pula uma Linha
            System.out.println(
                    "Nome: " + funcionario.getNome() + "\n" + // Retorna o Nome
                    "Idade: " + funcionario.getIdade() + "\n" + // Retorna a Idade
                    "Salario: " + horista.getSalarioTotal()); // Retorna o Salario Total   

        } else {
            mensalista.realizarTarefa(); // Chama a Tarefa Mensalista
            funcionario.introducao(); // Chama o Metodo Introdução
            mensalista.calcularSalario(); // Calcula o Salario do Mensalista
            System.out.println(); // Pula uma Linha
            System.out.println("CONTA CRIADA COM SUCESSO"); // Retorna as Informações do Funcionario
            System.out.println(
                    "Nome: " + funcionario.getNome() + "\n" + // Retorna o Nome
                    "Idade: " + funcionario.getIdade() + "\n" + // Retorna a Idade
                    "Salario: " + mensalista.getSalarioMensal()); // Retorna o Salario Mensal
        } 

    }

}
