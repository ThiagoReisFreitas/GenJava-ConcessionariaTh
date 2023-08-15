package concessionaria.modelos;

public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private float preco;
    private String placa;


    public Veiculo(String marca, String modelo, int ano, String cor, float preco, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
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

    public void visualizar(){

        System.out.println("\n*********************************************");
        System.out.println("Dados do Veiculo");
        System.out.println("*********************************************");
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano: "+this.ano);
        System.out.println("Placa: "+this.placa);
        System.out.println("Cor: "+this.cor);
        System.out.println("Preço: "+this.preco);
    }
}
