package services;

import entities.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
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

    public List<Funcionario> aniversarianteDoMes(int... mes){
        Set<Integer> mesesSet = Arrays.stream(mes).boxed().collect(Collectors.toSet());

        List<Funcionario> aniversariantes = funcionarios.stream().
                filter(funcionario -> mesesSet.contains(funcionario.getDataDeNascimento().getMonthValue())).
                collect(Collectors.toList());

        return aniversariantes;

    }


    public String listarFuncionarioMaisVelho(){
        Funcionario funcionarioMaisVelho = funcionarios.stream().
                min(Comparator.comparing(Funcionario::getDataDeNascimento)).
                orElseThrow(NoSuchElementException::new);

        int idade = calcularIdade(funcionarioMaisVelho.getDataDeNascimento());

        return "Nome: " + funcionarioMaisVelho.getNome() + ", Idade: " + idade;

    }

    private int calcularIdade(LocalDate dataDeNascimento){
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataDeNascimento, dataAtual).getYears();
    }





}
