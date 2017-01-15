package it.unipa.community.davideproietto.prg.n11.es01;
import java.util.*;
public class Dipinto extends OperaDArte {
private String[] tecnica = {"olio", "tempera", "litografia", "serigrafia", "china"};
private String dimensioni;


	public Dipinto(String... strings) {
		super(strings);
		this.dimensioni= strings[3];// da verificare
		this.tecnica[5]= strings[4];
	}

	public String getDimensioni(){
		return dimensioni;
	}
	
	public String[] getTecnica() {
		return tecnica;
	}

	@Override
	public boolean equals(Object o){
		if(Objects.isNull(o) || !(o instanceof Dipinto)){
			return false;
		}
		Dipinto dip =(Dipinto) o;	// assegna il reference a dip
			return super.equals(o) && this.dimensioni.equals(dip.getDimensioni()) && this.tecnica.equals(dip.getTecnica());
		}
	//}
	
	@Override
	public String toString() {
	return super.toString().replace("Opera", "Dipinto") // Sostituisce ad Opera Dipinto chiamando la toString della superClasse
					+ this.dimensioni + this.tecnica;
	}

}
