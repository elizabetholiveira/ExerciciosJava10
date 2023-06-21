package Funcionario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Funcionario {
    private String nome;
    private Date dataAdmissao;
    private double salario;

    //descobrir como fazer essa lista funcionar
    List<Integer> identificador = new ArrayList<Integer>();

    public Funcionario(List<Integer> identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
