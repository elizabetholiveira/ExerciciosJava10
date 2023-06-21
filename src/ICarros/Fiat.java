package ICarros;

public class Fiat extends Carros{

    public Fiat(String marca, int ano, double valor, String cor, int portas, double velocidade) {
        super(marca, ano, valor, cor, portas, velocidade);
    }

    @Override
    public void partidaMotor() {
        setVelocidade(3);
        super.partidaMotor();
    }

    @Override
    public void frear() {
        setVelocidade(getVelocidade() - 6);
        super.frear();
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 12);
        super.acelerar();
    }
}
