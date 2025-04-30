/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.meuprojeto.model;

/**
 *
 * @author Andre
 */
public class ProfessorGraduacao {
    protected String nome;
    protected final double SALARIO_BASE = 25000.0;
    protected final double DESCONTO = 0.20;

    public ProfessorGraduacao(String nome) {
        this.nome = nome;
    }

    public double salario(double adicionalPorDisciplina, int numDisciplinas) {
        double adicional = adicionalPorDisciplina * numDisciplinas;
        double bruto = SALARIO_BASE + adicional;
        double liquido = bruto - (bruto * DESCONTO);
        return liquido;
    }

    public void exibirInfo(int numDisciplinas) {
        double salarioLiquido = salario(50.0, numDisciplinas);
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: Professor de Graduação");
        System.out.println("Disciplinas: " + numDisciplinas);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
    }
}

    

