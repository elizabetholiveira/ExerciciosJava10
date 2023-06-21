package ICarros;

import java.util.List;

public abstract class Carros {

    private String marca;
    private int ano;
    private double valor;
    private String cor;
    private int portas;
    private double velocidade;

    public Carros(String marca, int ano, double valor, String cor, int portas, double velocidade) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
        this.portas = portas;
        this.velocidade = velocidade;
    }

    public void partidaMotor(){
        System.out.println("Iniciando o motor... minha velocidade está em " + getVelocidade());
    };

    public void frear(){
        if (getVelocidade() >= 0) {
            System.out.println("Freando... minha velocidade está em " + getVelocidade());
        } if (getVelocidade() < 0) {
            System.out.println("Estou parado");
            setVelocidade(0);
        }
    };

    public void acelerar(){
        System.out.println("Acelerando... minha velocidade está em " + getVelocidade());
    };

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }

    public String getCor() {
        return cor;
    }

    public int getPortas() {
        return portas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
