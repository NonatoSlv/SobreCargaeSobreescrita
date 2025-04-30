/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.model;

/**
 *
 * @author Andre
 */
public class ProfessorMestrado extends ProfessorGraduacao {

    public ProfessorMestrado(String nome) {
        super(nome);
    }

    public double salario(double adicionalPorDisciplina, int numDisciplinas, int numArtigos) {
        double adicionalDisciplinas = adicionalPorDisciplina * numDisciplinas;
        double adicionalArtigos = 150.0 * numArtigos;
        double bruto = SALARIO_BASE + adicionalDisciplinas + adicionalArtigos;
        double liquido = bruto - (bruto * DESCONTO);
        return liquido;
    }

    public void exibirInfo(int numDisciplinas, int numArtigos) {
        double salarioLiquido = salario(50.0, numDisciplinas, numArtigos);
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: Professor de Mestrado");
        System.out.println("Disciplinas: " + numDisciplinas);
        System.out.println("Artigos: " + numArtigos);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
    }
}

