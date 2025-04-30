/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.model;

/**
 *
 * @author Andre
 */
public class GrupoGHI extends Funcionario {
    public GrupoGHI(String nome, double salarioBruto, int anoAdmissao) {
        super(nome, salarioBruto, anoAdmissao);
    }

    @Override
    public double calcularPL() {
        return temTempoSuficiente() ? salarioBruto * 2 : 0.0;
    }
}

    

