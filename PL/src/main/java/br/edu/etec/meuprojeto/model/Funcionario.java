/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.model;
import java.time.LocalDate;
/**
 *
 * @author Andre
 */
public class Funcionario {
    
    protected String nome;
    protected double salarioBruto;
    protected int anoAdmissao;

    public Funcionario(String nome, double salarioBruto, int anoAdmissao) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.anoAdmissao = anoAdmissao;
    }

    public boolean temTempoSuficiente() {
        int anoAtual = LocalDate.now().getYear();
        return (anoAtual - anoAdmissao) >= 5;
    }

    public double calcularPL() {
        return 0.0; 
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Ano de Admissão: " + anoAdmissao);
        System.out.println("PL: " + calcularPL());
    }
}

    

