package trabalhofinal;
import java.util.ArrayList;



public class Administrador extends Pessoa {
    private String email;
    private String dataNascimento;
    
    private ArrayList<Funcionarios> funcionarios;
    

    public Administrador() {
    }

    public Administrador(String email, String dataNascimento, String nome, String senha, int id, String cpf) {
        super(nome, senha, id, cpf);
        this.email = email;
        this.dataNascimento = dataNascimento;
        
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

    public ArrayList<Funcionarios> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionarios> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    


}
