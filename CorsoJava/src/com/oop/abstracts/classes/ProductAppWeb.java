package com.oop.abstracts.classes;

public class ProductAppWeb extends PreventivoAppWeb{
	
		private int tariffa;
		private int daysFigma;
		private int daysMockUp;
		private int daysdbOffline;
		private int daysResponsive;
		private int daysMultiLanguage;
		private String waitingTimesApp;

	@Override
	public int getDaysFigma() {
		return daysFigma;
	}

	
	@Override
	public int getDaysMockUp() {
		return daysMockUp;
	}

	@Override
	public int getDaysdbOffline() {
		
		return daysdbOffline;
	}

	@Override
	public int getDaysResponsive() {
		
		return daysResponsive;
	}

	@Override
	public String getWaitingTimes() {
		
		return waitingTimesApp;
	}

	@Override
	public int getDaysMultiLanguage() {
		
		return daysMultiLanguage;
	}

	@Override
	public int getCostoFigma() {
	
		return tariffa * getDaysFigma();
	}

	@Override
	public int getCostoMockUp() {
	
		return tariffa * getDaysMockUp();
	}

	@Override
	public int getCostodbOffline() {
	
		return tariffa * daysdbOffline;
	}

	@Override
	public int getCostoResponsive() {
		
		return tariffa * getDaysResponsive();
	}

	@Override
	public int getCostoMultiLanguage() {
		
		return tariffa * getDaysMultiLanguage();
	}

	
	public int getTotalPriceApp() {
		return getCostoMultiLanguage() +  getCostoResponsive() + getCostodbOffline() + getCostoMockUp() + getCostoFigma();
	}
	
	
	
	
	
	public void setTariffa(int tariffa) {
		this.tariffa = tariffa;
	}

	public void setDaysFigma(int daysFigma) {
		this.daysFigma = daysFigma;
	}

	public void setDaysMockUp(int daysMockUp) {
		this.daysMockUp = daysMockUp;
	}

	public void setDaysdbOffline(int daysdbOffline) {
		this.daysdbOffline = daysdbOffline;
	}

	public void setDaysResponsive(int daysResponsive) {
		this.daysResponsive = daysResponsive;
	}

	public void setDaysMultiLanguage(int daysMultiLanguage) {
		this.daysMultiLanguage = daysMultiLanguage;
	}

	public void setWaitingTimesApp(String waitingTimesApp) {
		this.waitingTimesApp = waitingTimesApp;
	}

	
	
	
	
	
}
