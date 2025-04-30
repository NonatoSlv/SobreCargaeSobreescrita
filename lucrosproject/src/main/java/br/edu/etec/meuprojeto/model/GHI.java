/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.model;

/**
 *
 * @author Admin
 */
public class GHI extends Funcionario {
    public GHI(String nome,double salario,int AnoAdmissao){
        super(nome,salario,AnoAdmissao);
    }
    
    /**
     *
     * @return
     */
    @Override
    public double CalcularPL(){
        return salario * 2 * (anosDeCasa()/5.0);
    }
    
}

