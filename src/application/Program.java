package application;

import entities.Funcionario;
import services.FuncionarioServices;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        FuncionarioServices funcionarioServices = new FuncionarioServices();

        funcionarioServices.adicionarNovoFuncionario(new Funcionario("Maria", LocalDate.of(2000,10,18), new BigDecimal(2009.44), "Operador"));
        funcionarioServices.adicionarNovoFuncionario(new Funcionario("João", LocalDate.of(1980,5,1), new BigDecimal(5009.44), "Gerente"));
        funcionarioServices.adicionarNovoFuncionario(new Funcionario("Maria", LocalDate.of(2000,4,18), new BigDecimal(2009.44), "Operador"));

        funcionarioServices.imprimirTodosFuncionarios();

//        funcionarioServices.aumentoDeSalario(new BigDecimal("0.1"));
//
//        funcionarioServices.imprimirTodosFuncionarios();

        Map<String, List<Funcionario>> funcionariosPorFuncao = funcionarioServices.agrupaFuncionarioPorFuncao();

//        System.out.println("Funcionários agrupados por função:");
//        for(String funcao : funcionariosPorFuncao.keySet()){
//            System.out.println("Função: " + funcao);
//            List<Funcionario> funcionarioDaFuncao = funcionariosPorFuncao.get(funcao);
//            for(Funcionario f: funcionarioDaFuncao){
//                System.out.println(" " + f);
//            }
//        }
//
//        List<Funcionario> aniversariantes = funcionarioServices.aniversarianteDoMes(4,5);
//        System.out.println(aniversariantes);


        System.out.println(funcionarioServices.listarFuncionarioMaisVelho());



    }
}
