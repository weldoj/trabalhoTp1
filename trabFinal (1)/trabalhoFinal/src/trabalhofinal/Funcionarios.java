package trabalhofinal;

import java.util.ArrayList;


public class Funcionarios extends Pessoa {
    private String cargo;
    private float salario;
    
    ArrayList<Funcionarios> funcionarios = new ArrayList<>();

    public Funcionarios() {
    }

    public Funcionarios(String cargo, float salario, String nome, String senha, int id, long cpf) {
        super(nome, senha, id, cpf);
        this.cargo = cargo;
        this.salario = salario;
        
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
    
    public void cadastroFuncionario(Funcionarios funcionario){
        funcionario.getCargo();
        funcionario.getSalario();
        funcionario.getCpf();
        funcionario.getId();
        funcionario.getNome();
        funcionario.getSenha();
        
        funcionarios.add(funcionario);
    }
    public void excluitFuncionario(Funcionarios funcionario){
        funcionarios.remove(funcionario);
    }
    
    public ArrayList retornaLista(){
        return funcionarios;
    }

   

}
