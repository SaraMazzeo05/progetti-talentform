package com.oop.abstracts.classes;

public class MainAppWeb {

	
	
	
	
	
	
	public static void main(String[] args) {
		
		ProductAppWeb app = new ProductAppWeb();
		app.setTariffa(250);
		app.setDaysFigma(30);
		app.setDaysdbOffline(30);
		app.setDaysMockUp(30);
		app.setDaysResponsive(30);
		app.setDaysMultiLanguage(30);
		
		System.out.println(app.getTotalPriceApp());
		
	}
}
