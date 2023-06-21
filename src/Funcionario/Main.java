package Funcionario;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("Joaquim");
        funcionario1.setDataAdmissao(new Date());
        funcionario1.setSalario(1500);

        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getDataAdmissao());
        System.out.println(funcionario1.getSalario());


    }
}
