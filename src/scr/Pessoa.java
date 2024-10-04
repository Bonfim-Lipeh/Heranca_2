package scr;

public class Pessoa {

	private String nome;
	private String cpf;
	private String datanasce;
	private String datacontrata;
	private int salariobase;

	
	public Pessoa(String nome, String cpf, String datanasce, String datacontrata, int salariobase) {
		this.nome = nome;
		this.cpf = cpf;
		this.datanasce = datanasce;
		this.datacontrata = datacontrata;
		this.salariobase = salariobase;

		
	}



public class vendedor extends Pessoa{
	
	private int percomissao;
	
	public vendedor(String nome, String cpf, String datanasce, String datacontrata, int salariobase, int percomissao) {
		
		super(nome, cpf, datanasce, datacontrata, salariobase);
		this.percomissao = percomissao;
	}
	
	public int getpercomissao() {
		return percomissao;
	}
	
}

public class Gerente extends Pessoa{
	
	private String departamento;
	
	public Gerente(String nome, String cpf, String datanasce, String datacontrata, int salariobase, String departamento) {
		
		super(nome, cpf, datanasce, datacontrata, salariobase);
		this.departamento = departamento;
	}
	
	public String getdepartamento() {
		
		return departamento;
	}
}

public  class Cliente extends Pessoa{
	
	private String email;
	private String cartaofid;
	private String telefone;
	
	public Cliente(String nome, String cpf, String datanasce,String email, String cartaofid, String telefone) {
		super(nome, cpf, datanasce, "", 0);
		this.email = email;
	}
	
	public String getemail() {
		return email;
	}
	
	public String getcartaofid() {
		return cartaofid;
	}
	
	public String gettelefone() {
		return telefone;
	}
}

public String getnome() {
	return nome;
}

public String getcpf() {
	return cpf;
}

public String getdatanasce() {
	return datanasce;
}

public String getdatacontrata() {
	return datacontrata;
}

public int getsalariobase() {
	return salariobase;
}

public class main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("João Silva", "12345678901", "01/01/2000", "01/01/2023", 2000);

        vendedor vendedor1 = new vendedor("José Santos", "98765432101", "01/01/1990", "01/01/2021", 1800, 10);

        Gerente gerente1 = new Gerente("Maria Oliveira", "32165498700", "01/01/1980", "01/01/2015", 2500, "Vendas");

        Cliente cliente1 = new Cliente("Ana Souza", "00000000000", "01/01/2010", "ana@email.com", "123456789", "551198765432");

        System.out.println("Pessoa:");
        System.out.println("  Nome: " + pessoa1.getnome());
        System.out.println("  CPF: " + pessoa1.getcpf());
        System.out.println("  Data de Nascimento: " + pessoa1.getdatanasce());
        System.out.println("  Data de Contratação: " + pessoa1.getdatacontrata());
        System.out.println("  Salário Base: " + pessoa1.getsalariobase());

        System.out.println("\nVendedor:");
        System.out.println("  Nome: " + vendedor1.getnome());
        System.out.println("  CPF: " + vendedor1.getcpf()); 
        System.out.println("  Data de Nascimento: " + vendedor1.getdatanasce());
        System.out.println("  Data de Contratação: " + vendedor1.getdatacontrata());
        System.out.println("  Salário Base: " + vendedor1.getsalariobase()); 
        System.out.println("  Comissão: " + vendedor1.getpercomissao());

        System.out.println("\nGerente:");
        System.out.println("  Nome: " + gerente1.getnome()); 
        System.out.println("  CPF: " + gerente1.getcpf()); 
        System.out.println("  Data de Nascimento: " + gerente1.getdatanasce()); 
        System.out.println("  Data de Contratação: " + gerente1.getdatacontrata());
        System.out.println("  Salário Base: " + gerente1.getsalariobase()); 
        System.out.println("  Departamento: " + gerente1.getdepartamento());

        System.out.println("\nCliente:");
        System.out.println("  Nome: " + cliente1.getnome()); 
        System.out.println("  CPF: " + cliente1.getcpf()); 
        System.out.println("  Data de Nascimento: " + cliente1.getdatanasce()); 
        System.out.println("  Email: " + cliente1.getemail());
        System.out.println("  Cartão Fidelidade: " + cliente1.getcartaofid());
        System.out.println("  Telefone: " + cliente1.gettelefone());
    }
}
}

