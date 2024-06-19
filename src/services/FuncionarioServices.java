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

    private String formatarDadosFuncionarios(Funcionario funcionario){
        return funcionario.toString().replace(".", ",");
    }

    public void imprimirTodosFuncionarios(){
        for(int i=0; i < funcionarios.size(); i++){
            Funcionario funcionario = funcionarios.get(i);
            System.out.println(formatarDadosFuncionarios(funcionario));
        }
    }
}
