package concessionaria.repositorio;

import concessionaria.modelos.Veiculo;

public interface ConcessionariaRepositorio {

    //CRUD
    public void procurarPorNumero(int numero);
    public  void listarTodas(int tipo);
    public void cadastrar(Veiculo veiculo);
    public void deletar(int numero);

}
