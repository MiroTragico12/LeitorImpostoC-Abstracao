package entities;

public class CompanyImpost extends TexPayer{
	private int numberOfEmployees;

	public CompanyImpost(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}	

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		if (numberOfEmployees <=10) {
			return (getAnualIncome()/100)*16;
		}else {
			return (getAnualIncome()/100)*14;
		}
		
	}
	
}
