package concessionaria.modelos;

public class Carro extends Veiculo{

    private int potenciaMotor;
    private String tipoCombustivel;

    public Carro(int tipoVeiculo, int numeroCadastro, String marca, String modelo, int ano, String cor, float preco, String placa, int potenciaMotor, String tipoCombustivel) {
        super(tipoVeiculo, numeroCadastro, marca, modelo, ano, cor, preco, placa);
        this.potenciaMotor = potenciaMotor;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Potencia do Motor: "+this.potenciaMotor);
        System.out.println("Tipo de Combustivel: "+this.tipoCombustivel);
    }
}
