/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobanco;

/**
 *
 * @author Ras-E
 */
public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Erick Wildson Ribeiro");
        funcionario.setDepartamento("TI");
        funcionario.setSalario(2500.0);
        funcionario.setDataEntrada("07/03/2023");
        funcionario.setRg("MG12.345.678");
        funcionario.setSituacao(Boolean.TRUE);
        
        funcionario.mostra();
        funcionario.bonifica(1500.0);
        funcionario.mostra();
        
    }
}
