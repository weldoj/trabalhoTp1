package trabalhofinal;

import java.util.ArrayList;

public class Financeiro {
    private ArrayList<Pedido> historicoPedidos;
    private ArrayList<Despesa> despesasGerais;
    private double balancoDiario;
    private double balancoMensal;

    public Financeiro() {
    }

    public Financeiro(Pedido historicoPedidos, double despesasGerais, double balancoDiario, double balancoMensal) {
        this.historicoPedidos = new ArrayList<>();
        this.despesasGerais = new ArrayList<>();
        this.balancoDiario = balancoDiario;
        this.balancoMensal = balancoMensal;
    }

    public ArrayList<Pedido> getHistoricoPedidos() {
        return historicoPedidos;
    }

    public ArrayList<Despesa> getDespesasGerais() {
        return despesasGerais;
    }

    public double getBalancoDiario() {
        return balancoDiario;
    }

    public double getBalancoMensal() {
        return balancoMensal;
    }

    public void setHistoricoPedidos(ArrayList<Pedido> historicoPedidos) {
        this.historicoPedidos = historicoPedidos;
    }

    public void setDespesasGerais(ArrayList<Despesa> despesasGerais) {
        this.despesasGerais = despesasGerais;
    }

    public void setBalancoDiario(double balancoDiario) {
        this.balancoDiario = balancoDiario;
    }

    public void setBalancoMensal(double balancoMensal) {
        this.balancoMensal = balancoMensal;
    }
    
    
    public double calcularLucro(){
        double vendaTotal = 0.0;
        double custoTotal = 0.0;
        
        for (Pedido pedido : historicoPedidos){
            vendaTotal += pedido.getValorTotal();
            custoTotal += pedido.getValorTotalCusto();
        }
        
        double lucroTotal = vendaTotal - custoTotal;
        
        return lucroTotal;
    }
    
    public void registrarPedido(Pedido pedido){
        historicoPedidos.add(pedido);
    }
    
    public void registrarDespesa(Despesa despesa){
        despesasGerais.add(despesa);
    }
    
    public double gerarBalancoDiario(String data){
        balancoDiario = 0.0;
        for (Pedido pedido : historicoPedidos){
            if (pedido.getDataPedido().equals(data)){
                double lucro = pedido.getValorTotal() - pedido.getValorTotalCusto();
                balancoDiario += lucro;    
                balancoDiario += lucro;
            }
        }
        return balancoDiario;
    }
    
    public double gerarBalancoMensal(int mes){
        double balancoMensal = 0.0;
        for (Pedido pedido: historicoPedidos){
            int mesPedido = extrairMes(pedido.getDataPedido());
                if (mesPedido == mes){
                double lucro = pedido.getValorTotal() - pedido.getValorTotalCusto();
                balancoMensal += lucro;
            }
        }
        return balancoMensal;
    }
    
    public static int extrairMes(String data){
        String[] partes = data.split("/");
        if(partes.length >= 2){
            return Integer.parseInt(partes[1]);
        }
        return 0;
    }
    
    
    public StringBuilder gerarRelatorioDiario(String data){
        StringBuilder relatorio = new StringBuilder();
        
        for (Pedido pedido : historicoPedidos){
            if (pedido.getDataPedido().equals(data)){
                relatorio.append("Pedido Nº: ").append(pedido.getIdPedido()).append("\n");
                relatorio.append("Garçom Responsável: ").append(pedido.getIdGarcom()).append("\n");
                relatorio.append("Data do Pedido: ").append(pedido.getDataPedido()).append("\n");
                relatorio.append("Valor Pago: R$").append(pedido.getValorTotal()).append("\n");
                relatorio.append("Valor de Custo: R$").append(pedido.getValorTotalCusto()).append("\n");
                double lucro = pedido.getValorTotal() - pedido.getValorTotalCusto();
                relatorio.append("Lucro do Pedido: R$").append(lucro).append("\n\n");
            }
        }
        relatorio.append("Lucro do dia: R$").append(gerarBalancoDiario(data));
        return relatorio;
    }
    
    public StringBuilder gerarRelatorioMensal(int mes){
            StringBuilder relatorio = new StringBuilder();
            for (Pedido pedido: historicoPedidos){
                int mesPedido = extrairMes(pedido.getDataPedido());
                if (mesPedido == mes){
                    relatorio.append("Pedido Nº: ").append(pedido.getIdPedido()).append("\n");
                    relatorio.append("Garçom Responsável: ").append(pedido.getIdGarcom()).append("\n");
                    relatorio.append("Data do Pedido: ").append(pedido.getDataPedido()).append("\n");
                    relatorio.append("Valor Pago: R$").append(pedido.getValorTotal()).append("\n");
                    relatorio.append("Valor de Custo: R$").append(pedido.getValorTotalCusto()).append("\n");
                    double lucro = pedido.getValorTotal() - pedido.getValorTotalCusto();
                    relatorio.append("Lucro do Pedido: R$").append(lucro).append("\n\n");
                }
            }
            relatorio.append("Lucro do Mês: R$").append(gerarBalancoMensal(mes));
            return relatorio;
    }
}
