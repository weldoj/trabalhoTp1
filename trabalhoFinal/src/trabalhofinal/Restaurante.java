
package trabalhofinal;


public class Restaurante {
    
    private String nomeEmp;
    private long cnpj;
    private String endereco;
    private String descricao;
    private long telefone;

    public Restaurante() {
    }
    
    

    public Restaurante(String nomeEmp, long cnpj, String endereco, String descricao, long telefone) {
        this.nomeEmp = nomeEmp;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.descricao = descricao;
        this.telefone = telefone;
    }

    public String getNomeEmp() {
        return nomeEmp;
    }

    public void setNomeEmp(String nomeEmp) {
        this.nomeEmp = nomeEmp;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    

    
}
