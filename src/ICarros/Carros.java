package ICarros;

import java.util.List;

public abstract class Carros {

    private String[] marca;
    private short ano;
    private double valor;
    private String cor;
    private byte portas;
    private double Velocidade;

    public void partidaMotor(){};

    public void freiar(){};

    public void acelerar(){};
}
