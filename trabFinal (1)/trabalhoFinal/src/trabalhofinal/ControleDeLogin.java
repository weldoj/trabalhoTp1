
package trabalhofinal;
//controla as informações de login que serão 
//utilizadas para verificar os dados inseridos

import java.util.ArrayList;

//na página inicial do programa

public  class ControleDeLogin {
    
    Pessoa pessoa = new Pessoa();    

    public ControleDeLogin() {
    }
    
    public String cpfSalvoAdm(){
        if (pessoa instanceof Administrador){
            return  pessoa.getCpf();
        }
        return null; 
    }
    
    public String senhaSalvoAdm(){
        if (pessoa instanceof Administrador){
        }
        return null;
    }
    
    public String nomeSalvoAdm(){
        if (pessoa instanceof Administrador){
            return  pessoa.getNome();
        }
        return null; 
    }
        
        
    
    
    public  ArrayList<String> cpfSalvoFunc(){
        if (pessoa instanceof Funcionarios){
            Funcionarios funcionarios = (Funcionarios) pessoa;
            ArrayList<Funcionarios> func = funcionarios.getFuncionarios();
            ArrayList<String> listaCpf = new ArrayList();
            for (int i=0; i < func.size(); i++){
                Funcionarios funcionario = func.get(i);  
                listaCpf.add(funcionario.getCpf()); 
            }
            return listaCpf;
        }
        return null;
        
    }
    
    
    
    public  ArrayList<String> nomeSalvoFunc(){
        if (pessoa instanceof Funcionarios){
            Funcionarios funcionarios = (Funcionarios) pessoa;
            ArrayList<Funcionarios> func = funcionarios.getFuncionarios();
            ArrayList<String> listaNomes = new ArrayList();
            for (int i=0; i < func.size(); i++){
                Funcionarios funcionario = func.get(i);  
                listaNomes.add(funcionario.getNome()); 
            }
            return listaNomes;
        }
        return null;
        
    }
    
    
    public  ArrayList<String> senhaSalvoFunc(){
        if (pessoa instanceof Funcionarios){
            Funcionarios funcionarios = (Funcionarios) pessoa;
            ArrayList<Funcionarios> func = funcionarios.getFuncionarios();
            ArrayList<String> listaSenhas = new ArrayList();
            for (int i=0; i < func.size(); i++){
                Funcionarios funcionario = func.get(i);  
                 
            }
            return listaSenhas;
        }
        return null;
        
    }
    
    public static String pegaAdmCpf(Administrador adm){
            return adm.getCpf();
        }
    public static String pegaAdmNome(Administrador adm){
            return adm.getNome();
        }
    public static String pegaAdmSenha(Administrador adm){
            return adm.getSenha();
        }
        
    }
    



    
