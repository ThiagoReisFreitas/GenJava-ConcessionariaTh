package concessionaria.conta;

public class Anunciante extends Pessoa {

    private String cnpj;
    private String razaoSocial;

    public Anunciante(String nome, String endereco, String telefone, String email, String cnpj, String razaoSocial) {
        super(nome, endereco, telefone, email);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("CNPJ: "+cnpj);
        System.out.println("Razão Social: "+razaoSocial);
    }
}
