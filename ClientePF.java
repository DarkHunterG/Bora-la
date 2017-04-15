
package ClientePF;

public class ClientePF {
    private String nome;
    private String cpf;
    private int idade = 0;
    
    
	//asdsadsad
    public ClientePF(String nome,int idade,String cpf){
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
    }
    public ClientePF(String nome){
    this.nome = nome;
    }
    public String getNome(){
    return nome;
 
    public String getCpf(){
    return cpf;
    }
    public void setIdade(int idade){
    this.idade = idade;
    }
    public int getIdade(){
    return idade;
    }
}
