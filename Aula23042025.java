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

public class Teste {
	public static void main(String[]args) {
		
	}
	

}


//Cliente.java
package app;

public class Cliente {
	private String nome;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String setNome(String nome) {
		this.nome = nome;
		
	}
	
	public String setCpf(String cpf) {
		this.cpf = cpf;
	}
}



//Conta.java

package app;

public class Conta {
	
	private Cliente cliente;
	private Double saldo;
	
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
