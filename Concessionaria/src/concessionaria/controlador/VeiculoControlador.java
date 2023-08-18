package concessionaria.controlador;

import concessionaria.modelos.Carro;
import concessionaria.modelos.Moto;
import concessionaria.modelos.Veiculo;
import concessionaria.repositorio.ConcessionariaRepositorio;

import java.util.ArrayList;
import java.util.Scanner;

public class VeiculoControlador implements ConcessionariaRepositorio {

    Scanner leia = new Scanner(System.in);
    int numero = 0;
    ArrayList<Veiculo> listaVeiculo = new ArrayList<Veiculo>();

    @Override
    public void procurarPorNumero(int numero) {
        var veiculo = buscarColecao(numero);

        if(veiculo != null)
            veiculo.visualizar();
        else
            System.out.println("\nO Veiculo Numero de cadastro"+numero+" não foi encontrado!");

    }

    @Override
    public  void listarTodas(int tipo) {
        int contador = 0;
       switch (tipo) {
           case 1:
               for (var veiculo : listaVeiculo) {
                   if(!veiculo.getComprado()) {
                       veiculo.visualizar();
                       contador++;
                   }
               }
               if(contador == 0)
                   System.out.println("Não tempos nenhum veiculo a venda. Tente anunciar algum!");

               break;
           case 2:
               for (var veiculo : listaVeiculo) {
                   if(veiculo.getComprado()) {
                       veiculo.visualizar();
                       contador++;
                   }
               }
               if (contador == 0) {
                   System.out.println("Nenhum veiculo foi comprado até agora!");
               }
       }
    }

    @Override
    public void cadastrar(Veiculo veiculo) {
        listaVeiculo.add(veiculo);
        System.out.println("\nO Veiculo número: "+veiculo.getNumeroCadastro()+" foi criada com sucesso!");
    }

    public void criacaoCadastro(int tipo) {
        int tipoVeiculo, ano, potenciaMotor, cilindrada;
        String marca, modelo, cor, placa, tipoCombustivel;
        float preco;
        switch(tipo){
            case 1:
                System.out.println("\nAnunciar veiculo: ");
                System.out.println("Você quer anunciar um Carro(1) ou uma Moto(2): ");
                break;
            case 2:
                System.out.println("Troca de Veiculo");
                System.out.println("Você quer trocar um Carro(1) ou uma Moto(2): ");
        }
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

        switch (tipoVeiculo) {
            case 1 -> {
                System.out.println("Potencia do Motor: ");
                potenciaMotor = leia.nextInt();
                leia.nextLine();

                System.out.println("Tipo de Combustivel: ");
                tipoCombustivel = leia.nextLine();

                System.out.println("Preço: ");
                preco = leia.nextFloat();

                cadastrar(new Carro(tipoVeiculo, gerarNumero(), marca, modelo, ano, cor, preco, placa, false,potenciaMotor, tipoCombustivel));
            }
            case 2 -> {
                System.out.println("Cilindrada: ");
                cilindrada = leia.nextInt();
                leia.nextLine();

                System.out.println("Preço: ");
                preco = leia.nextFloat();

                cadastrar(new Moto(tipoVeiculo, gerarNumero(), marca, modelo, ano, cor, preco, placa, false, cilindrada));
            }
        }
    }

    @Override
    public void deletar(int numero) { //1 é pra deletar, 2 é pra tirar da lista e adicionar na outra lista
        var veiculo = buscarColecao(numero);

        if (veiculo != null) {
            if (listaVeiculo.remove(veiculo))
                System.out.println("\nO Anuncio numero: " + numero + " foi deletado com sucesso!");
        } else
            System.out.println("\nO Anuncio numero " + numero + " não foi encontrado!");


    }

    public int gerarNumero() {
        return ++ numero;
    }

    public Veiculo buscarColecao(int numero){
        for(var veiculo:listaVeiculo) {
            if (veiculo.getNumeroCadastro() == numero){
                return veiculo;
            }
        }
        return null;
    }

    public void listarCarroMoto(int tipoVeiculo, int tipo) {//tipo 1 é a função para a listaVeiculos e 2 para veiculosComprados
        int contador = 0;
        switch (tipo) {
            case 1:
                switch (tipoVeiculo) {
                    case 1 -> {
                        for (var carro : listaVeiculo) {
                            if (carro.getTipoVeiculo() == 1 && !carro.getComprado()) {
                                carro.visualizar();
                                contador += 1;
                            }
                        }
                        if (contador == 0)
                            System.out.println("Não temos carros disponiveis!");

                    }
                    case 2 -> {

                        for (var moto : listaVeiculo) {
                            if (moto.getTipoVeiculo() == 2 && !moto.getComprado()) {
                                moto.visualizar();
                                contador += 1;
                            }
                        }
                        if (contador == 0)
                            System.out.println("Não temos motos disponiveis!");
                    }
                }
                break;
            case 2:
                switch (tipoVeiculo) {
                    case 1 ->{
                        for(var carro : listaVeiculo) {
                            if(carro.getTipoVeiculo() == 1 && carro.getComprado()){
                                carro.visualizar();
                                contador++;
                            }
                        }
                        if(contador == 0)
                            System.out.println("Nenhum carro foi comprado!");
                    }
                    case 2 ->{
                        for(var moto : listaVeiculo) {
                            if(moto.getTipoVeiculo() == 2 && moto.getComprado()){
                                moto.visualizar();
                                contador++;
                            }
                        }
                        if(contador == 0){
                            System.out.println("Nenhuma moto foi comprada!");
                        }
                    }
                }
        }
    }

    public void escolherVisualizar (int mostrar, int tipo) {
        if(mostrar < 3)
            listarCarroMoto(mostrar, tipo);
        else
            listarTodas(tipo);
    }

    public void pagamentoAVista(Veiculo veiculo){
        float valor;
        System.out.println("\nÀ vista: ");
        System.out.println("O Veiculo custa "+veiculo.getPrecoFormatado()+": ");
        do{
            System.out.println("Digite o valor do veiculo: ");
            valor = leia.nextFloat();
            if (valor < veiculo.getPreco())
                System.out.println("Valor digitado é menor, Tente novamente!");
            else if (valor > veiculo.getPreco())
                System.out.println("Valor digitado é maior, Tente novamente!");
        }while (valor != veiculo.getPreco());
        System.out.println("Pagamento realizado com sucesso!");
        System.out.println("Você é o mais novo proprietario do/a "+veiculo.getMarca()+" "+veiculo.getModelo()+", Parabens!");
        veiculo.setComprado(true);

    }

    public void pagamentoAVista(Veiculo veiculo, float diferenca){     //sobrecarga para forçar um parametro opcional
        float valor;

        System.out.println("\nÀ vista: ");
        do{
            System.out.println("Digite o valor da diferença: ");
            valor = leia.nextFloat();
            if (valor < diferenca)
                System.out.println("Valor digitado é menor, Tente novamente!");
            else if (valor > diferenca)
                System.out.println("Valor digitado é maior, Tente novamente!");
        }while (valor != diferenca);
        System.out.println("Pagamento realizado com sucesso!");
        System.out.println("Você é o mais novo proprietario do/a "+veiculo.getMarca()+" "+veiculo.getModelo()+", Parabens!");
        veiculo.setComprado(true);
    }

    public void pagamentoFinanciamento(Veiculo veiculo){
        int anoFinanciamento;
        float preco;
        System.out.println("Financiamento: ");
        System.out.println("O Veiculo custa "+veiculo.getPrecoFormatado()+":");
        System.out.println("O financiamento vai será em quantos anos? (juros 10% ao ano)");
        anoFinanciamento = leia.nextInt();
        int meses = 12 * anoFinanciamento;
        preco = veiculo.getPreco();
        float parcela = preco / meses;
        float juros = (veiculo.getPreco()*10)/100;
        for(int i =0; i < anoFinanciamento; i++){
            System.out.printf("%dº ano : %.2f\n", i+1, parcela);
            preco+=juros;
            parcela = preco / meses;
        }
        System.out.println("Você é o mais novo proprietario do/a "+veiculo.getMarca()+" "+veiculo.getModelo()+", Parabens!");
        veiculo.setComprado(true);
    }

    public void pagamentoFinanciamento(Veiculo veiculo, float diferenca){
        int anoFinanciamento;
        float preco = diferenca;
        System.out.println("Financiamento: ");
        System.out.println("A diferença é de "+preco+":");
        System.out.println("O financiamento vai será em quantos anos? (juros 10% ao ano)");
        anoFinanciamento = leia.nextInt();
        int meses = 12 * anoFinanciamento;
        float parcela = preco / meses;
        float juros = (veiculo.getPreco()*10)/100;
        for(int i =0; i < anoFinanciamento; i++){
            System.out.printf("%dº ano : %.2f\n", i+1, parcela);
            preco+=juros;
            parcela = preco / meses;
        }
        System.out.println("Você é o mais novo proprietario do/a "+veiculo.getMarca()+" "+veiculo.getModelo()+", Parabens!");
        veiculo.setComprado(true);
    }

    public void pagamentoTroca(Veiculo veiculo){
        float diferenca;

        System.out.println("Troca: ");
        System.out.println("Você quer trocar qual carro pelo "+veiculo.getMarca()+" "+veiculo.getModelo()+"? ");
        criacaoCadastro(2);
        var troca = buscarColecao(listaVeiculo.size());
        if(veiculo.getPreco() > troca.getPreco()){
            diferenca = veiculo.getPreco() - troca.getPreco();
            System.out.println("A diferença é de "+diferenca+", qual vai ser a forma de pagamento dela, À Vista(1) ou Financiamento(2)?");
            numero = leia.nextInt();
            switch(numero){
                case 1 -> pagamentoAVista(veiculo, diferenca);
                case 2 -> pagamentoFinanciamento(veiculo, diferenca);
            }
        }
        else if(veiculo.getPreco() < troca.getPreco()){
            diferenca = troca.getPreco() - veiculo.getPreco();
            System.out.println("A diferença é de "+diferenca+", estamos te retornando esse valor!");
        }
        else{
            System.out.println("O valor dos veiculos são iguais a troca foi realizada com sucesso!");
        }
        veiculo.setComprado(true);
    }

}
