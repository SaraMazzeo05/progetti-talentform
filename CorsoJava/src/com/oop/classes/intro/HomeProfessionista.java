package com.oop.classes.intro;

import com.oop.classes.esercizi.MyFreelancer;

public class HomeProfessionista {


	public static void main(String[] args) {

		MyFreelancer f = new MyFreelancer(85000, 67, 26, 15);
		System.out.println(f.getTotaleNetto());
		
		OtherFreelancer o = new OtherFreelancer (75000, 78, 26, 5);
		System.out.println(o.getTotaleNetto());
		
	}

}
