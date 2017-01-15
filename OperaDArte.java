package it.unipa.community.davideproietto.prg.n11.es01;

public abstract class OperaDArte {
private String titolo, autore, dataDiCreazione;

public OperaDArte(String ...strings){
	this.autore = strings[0];
	this.titolo = strings[1];
	this.dataDiCreazione=strings[2];
}

public void setTitolo(String titolo){
	if(titolo.isEmpty()){
		throw new IllegalArgumentException("Titolo non valido o campo vuoto");
	}
	this.titolo=titolo;
}

public String getTitolo(){
	return this.titolo;
}

public void setAutore(String autore){
	if(autore.isEmpty()){
		throw new IllegalArgumentException("Titolo non valido o campo vuoto");
	}
	this.autore=autore;
}

public String getAutore(){
	return this.autore;
}

public void setDataDiCreazione(String dataDiCreazione){
	if(dataDiCreazione.isEmpty()){
		throw new IllegalArgumentException("Titolo non valido o campo vuoto");
	}
	this.dataDiCreazione=dataDiCreazione;
}

public String getDataDiCreazione(){
	return this.dataDiCreazione;
}

//public void aggiungiOperaDArte(){
	//OperaDArte opera = new OperaDArte();
		
	//}
//}



@Override
public String toString(){
	StringBuilder s = new StringBuilder();
	s.append("Opera ").append(this.getTitolo()).append(this.getAutore()).append(this.getDataDiCreazione());
	return s.toString();// necessario per ritornare da uno StringBuider una stringa
}
}