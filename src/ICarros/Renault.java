package ICarros;

public class Renault extends Carros{

    public Renault(String marca, short ano, double valor, String cor, byte portas, double velocidade) {
        super(marca, ano, valor, cor, portas, velocidade);
        marca = "Renault";
    }

    @Override
    public void partidaMotor() {
        setVelocidade(0.0);
        super.partidaMotor();
    }

    @Override
    public void frear() {
        super.frear();
        setVelocidade(getVelocidade() - 5);
    }

    @Override
    public void acelerar() {
        super.acelerar();
        setVelocidade(getVelocidade() + 10);
    }
}
