package trabalhofinal;

import java.util.HashMap;
import java.util.Map;


public class itemCardapio {
    private String nomeItem;
    private double valorCusto;
    private double valorVenda;
    private Map<String, Double> mapReceita;
    
 
    public itemCardapio() {
    }

    public itemCardapio(String nomeItem, double valorCusto, double valorVenda, Map<String, Double> mapReceita) {
        this.nomeItem = nomeItem;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
        this.mapReceita = new HashMap<>(mapReceita);
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public Map<String, Double> getMapReceita() {
        return mapReceita;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public void setMapReceita(Map<String, Double> mapReceita) {
        this.mapReceita = mapReceita;
    }
}
