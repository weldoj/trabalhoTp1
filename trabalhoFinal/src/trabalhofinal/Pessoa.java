package trabalhofinal;

public class Pessoa {
    private String nome;
    private String senha;
    private int id;
    private long cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String senha, int id, long cpf) {
        this.nome = nome;
        this.senha = senha;
        this.id = id;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    
    
}
