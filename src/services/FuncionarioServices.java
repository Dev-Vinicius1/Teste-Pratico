package services;

import entities.Funcionario;

import java.util.List;

public class FuncionarioServices {

    private List<Funcionario> funcionarios;

    public void adicionarNovoFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(String nome){
        funcionarios.removeIf(funcionario -> funcionario.getNome().equals(nome));
    }
}
