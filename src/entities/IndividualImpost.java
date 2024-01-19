package entities;

public class IndividualImpost extends TexPayer {

	private double healthExpenditure;


	public IndividualImpost(String name, Double anualIncome, double health) {
		super(name, anualIncome);
		this.healthExpenditure = health;
	}

	public double gethealthExpenditure() {
		return healthExpenditure;
	}

	public void sethealthExpenditure(double health) {
		this.healthExpenditure = health;
	}

	@Override
	public Double tax() {
		
		if(getAnualIncome()<2000.00 && gethealthExpenditure()>0) {
			double diferenceanualIncome = (getAnualIncome()/100) *15;
			double diferenceHealth = (gethealthExpenditure()/100)*50;
			return diferenceanualIncome -= diferenceHealth;
			}
	
		if(getAnualIncome()>2000.00  && gethealthExpenditure()>0) {
			double diferenceAnualIncome =(getAnualIncome()/100)*25;										
			double diferenceHealth = (gethealthExpenditure()/100)*50;								
			return diferenceAnualIncome -= diferenceHealth;
			}
		
		if(getAnualIncome()>2000.00) {
			double diferenceAnualIncome =(getAnualIncome()/100)*25;										
			double diferenceHealth = (gethealthExpenditure()/100)*50;								
			return diferenceAnualIncome -= diferenceHealth;
			}
		
		if(getAnualIncome()<2000.00) {
			double diferenceanualIncome = (getAnualIncome()/100) *15;
			double diferenceHealth = (gethealthExpenditure()/100)*50;
			return diferenceanualIncome -= diferenceHealth;
			}else {
				return 0.0;
			}
		
		}
		
	}


