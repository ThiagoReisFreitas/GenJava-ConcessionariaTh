package concessionaria.modelos;

public abstract class Veiculo {

    private String modelo;
    private String marca;
    private int ano;
    private String placa;
    private String cor;
    private float preco;
    private int status; //1 - novo / 2 - usado

    public Veiculo(String modelo, String marca, int ano, String placa, String cor, float preco, int status) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.placa = placa;
        this.cor = cor;
        this.preco = preco;
        this.status = status;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void visualizar(){
        System.out.printf(
                "\nInformações do Carro\n\tMarca: %s\n\tModelo: %s\n\tAno: %d\n\tCor: %s\n\tPlaca: %s\n\tPreço: R$%.2f\n",
                marca, modelo, ano, cor, placa, preco);
    }
}
