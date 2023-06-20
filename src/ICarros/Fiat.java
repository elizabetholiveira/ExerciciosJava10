package ICarros;

public class Fiat extends Carros{

    public Fiat(String marca, short ano, double valor, String cor, byte portas, double velocidade) {
        super(marca, ano, valor, cor, portas, velocidade);
        marca = "Fiat";
    }

    @Override
    public void partidaMotor() {
        setVelocidade(3);
        super.partidaMotor();
    }

    @Override
    public void frear() {
        super.frear();
        setVelocidade(getVelocidade() - 6);
    }

    @Override
    public void acelerar() {
        super.acelerar();
        setVelocidade(getVelocidade() + 12);
    }
}
