/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.model;
import br.edu.etec.meuprojeto.model.Funcionario;
/**
 *
 * @author Admin
 */
public class DEF extends Funcionario {

    public DEF(String nome, double salario, int AnoAdmissao) {
        super(nome, salario, AnoAdmissao);
    }

    /**
     *
     * @return
     */
    @Override
    public double CalcularPL(){
        return salario * 3 * (anosDeCasa()/5.0);
    }
  }
   

    

