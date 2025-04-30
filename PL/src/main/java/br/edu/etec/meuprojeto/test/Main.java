/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.test;

import br.edu.etec.meuprojeto.model.Funcionario;
import br.edu.etec.meuprojeto.model.GrupoABC;
import br.edu.etec.meuprojeto.model.GrupoDEF;
import br.edu.etec.meuprojeto.model.GrupoGHI;

/**
 *
 * @author Andre
 */
public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new GrupoABC("andrey", 3000, 2015);
        Funcionario f2 = new GrupoDEF("YAS", 4000, 2022);
        Funcionario f3 = new GrupoGHI("guilherme", 2500, 2010);

        f1.exibirInfo();
        System.out.println("-----------");
        f2.exibirInfo();
        System.out.println("-----------");
        f3.exibirInfo();
    }
}

