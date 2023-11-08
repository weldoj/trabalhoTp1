
package trabalhofinal;

import java.util.ArrayList;
import java.util.List;


public class Cardapio {
    private String nomeCardapio;
    
    //private List<CardapioInfo> cardapioInfoList;

    // Construtor da classe Cardapio
    public Cardapio(String nome) {
        nomeCardapio = nome;
        //this.cardapioInfoList = new ArrayList<>();
        
    }
    /*

    // Método para obter a lista de informações do cardápio
    public List<CardapioInfo> getCardapioInfoList() {
        return cardapioInfoList;
    }

    // Método para definir a lista de informações do cardápio
    public void setCardapioInfoList(List<CardapioInfo> cardapioInfoList) {
        this.cardapioInfoList = cardapioInfoList;
    }

    // Método para adicionar informações ao cardápio
    public void addCardapioInfo(CardapioInfo cardapioInfo) {
        cardapioInfoList.add(cardapioInfo);
    }
*/
   
    //private List<ItemCardapio> itens = new ArrayList<>();

   

    public String getNomeCardapio() {
        return nomeCardapio;
    }

    public void setNomeCardapio(String nomeCardapio) {
        this.nomeCardapio = nomeCardapio;
    }

    

   /* public void adicionarItem(ItemCardapio item) {
        itens.add(item);
    }

    public void removerItem(ItemCardapio item) {
        itens.remove(item);
    }

    public List<ItemCardapio> getItens() {
        return itens;
    }*/

    
    
}