package concessionaria.controlador;

import concessionaria.modelos.Veiculo;
import concessionaria.repositorio.ConcessionariaRepositorio;

import java.util.ArrayList;

public class VeiculoControlador implements ConcessionariaRepositorio {

    int numero = 0;
    ArrayList<Veiculo> listaVeiculo = new ArrayList<Veiculo>();

    @Override
    public void procurarPorNumero(int numero) {
        var veiculo = buscarColecao(numero);

        if(veiculo != null)
            veiculo.visualizar();
        else
            System.out.println("\nO Veiculo");

    }

    @Override
    public  void listarTodas() {
        for(var veiculo:listaVeiculo) {
            veiculo.visualizar();
        }

    }

    @Override
    public void cadastrar(Veiculo veiculo) {
        listaVeiculo.add(veiculo);
        System.out.println("\nO anuncio número: "+veiculo.getNumeroCadastro()+" foi criada com sucesso!");
    }

    @Override
    public void atualizar(Veiculo veiculo) { //não sei se terá essa opção

    }

    @Override
    public void deletar(int numero) {
        var veiculo = buscarColecao(numero);

        if (veiculo != null) {
            if(listaVeiculo.remove(veiculo) == true)
                System.out.println("\nO Anuncio numero: " +numero+" foi deletado com sucesso!");
        }else
            System.out.println("\nO Anuncio numero "+numero+" não foi encontrado!");
    }

    public int gerarNumero() {
        return ++ numero;
    }

    public Veiculo buscarColecao(int numero){ //esse parametro numero vai receber o metodo gerar numero que vai ser o numero de cadastro
        for(var veiculo:listaVeiculo) {
            if (veiculo.getNumeroCadastro() == numero){
                return veiculo;
            }
        }
        return null;
    }

    public void listarCarroMoto(int tipoVeiculo) {
        switch (tipoVeiculo){
            case 1 -> {
                for(var carro:listaVeiculo){
                    if (carro.getTipoVeiculo() == 1)
                        carro.visualizar();
                }
            }
            case 2 -> {
                for(var moto:listaVeiculo){
                    if (moto.getTipoVeiculo() == 2)
                        moto.visualizar();
                }
            }
        }
    }

}
