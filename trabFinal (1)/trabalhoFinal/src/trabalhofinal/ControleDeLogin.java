
package trabalhofinal;
//controla as informações de login que serão 
//utilizadas para verificar os dados inseridos

import java.util.ArrayList;

//na página inicial do programa

public  class ControleDeLogin {
    Pessoa pessoa = new Pessoa();    
    
    public String cpfSalvoAdm(){
        if (pessoa instanceof Administrador){
            return  pessoa.getCpf();
        }  
        return null;
        
    }
    
    public  ArrayList<String> cpfSalvoFunc(){
        if (pessoa instanceof Funcionarios){
            Funcionarios funcionarios = (Funcionarios) pessoa;
            ArrayList<Funcionarios> func = funcionarios.retornaLista();
            ArrayList<String> listaCpf = new ArrayList();
            for (int i=0; i < func.size(); i++){
                Funcionarios funcionario = func.get(i);  
                listaCpf.add(funcionario.getCpf()); 
            }
            return listaCpf;
        }
        return null;
        
    }
    
    public String nomeSalvoAdm(){
        if (pessoa instanceof Administrador){
            return  pessoa.getNome();
        }
        return null; 
    }
    
    public  ArrayList<String> nomeSalvoFunc(){
        if (pessoa instanceof Funcionarios){
            Funcionarios funcionarios = (Funcionarios) pessoa;
            ArrayList<Funcionarios> func = funcionarios.retornaLista();
            ArrayList<String> listaNomes = new ArrayList();
            for (int i=0; i < func.size(); i++){
                Funcionarios funcionario = func.get(i);  
                listaNomes.add(funcionario.getNome()); 
            }
            return listaNomes;
        }
        return null;
        
    }
    
    public String senhaSalvoAdm(){
        if (pessoa instanceof Administrador){
            return  pessoa.getSenha();
        }
        return null;
    }
    public  ArrayList<String> senhaSalvoFunc(){
        if (pessoa instanceof Funcionarios){
            Funcionarios funcionarios = (Funcionarios) pessoa;
            ArrayList<Funcionarios> func = funcionarios.retornaLista();
            ArrayList<String> listaSenhas = new ArrayList();
            for (int i=0; i < func.size(); i++){
                Funcionarios funcionario = func.get(i);  
                listaSenhas.add(funcionario.getSenha()); 
            }
            return listaSenhas;
        }
        return null;
        
    }
    
}


    
