package ICarros;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Renault carro1 = new Renault("Renault", 1999,20000.00,"Branco",4,0.0);

        System.out.println("Carro 1");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Ano: " + carro1.getAno());
        System.out.printf("Valor: R$ %,.2f%n", carro1.getValor());
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Quantidade de portas: " + carro1.getPortas());

        System.out.println();
        System.out.println("----------");
        System.out.println();

        Fiat carro2 = new Fiat("Fiat", 2000, 35000.00, "Vermelho", 2, 0.0);

        System.out.println("Carro 2");
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Ano: " + carro2.getAno());
        System.out.printf("Valor: R$ %,.2f%n", carro2.getValor());
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Quantidade de portas: " + carro2.getPortas());

        System.out.println();
        System.out.println("----------");
        System.out.println();

        Hyundai carro3 = new Hyundai("Hyundai", 2010, 75000.00, "Preto", 4, 0.0);

        System.out.println("Carro 3");
        System.out.println("Marca: " + carro3.getMarca());
        System.out.println("Ano: " + carro3.getAno());
        System.out.printf("Valor: R$ %,.2f%n", carro3.getValor());
        System.out.println("Cor: " + carro3.getCor());
        System.out.println("Quantidade de portas: " + carro3.getPortas());

        System.out.println();
        System.out.println("----------");
        System.out.println();

        Scanner resposta = new Scanner(System.in);

        System.out.println("Qual carro você deseja mexer?");
        System.out.println("1) Carro1 (Renault)");
        System.out.println("2) Carro2 (Fiat)");
        System.out.println("3) Carro3 (Hyundai)");
        int selecaoCarro = resposta.nextInt();

        int selecaoAcao = 1;
        switch (selecaoCarro){
            case 1:
                carro1.partidaMotor();
                while (selecaoAcao != 0){
                    System.out.println("O que você deseja fazer?");
                    System.out.println("0) Parar");
                    System.out.println("1) Acelerar");
                    System.out.println("2) Frear");
                    selecaoAcao = resposta.nextInt();

                    switch (selecaoAcao){
                        case 0:
                            System.out.println("Parando o carro...");
                            carro1.setVelocidade(-1);
                            break;
                        case 1:
                            carro1.acelerar();
                            break;
                        case 2:
                            carro1.frear();
                            break;
                    }
                }
                break;
            case 2:
                carro2.partidaMotor();
                while (selecaoAcao != 0){
                    System.out.println("O que você deseja fazer?");
                    System.out.println("0) Parar");
                    System.out.println("1) Acelerar");
                    System.out.println("2) Frear");
                    selecaoAcao = resposta.nextInt();

                    switch (selecaoAcao){
                        case 0:
                            System.out.println("Parando o carro...");
                            carro2.setVelocidade(-1);
                            break;
                        case 1:
                            carro2.acelerar();
                            break;
                        case 2:
                            carro2.frear();
                            break;
                    }
                }
                break;
            case 3:
                carro3.partidaMotor();
                while (selecaoAcao != 0) {
                    System.out.println("O que você deseja fazer?");
                    System.out.println("0) Parar");
                    System.out.println("1) Acelerar");
                    System.out.println("2) Frear");
                    selecaoAcao = resposta.nextInt();

                    switch (selecaoAcao) {
                        case 0:
                            System.out.println("Parando o carro...");
                            carro3.setVelocidade(-1);
                            break;
                        case 1:
                            carro3.acelerar();
                            break;
                        case 2:
                            carro3.frear();
                            break;
                    }
                }
                break;
            default:
                System.out.println("Nenhum carro selecionado");
        }
    }
}
