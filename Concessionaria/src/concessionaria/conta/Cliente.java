package concessionaria.conta;

public class Cliente extends Pessoa {

    private String cpf;
    private String rg;

    public Cliente(String nome, String endereco, String telefone, String email, String cpf, String rg) {
        super(nome, endereco, telefone, email);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("CPF: "+cpf);
        System.out.println("RG: "+rg);
    }
}
