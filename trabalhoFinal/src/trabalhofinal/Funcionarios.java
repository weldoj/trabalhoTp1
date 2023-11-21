package trabalhofinal;


public class Funcionarios extends Pessoa {
    private String cargo;
    private float salario;

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
    

}
