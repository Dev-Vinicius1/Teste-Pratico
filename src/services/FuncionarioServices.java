package services;

import entities.Funcionario;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FuncionarioServices {

    private List<Funcionario> funcionarios;

    public FuncionarioServices(){
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarNovoFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(String nome){
        funcionarios.removeIf(funcionario -> funcionario.getNome().equals(nome));
    }

//    private String formatarDadosFuncionarios(Funcionario funcionario){
//        return funcionario.toString().replace(".", ",");
//    }

    public void imprimirTodosFuncionarios(){
        for(int i=0; i < funcionarios.size(); i++){
            Funcionario funcionario = funcionarios.get(i);
            System.out.println((funcionario));
        }
    }


    public void aumentoDeSalario(BigDecimal percentual){
        for(int i=0; i < funcionarios.size(); i++){
            Funcionario funcionario =  funcionarios.get(i);
            BigDecimal aumentoSalario = funcionario.getSalario().multiply(percentual);
            BigDecimal novoSalario = funcionario.getSalario().add(aumentoSalario);
            funcionario.setSalario(novoSalario);
        }
    }

    // agrupa os funcionários pela sua função
    public Map<String, List<Funcionario>> agrupaFuncionarioPorFuncao(){
        Map<String, List<Funcionario>> funcionariosPorFuncao = new HashMap<>();

        for(Funcionario funcionario : funcionarios){
            String funcao = funcionario.getFuncao();
            if(!funcionariosPorFuncao.containsKey(funcao)){
                funcionariosPorFuncao.put(funcao, new ArrayList<>());
            }

            funcionariosPorFuncao.get(funcao).add(funcionario);
        }
        return funcionariosPorFuncao;
    }




}
