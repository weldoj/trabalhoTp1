package trabalhofinal;
import java.util.ArrayList;



public class Administrador extends Pessoa {
    private String email;
    private String dataNascimento;
    
    private ArrayList<Funcionarios> funcionarios = new ArrayList<Funcionarios>();
    

    public Administrador() {
    }

    public Administrador(String email, String dataNascimento, String nome, String senha, int id, long cpf) {
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
    
    public void cadastroFuncionario(Funcionarios funcionario){
        funcionarios.add(funcionario);
    }
    public void excluitFuncionario(Funcionarios funcionario){
        funcionarios.remove(funcionario);
    }

}
