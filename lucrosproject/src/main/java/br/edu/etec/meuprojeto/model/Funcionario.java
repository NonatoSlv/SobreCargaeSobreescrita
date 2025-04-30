/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.model;
import java.time.Year;
/**
 *
 * @author Admin
 */
public class Funcionario {
    String nome;
    double salario;
    int AnoAdmissao;
    
    public Funcionario(String nome,double salario,int AnoAdmissao){
    this.nome = nome;
    this.salario = salario;
    }
    
    public int anosDeCasa(){
        return Year.now().getValue()-AnoAdmissao;
    }
    public double CalcularPL (){
        return 0;
    }

  
}
