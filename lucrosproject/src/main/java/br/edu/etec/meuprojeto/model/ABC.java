/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.model;



/**
 *
 * @author Admin
 */
public class ABC extends Funcionario {
    public ABC(String nome,double salario,int AnoAdmissao){
        super(nome,salario,AnoAdmissao);
    }
    
    @Override
     public double CalcularPL(){
        return salario * 5 * (anosDeCasa()/5.0);
    }
    
}
