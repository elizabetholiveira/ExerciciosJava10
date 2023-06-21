package ICarros;

public class Renault extends Carros{

    public Renault(String marca, int ano, double valor, String cor, int portas, double velocidade) {
        super(marca, ano, valor, cor, portas, velocidade);
    }

    @Override
    public void partidaMotor() {
        setVelocidade(0.0);
        super.partidaMotor();
    }

    @Override
    public void frear() {
        setVelocidade(getVelocidade() - 5);
        super.frear();
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 10);
        super.acelerar();
    }
}
