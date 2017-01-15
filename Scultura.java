package it.unipa.community.davideproietto.prg.n11.es01;

import java.util.*;

public class Scultura extends OperaDArte {
private String materiale;
private String altezza;

	public Scultura(String... strings) {
		super(strings);
		this.altezza = strings[3];
		this.materiale = strings[4];
	}

public String getAltezza(){
	return this.altezza;
}
	
public String getMateriale(){
	return this.materiale;
}
	
	@Override
	public boolean equals(Object o){
		if(Objects.isNull(o) || !(o instanceof Scultura)){
			return false;
		}
		Scultura scu =(Scultura) o;	// assegna il reference a dip
			return super.equals(o) && this.altezza.equals(scu.getAltezza()) && this.materiale.equals(scu.getMateriale());
		}	
	
	
	@Override
	public String toString() {
	return super.toString().replace("Opera", "Scultura")// ritorna la stringa della super classe + materiale e altezza
			+ "il materiale "+ this.materiale + "e di altezza : "+ this.altezza +".";
	}

}
