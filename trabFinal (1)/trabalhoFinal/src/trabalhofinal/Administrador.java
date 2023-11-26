package trabalhofinal;
import java.util.ArrayList;



public class Administrador extends Pessoa {
    private String email;
    private String dataNascimento;
    private String senha;
    
    private ArrayList<Funcionarios> funcionarios;
    

    public Administrador() {
        this.funcionarios = new ArrayList<>();

    }

    public Administrador(String email, String dataNascimento, String nome, String senha, int id, String cpf) {
        super(nome, id, cpf);
        this.senha = senha;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.funcionarios = new ArrayList<>();

        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<Funcionarios> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionarios> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public void adcionaFuncionarios(Funcionarios funcionarios) {
        this.funcionarios.add(funcionarios);
    }
    
    


}
