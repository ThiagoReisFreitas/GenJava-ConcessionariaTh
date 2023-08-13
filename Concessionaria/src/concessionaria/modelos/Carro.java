package concessionaria.modelos;

public class Carro extends Veiculo{

    private int tipo;
    private int rodas;

    public Carro(String modelo, String marca, int ano, String placa, String cor, float preco, int status, int tipo, int rodas) {
        super(modelo, marca, ano, placa, cor, preco, status);
        this.tipo = tipo;
        this.rodas = rodas;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
}
