package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyImpost;
import entities.IndividualImpost;
import entities.TexPayer;

public class Program {
    public static void main(String[] args) {
       
    	Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TexPayer> list= new ArrayList<>();
        
        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i<=n;i++) {
        		
        	System.out.println("Individual or company(i/c)?");
        	String ic = sc.next();
        	System.out.println("Name: ");
        	String name = sc.next();
        	System.out.println("Anual income: ");
        	double anualIncome = sc.nextDouble();
        	
        	if(ic.equals("i")) {
        		System.out.println("Health expenditure: ");
            	double healthExpenditure = sc.nextDouble();
        		TexPayer individual = new IndividualImpost(name, anualIncome, healthExpenditure);
        		list.add(individual);
        	}if(ic.equals("c")) {
        		System.out.println("Number of employees: ");
        		int employees = sc.nextInt();
        		TexPayer company = new CompanyImpost(name, anualIncome, employees);
        		list.add(company);
        	}
        	
        }
        
        System.out.println();
        System.out.println("TAXES PAID");
        for(TexPayer tp: list) {
        	double tax = tp.tax();
        	System.out.println(tp.getName() + "$" + String.format("%.2f", tax));
        }
        
        
        sc.close(); 
    }
}
