
package trabalhofinal;

import java.util.ArrayList;
import java.util.List;


public class Cardapio {
    private String nomeCardapio;
    
    private List<itemCardapio> cardapioInfoList;

    // Construtor da classe Cardapio
    public Cardapio(String nome) {
        this.nomeCardapio = nome;
        this.cardapioInfoList = new ArrayList<>();
        
    }
    

    // Método para obter a lista de informações do cardápio
    public List<itemCardapio> getCardapioInfoList() {
        return cardapioInfoList;
    }

    // Método para definir a lista de informações do cardápio
    public void setCardapioInfoList(List<itemCardapio> cardapioInfoList) {
        this.cardapioInfoList = cardapioInfoList;
    }
  
    public String getNomeCardapio() {
        return nomeCardapio;
    }

    public void setNomeCardapio(String nomeCardapio) {
        this.nomeCardapio = nomeCardapio;
    }
    
    
}