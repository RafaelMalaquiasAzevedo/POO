/* CRIAR CLASSE CLIENTE
CLIENTE
 - NOME
 - CPF
 - CONSTRUTORES PARA OS DOIS ATRIBUTOS pr

CONTA
- SALDO
- CLIENTE
- METODOS
- DEPOSITAR E SACAR
*/

//Teste.java
package app;
/*
 * Aula sobre qualificadores de acesso 
 */
//Qualificadores de acesso:
//default, protected, private e public

//default dentro do mesmo pacote
//protected dentro do mesmo pacote ou classes que herdem entre si
//private

//get pegar
//set alterar
public class Teste {
	public static void main(String[]args) {
		Conta conta = new Conta();
		Cliente cliente = new Cliente("José","000.001");
		conta.depositar(10.);
		
		conta.setCliente(cliente);

		conta.getCliente().setNome("Rafael");
		
		
		}
	

}

}


//Cliente.java
package app;

public class Cliente {
	private String nome;
	private String cpf;
	//public Cliente(){} - Isso se não apresentar nada que deva ser inicializado por parâmetro
	public Cliente (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}



//Conta.java

package app;

public class Conta {
	private Integer numeroConta; //Comum usar inicializar
	private Cliente cliente;
	private Double saldo;
	
	
	public Conta() {
		this.saldo = 0.0; //Inicializa a conta em 0 reais
	}
	
	public double depositar(Double valor) { //setSaldo
		return saldo+valor;
	}
	
	public double sacar(Double valor) {  //setSaldo 2 alterado para caber na regra de negócio
		return saldo-valor;
	}
	
	public void setCliente(Cliente cliente){
		this.cliente = cliente;
	}
	
	public double getSaldo () {
		return saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
}

