package it.polito.tdp.libretto.model;

public class TestModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model m=new Model();
		
		System.out.println(m.addEsame(new Esame ("03FYZ","tecniche di programmazione","Fulvio Corno")));
		System.out.println(m.addEsame(new Esame ("01QZP","ambient inteligent","Fulvio Corno")));
		System.out.println(m.addEsame(new Esame ("03FYZ","tecniche di programmazione","Fulvio Corno")));
		
		System.out.println(m.trovaEsame("03FYZ"));
		System.out.println(m.trovaEsame("99000"));

	}

}
