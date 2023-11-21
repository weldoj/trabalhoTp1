package trabalhofinal;

public class Despesa {
    private double valor;
    private String descricao;
    private String data;

    public Despesa() {
    }
    
    public Despesa(double valor, String descricao, String data) {
        this.valor = valor;
        this.descricao = descricao;
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getData() {
        return data;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(String data) {
        this.data = data;
    }
}
