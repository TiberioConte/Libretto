package it.polito.tdp.libretto.model;

import java.util.ArrayList;
import java.util.List;


public class Model {
	private List<Esame> esami;
	
	public Model(){
		this.esami=new ArrayList<Esame>();
	}
	/**
	 * aggiunge un nuovo esame a quelli presenti,
	 * verificando che non ci sia già
	 * ritorna vero se lo inserisce ,false se lo conteneva già
	 * @param e
	 */
	public boolean addEsame(Esame e){
		if(!esami.contains(e)){
		esami.add(e);
		return true;
		}
		
		return false;
		
	}
	/**
	 * ricerca se esiste un esame con il codice passato
	 * se esiste lo restituisce se no restituisce null
	 * @param codice
	 * @return
	 */
	public Esame trovaEsame(String codice){
		//funziona solo xk ho ridefinito equals
		Esame finto=new Esame (codice,null,null);
		int pos=this.esami.indexOf(finto);
		if(pos==-1){
			//oggetto non trovato
			return null;
		}
		else{
			return esami.get(pos);
		}	
	}
	

}
