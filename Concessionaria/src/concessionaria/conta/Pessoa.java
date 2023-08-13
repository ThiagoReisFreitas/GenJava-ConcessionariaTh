package concessionaria.conta;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String nomeUsuario;
    private String senha;

    public Pessoa(String nome, int idade, String nomeUsuario, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void visualizar(){
        System.out.printf("\nDados do Usuario\n\tNome: %s\n\tIdade: %s\n\tNome de Usuario: %s\n\tSenha: %s\n", nome, idade, nomeUsuario, senha);
    }
}
