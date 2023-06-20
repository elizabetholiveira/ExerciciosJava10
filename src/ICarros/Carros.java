package ICarros;

import java.util.List;

public abstract class Carros {

    private String marca;

    private short ano;
    private double valor;
    private String cor;
    private byte portas;
    private double velocidade;

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public Carros(String marca, short ano, double valor, String cor, byte portas, double velocidade) {
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
        System.out.println("Freando... minha velocidade está em " + getVelocidade());
    };

    public void acelerar(){
        System.out.println("Acelerando... minha velocidade está em " + getVelocidade());
    };
}
