
public class TaxPayer {
	
	private String nome;
	private Double anuallncome;
	
	public TaxPayer(String nome, Double anuallncome) {
		super();
		this.nome = nome;
		this.anuallncome = anuallncome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getAnuallncome() {
		return anuallncome;
	}

	public void setAnuallncome(Double anuallncome) {
		this.anuallncome = anuallncome;
	} 
	
	public double tax(); 
	}

}
