package concessionaria.repositorio;

import concessionaria.modelos.Veiculo;

public interface ConcessionariaRepositorio {

    public void procurarPorNumero(int numero);
    public  void listarTodas();
    public void cadastrar(Veiculo veiculo);
    public void atualizar(Veiculo veiculo);
    public void deletar(int numero);
}
