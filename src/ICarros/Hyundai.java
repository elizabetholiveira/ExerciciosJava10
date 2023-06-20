package ICarros;

public class Hyundai extends Carros{

    public Hyundai(String marca, short ano, double valor, String cor, byte portas, double velocidade) {
        super(marca, ano, valor, cor, portas, velocidade);
        marca = "Hyundai";
    }

    @Override
    public void partidaMotor() {
        setVelocidade(5);
        super.partidaMotor();
    }

    @Override
    public void frear() {
        super.frear();
        setVelocidade(getVelocidade() - 2);
    }

    @Override
    public void acelerar() {
        super.acelerar();
        setVelocidade(getVelocidade() + 15);
    }
}
