package Exercicio;

import java.util.Scanner;

// Variaveis
public class Horista extends Funcionario {
    private double salarioHora, horasTrabalhadas, salarioTotal;
 

    Scanner scanner = new Scanner(System.in);

    
// Método para calcular o salário total para Horista
public double calcularSalario() {
        
    System.out.println("Digite o Valor da Hora");
    salarioHora = scanner.nextDouble();

    System.out.println("Digite a quantidade de horas Trabalhadas");
    horasTrabalhadas = scanner.nextDouble();

    salarioTotal = salarioHora * horasTrabalhadas;
    return salarioTotal;
    }

    // Sobrescreve o método realizarTarefa
    @Override
    public void realizarTarefa() {
        System.out.println("Realizando uma tarefa como Horista.");
    }

    // Construtor
    public Horista(String nome, int idade, double salarioHora, double horasTrabalhadas, double salarioTotal) {
        super(nome, idade);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioTotal = salarioTotal;
    }

    // Métodos de encapsulamento (Get e Set)
    
    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

}
