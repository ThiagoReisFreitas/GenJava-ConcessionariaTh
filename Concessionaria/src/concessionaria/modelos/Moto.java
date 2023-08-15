package concessionaria.modelos;

public class Moto extends Veiculo{

    private int cilindrada;

    public Moto(int tipoVeiculo, int numeroCadastro ,String marca, String modelo, int ano, String cor, float preco, String placa, int cilindrada) {
        super(tipoVeiculo, numeroCadastro, marca, modelo, ano, cor, preco, placa);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }


    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Cilindradas: "+this.cilindrada);
    }
}
