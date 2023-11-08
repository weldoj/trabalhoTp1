package trabalhofinal;

import java.util.HashMap;
import java.util.Map;
import trabalhofinal.itemCardapio;
import trabalhofinal.Financeiro;


public class Pedido {
    private int idPedido;
    private int idGarcom;
    private double valorTotal;
    private double valorTotalCusto;
    private String dataPedido;
    private Map<itemCardapio, Double> mapPedido;

    public Pedido() {
    }
    
    public Pedido(int idPedido, int idGarcom, double valorTotal, double valorTotalCusto, String dataPedido, Map<itemCardapio, Double> mapReceita) {
        this.idPedido = idPedido;
        this.idGarcom = idGarcom;
        this.valorTotal = valorTotal;
        this.valorTotalCusto = valorTotalCusto;
        this.dataPedido = dataPedido;
        this.mapPedido = new HashMap<>(mapPedido);
    }

    public int getIdPedido() {
        return idPedido;
    }

    public int getIdGarcom() {
        return idGarcom;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getValorTotalCusto() {
        return valorTotalCusto;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public Map<itemCardapio, Double> getMapPedido() {
        return mapPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setIdGarcom(int idGarcom) {
        this.idGarcom = idGarcom;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setValorTotalCusto(double valorTotalCusto) {
        this.valorTotalCusto = valorTotalCusto;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void setMapPedido(Map<itemCardapio, Double> mapPedido) {
        this.mapPedido = mapPedido;
    }
    
    public void calculaValorPedido(){
        valorTotal = 0.0;
        
        for (Map.Entry<itemCardapio,Double> entry : mapPedido.entrySet()){
            itemCardapio itemCardapio = entry.getKey();
            double quantidade = entry.getValue();
            double vendaItem = itemCardapio.getValorVenda();
            
            valorTotal += vendaItem * quantidade;
        }
    }
    
    public void calculaValorCusto(){
        valorTotalCusto = 0.0;
        
        for (Map.Entry<itemCardapio, Double> entry : mapPedido.entrySet()) {
            itemCardapio itemCardapio = entry.getKey();
            double quantidade = entry.getValue();
            double custoItem = itemCardapio.getValorCusto();
            
            valorTotalCusto += custoItem * quantidade;
            
        }
    }
}
