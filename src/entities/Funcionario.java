package entities;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Funcionario extends Pessoa{
    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, LocalDate dataDeNascimento, BigDecimal salario, String funcao) {
        super(nome, dataDeNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }


    public String toString(){
        // cria uma nova instancia no formato "dd/MM/yyyy" para datas de nascimento.
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // cria uma nova instancia no formato no formato "#.###,##" padrão Americano.
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

        return "Nome: " + getNome() +
                ", Data de Nascimento: " + getDataDeNascimento().format(dateTimeFormatter) +
                ", Salário: R$ " + decimalFormat.format(getSalario()) +
                ", Função: " + getFuncao();
    }
}
