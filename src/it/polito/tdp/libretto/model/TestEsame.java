package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class TestEsame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Esame tdp=new Esame ("03FYZ","tecniche di programmazione","Fulvio Corno");
		System.out.println(tdp);
		
		Esame ami= new Esame ("01QZP","ambient inteligent","Fulvio Corno");
		System.out.println(ami);
		
		System.out.println(ami.equals(tdp));
		
		tdp.supera(30, LocalDate.now());
		System.out.println(tdp);
		

	}

}
