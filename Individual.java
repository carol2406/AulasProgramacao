
public class Individual extends TaxPayer {
	
	private Double healthExpenditures;

		public Individual(String nome, Double anuallncome, Double healthExpenditures) {
		super(nome, anuallncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
}
