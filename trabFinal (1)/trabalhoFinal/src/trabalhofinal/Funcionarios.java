package trabalhofinal;

import java.util.ArrayList;


public class Funcionarios extends Pessoa {
    private String cargo;
    private float salario;
    
    ArrayList<Funcionarios> funcionarios;


    public Funcionarios( String nome, int id, String cpf, String cargo, float salario) {
        super(nome, id, cpf);
        this.cargo = cargo;
        this.salario = salario;
        this.funcionarios = new ArrayList<>();
        
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void cadastroFuncionario(Funcionarios funcionario) {
        funcionario.setCargo(getCargo());
        funcionario.setSalario(getSalario());
        funcionario.setCpf(getCpf());
        funcionario.setId(getId());
        funcionario.setNome(getNome());

        funcionarios.add(funcionario);
}

    public void excluirFuncionario(Funcionarios funcionario){
        funcionarios.remove(funcionario);
    }

    ArrayList<Funcionarios> getFuncionarios() {
        return funcionarios;
    }

    

   

}
