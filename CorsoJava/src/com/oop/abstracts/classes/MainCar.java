package com.oop.abstracts.classes;

public class MainCar extends Car {

	protected double resaCarburante;
    protected double gas;
    protected boolean benzina;
    
    public MainCar(double KmL) {
        this.resaCarburante = KmL;
        this.gas = 0;
        this.benzina = true;
    }
    
    @Override
    public void drive(double km){
        if(gas >= (km/resaCarburante))
            this.gas -= (km/resaCarburante);
    }
    
    @Override
    public double getGas() {
        return this.gas;
    }
    
    @Override
    public void addGas(double rifornimento) {
        this.gas = rifornimento;
    }
    
    

    public static void main(String[] args) {
     MainCar m = new MainCar(30);
        
        System.out.println("Carburante iniziale: "+m.getGas());
        m.addGas(20);
        System.out.println("Carburante dopo rifornimento: "+m.getGas());
        m.drive(150);
        System.out.println("Carburante rimanente: "+m.getGas());

    }


}
