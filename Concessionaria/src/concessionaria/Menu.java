package concessionaria;

import concessionaria.modelos.Veiculo;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int op, status, tipo;

        while (true) {
            System.out.println("\n***************************************************");
            System.out.println("                                                   ");
            System.out.println("                Concessionaria Th                  ");
            System.out.println("                                                   ");
            System.out.println("***************************************************");
            System.out.println("                                                   ");
            System.out.println("            1 - Anunciar Veiculo                   ");
            System.out.println("            2 - Comprar Veiculo                    ");
            System.out.println("            3 - Criar conta                        ");
            System.out.println("            4 - Listar Veiculos                    ");
            System.out.println("            5 - Excluir anuncio                    ");
            System.out.println("            0 - Sair                               ");
            System.out.println("                                                   ");
            System.out.println("***************************************************");
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
                    System.out.println("Anunciar veiculo: ");

                    keyPress();
                    break;
                case 2:
                    System.out.println("\nComprar Veiculo: ");

                    keyPress();
                    break;
                case 3:
                    System.out.println("\nCriar Conta:");

                    keyPress();
                    break;
                case 4:
                    System.out.println("\nVeiculos Disponiveis:");

                    keyPress();
                    break;
                case 5:
                    System.out.println("\nExcluir Anuncio");

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
