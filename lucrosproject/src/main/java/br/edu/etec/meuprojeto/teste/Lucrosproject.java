/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.meuprojeto.teste;

import br.edu.etec.meuprojeto.model.ABC;
import br.edu.etec.meuprojeto.model.ABC;

import br.edu.etec.meuprojeto.model.DEF;
import br.edu.etec.meuprojeto.model.DEF;

import br.edu.etec.meuprojeto.model.Funcionario;
import br.edu.etec.meuprojeto.model.Funcionario;


import br.edu.etec.meuprojeto.model.GHI;
import br.edu.etec.meuprojeto.model.GHI;


/**
 *
 * @author Admin
 */
public class Lucrosproject {

    public static void main(String[] args) {
        Funcionario f1 = new ABC("Andrey",3000,2015);
        Funcionario f2 = new DEF("Yas",4000,2024);
        Funcionario f3 = new GHI("Gustavo",3500,2018);
        
        System.out.println(f1.nome + "- PL:R$" + f1.CalcularPL());
        System.out.println(f2.nome + "- PL:R$" + f2.CalcularPL());
        System.out.println(f3.nome + "- PL:R$" + f3.CalcularPL());
    }
}
