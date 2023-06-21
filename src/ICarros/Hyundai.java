package ICarros;

public class Hyundai extends Carros{

    public Hyundai(String marca, int ano, double valor, String cor, int portas, double velocidade) {
        super(marca, ano, valor, cor, portas, velocidade);
    }

    @Override
    public void partidaMotor() {
        setVelocidade(5);
        super.partidaMotor();
    }

    @Override
    public void frear() {
        setVelocidade(getVelocidade() - 2);
        super.frear();
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 15);
        super.acelerar();
    }
}
