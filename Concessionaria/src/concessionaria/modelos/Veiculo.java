package concessionaria.modelos;

import java.text.NumberFormat;

public abstract class Veiculo {

    private int tipoVeiculo; //Carro(1) Moto(2)
    private int numeroCadastro;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private float preco;
    private String placa;

    public Veiculo(int tipoVeiculo, int numeroCadastro,String marca, String modelo, int ano, String cor, float preco, String placa) {
        this.tipoVeiculo = tipoVeiculo;
        this.numeroCadastro = numeroCadastro;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.placa = placa;
    }

    NumberFormat moeda = NumberFormat.getCurrencyInstance();

    public int getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(int tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public int getNumeroCadastro() {
        return numeroCadastro;
    }

    public void setNumeroCadastro(int numeroCadastro) {
        this.numeroCadastro = numeroCadastro;
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

    public String getPrecoFormatado() {
        return moeda.format(preco);
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void visualizar(){

        System.out.println("\n*********************************************");
        if(this.tipoVeiculo == 1)
            System.out.println("Dados do Carro");
        else
            System.out.println("Dados da Moto");
        System.out.println("*********************************************");
        System.out.println("Número do Cadastro: "+this.numeroCadastro);
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano: "+this.ano);
        System.out.println("Placa: "+this.placa);
        System.out.println("Cor: "+this.cor);
        System.out.println("Preço: "+moeda.format(this.preco));
    }
}
