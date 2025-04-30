/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.test;

import br.edu.etec.meuprojeto.model.ProfessorGraduacao;
import br.edu.etec.meuprojeto.model.ProfessorMestrado;

/**
 *
 * @author Andre
 */
public class Main {
    public static void main(String[] args) {
        ProfessorGraduacao prof1 = new ProfessorGraduacao("Palloma");
        ProfessorMestrado prof2 = new ProfessorMestrado("Rebeca");

        prof1.exibirInfo(4); 
        System.out.println("------------");
        prof2.exibirInfo(3, 5);  
    }
}
