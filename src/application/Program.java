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

        // inserindo todos os funcionários de acordo com a ordem da tabela.
        funcionarioServices.adicionarNovoFuncionario(new Funcionario("Maria", LocalDate.of(2000,10,18), new BigDecimal(2009.44), "Operador"));
        funcionarioServices.adicionarNovoFuncionario(new Funcionario("João", LocalDate.of(1990,5,12), new BigDecimal(2284.38), "Operador"));
        funcionarioServices.adicionarNovoFuncionario(new Funcionario("Caio", LocalDate.of(1961,5,2), new BigDecimal(9836.14), "Coordenador"));
        funcionarioServices.adicionarNovoFuncionario(new Funcionario("Miguel", LocalDate.of(1988,10,14), new BigDecimal(19119.88), "Diretor"));
        funcionarioServices.adicionarNovoFuncionario(new Funcionario("Alice", LocalDate.of(1995,1,5), new BigDecimal(2234.68), "Recepcionista"));
        funcionarioServices.adicionarNovoFuncionario(new Funcionario("Heitor", LocalDate.of(1999,11,19), new BigDecimal(1582.72), "Operador"));
        funcionarioServices.adicionarNovoFuncionario(new Funcionario("Arthur", LocalDate.of(1993,3,31), new BigDecimal(4071.84), "Contador"));
        funcionarioServices.adicionarNovoFuncionario(new Funcionario("Laura", LocalDate.of(1994,7,8), new BigDecimal(3017.45), "Gerente"));
        funcionarioServices.adicionarNovoFuncionario(new Funcionario("Heloísa", LocalDate.of(2003,5,24), new BigDecimal(1606.85), "Eletricista"));
        funcionarioServices.adicionarNovoFuncionario(new Funcionario("Helena", LocalDate.of(1996,9,2), new BigDecimal(2799.93), "Gerente"));


        // removendo o funcionário "João" da lista.
        funcionarioServices.removerFuncionario("João");


        // imprimindo todas os funcionários.
        System.out.println("Lista com todos os funcionários: \n");
        funcionarioServices.imprimirTodosFuncionarios();
        System.out.println("----------------------------------------------------------");


        // funcionários receberam 10% de aumento no salário.
        System.out.println("Lista com o aumento de 10% sobre o salário de todos os funcionários: \n");
        funcionarioServices.aumentoDeSalario(new BigDecimal("0.1"));



        // imprimindo todos os funcionários novamente, mas agora com os salários atualizados.
        funcionarioServices.imprimirTodosFuncionarios();


        // agrupando todos os funcionários por função.
        Map<String, List<Funcionario>> funcionariosPorFuncao = funcionarioServices.agrupaFuncionarioPorFuncao();

        System.out.println("----------------------------------------------------------");
        System.out.println("Funcionários agrupados por função:\n");
        for(String funcao : funcionariosPorFuncao.keySet()){
            System.out.println("----------------------------------------------------------");
            System.out.println("Função: " + funcao);
            List<Funcionario> funcionarioDaFuncao = funcionariosPorFuncao.get(funcao);
            for(Funcionario funcionario: funcionarioDaFuncao){
                System.out.println(" " + funcionario);

            }
        }

        // imprimindo os aniversariantes do mês 10 e 12.
        System.out.println("----------------------------------------------------------");
        System.out.println("Imprimindo os funcionários que fazem aniversário no mês 10 e 12:\n");
        System.out.println("Mês de Outubro:");
        String aniversariantesOutubro = funcionarioServices.aniversariantesDoMes(10);
        System.out.println(aniversariantesOutubro);
        System.out.println("----------------------------------------------------------");
        System.out.println("Mês de Dezembro:");
        String aniversariantesDezembro = funcionarioServices.aniversariantesDoMes(12);
        System.out.println(aniversariantesDezembro);
        System.out.println("----------------------------------------------------------");


        // imprimindo o funcionário com a maior idade
        System.out.println("Imprimindo o funcionário com a maior idade:\n " +
                funcionarioServices.listarFuncionarioMaisVelho());

        System.out.println("----------------------------------------------------------");

        // imprimindo a lista em ordem alfabética.
        System.out.println("Imprimindo a lista de funcionários em ordem alfabética: \n\n" +
                funcionarioServices.funcionariosPorOrdemAlfabetica());
        System.out.println("----------------------------------------------------------");


        System.out.println("Imprimindo o total dos salários dos funcionários:\n");
        funcionarioServices.calculaTodosOsSalarios();
        System.out.println("----------------------------------------------------------");


        System.out.println("Imprimindo quantos salários mínimos cada funcionário recebe:\n");
        BigDecimal salarioMinimo = new BigDecimal("1212.00");
        String salariosMinimo = funcionarioServices.calculaSalarioMinimos(salarioMinimo);
        System.out.println("Salários Mínimos: ");
        System.out.println(salariosMinimo);




    }
}
