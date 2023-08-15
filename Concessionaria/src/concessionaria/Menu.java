package concessionaria;

import concessionaria.controlador.VeiculoControlador;
import concessionaria.modelos.Carro;
import concessionaria.modelos.Moto;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        VeiculoControlador veiculoControlador = new VeiculoControlador();

        String marca, modelo, cor, placa, tipoCombustivel;
        int op, tipoVeiculo, ano, potenciaMotor, cilindrada, mostrar, numero;
        float preco;
        veiculoControlador.cadastrar(new Moto(2, veiculoControlador.gerarNumero(),"Honda", "Cross", 2010, "preto", 2000f,"ABD1232",600));
        veiculoControlador.cadastrar(new Carro(1, veiculoControlador.gerarNumero(),"Honda", "Fit", 2010, "Azul", 30000, "TGD1A34", 239, "Flex"));
        veiculoControlador.listarTodas();


        while (true) {
            System.out.println("\n*****************************************************************************************************************");
            System.out.println("");
            System.out.println("  _____                                      _                             _          _______  _");
            System.out.println(" / ____|                                    (_)                           (_)        |__   __|| |");
            System.out.println("| |       ___   _ __    ___   ___  ___  ___  _   ___   _ __    __ _  _ __  _   __ _     | |   | |__");
            System.out.println("| |      / _ \\ | '_ \\  / __| / _ \\/ __|/ __|| | / _ \\ | '_ \\  / _` || '__|| | / _` |    | |   | '_ \\");
            System.out.println("| |____ | (_) || | | || (__ |  __/\\__ \\\\__ \\| || (_) || | | || (_| || |   | || (_| |    | |   | | | |");
            System.out.println(" \\_____| \\___/ |_| |_| \\___| \\___||___/|___/|_| \\___/ |_| |_| \\__,_||_|   |_| \\__,_|    |_|   |_| |_|");
            System.out.println("");
            System.out.println("******************************************************************************************************************");
            System.out.println("                                                   ");
            System.out.println("                                1 - Anunciar Veiculo                   ");
            System.out.println("                                2 - Comprar Veiculo                    ");
            System.out.println("                                3 - Listar Veiculos Disponiveis                        ");
            System.out.println("                                4 - Listar Veiculos Comprados                   ");
            System.out.println("                                5 - Excluir anuncio                    ");
            System.out.println("                                0 - Sair                               ");
            System.out.println("                                                   ");
            System.out.println("*******************************************************************************************************************");
            System.out.print("Digite a opção desejada: ");
            try {
                op = leia.nextInt();
            }catch(InputMismatchException e){
                System.out.println("\nDigite somente valores inteiros!");
                leia.nextLine();
                op = 9;
            }

            if(op == 0){
                System.out.println("< Concessionaria Th > - O Seu Carro Dos Sonhos Esta Aqui!");
                leia.close();
                System.exit(0);
            }
            switch (op) {
                case 1:
                    System.out.println("\nAnunciar veiculo: ");
                    System.out.println("Você quer anunciar um Carro(1) ou uma Moto(2): ");
                    tipoVeiculo = leia.nextInt();
                    leia.nextLine();

                    System.out.println("Marca: ");
                    marca = leia.nextLine();

                    System.out.println("Modelo: ");
                    modelo = leia.nextLine();

                    System.out.println("Cor: ");
                    cor = leia.nextLine();

                    System.out.println("Placa: ");
                    placa = leia.nextLine();

                    System.out.println("Ano: ");
                    ano = leia.nextInt();

                    switch (tipoVeiculo){
                        case 1 -> {
                            System.out.println("Potencia do Motor: ");
                            potenciaMotor = leia.nextInt();
                            leia.nextLine();

                            System.out.println("Tipo de Combustivel: ");
                            tipoCombustivel = leia.nextLine();

                            System.out.println("Preço: ");
                            preco = leia.nextFloat();

                            veiculoControlador.cadastrar(new Carro(tipoVeiculo, veiculoControlador.gerarNumero(), marca, modelo, ano, cor, preco, placa, potenciaMotor, tipoCombustivel));
                        }
                        case 2 -> {
                            System.out.println("Cilindrada: ");
                            cilindrada = leia.nextInt();
                            leia.nextLine();

                            System.out.println("Preço: ");
                            preco = leia.nextFloat();

                            veiculoControlador.cadastrar(new Moto(tipoVeiculo, veiculoControlador.gerarNumero(), marca, modelo, ano, cor, preco, placa, cilindrada));
                        }
                    }


                    keyPress();
                    break;
                case 2:
                    System.out.println("\nComprar Veiculo: ");

                    keyPress();
                    break;
                case 3:
                    System.out.println("\nLista dos Veiculos Disponiveis:");
                    System.out.println("Mostrar Somente Carros(1), Motos(2) ou Todos os Veiculos(3)? ");
                    mostrar = leia.nextInt();
                        if(mostrar < 3)
                            veiculoControlador.listarCarroMoto(mostrar);
                        else
                            veiculoControlador.listarTodas();

                    keyPress();
                    break;
                case 4:
                    System.out.println("\nLista dos Veiculos Comprados:");

                    keyPress();
                    break;
                case 5:
                    System.out.println("\nExcluir Anuncio");
                    System.out.println("Digite o número do anuncio: ");
                    numero = leia.nextInt();

                    veiculoControlador.deletar(numero);
                    keyPress();
                    break;
                default:
                    System.out.println("\nOpção invalida...Tente novamente!");

                    keyPress();
            }
        }
    }
    public static void keyPress() {

        try {
            System.out.println("\n\nPressione enter para continuar...");
            System.in.read();

        }catch (IOException e) {
            System.out.println("Você pressionou uma tecla diferente de enter!");
        }
    }
}
