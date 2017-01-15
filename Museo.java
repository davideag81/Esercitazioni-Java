package it.unipa.community.davideproietto.prg.n11.es01;
import java.util.*;
public class Museo {
private String nome;
private String indirizzo;
private static Map<String, OperaDArte> opere ; // le opere d'arte sono inventarite per string in una mappa

public Museo(String nome, String indirizzo){ // costruisci un museo
	this.nome = nome;
	this.indirizzo= indirizzo;
	this.opere = new HashMap<>();
}



public String getNome() {
	return nome;
}



public void setNome(String nome) {
	this.nome = nome;
}



public String getIndirizzo() {
	return indirizzo;
}



public void setIndirizzo(String indirizzo) {
	this.indirizzo = indirizzo;
}



public static Map<String, OperaDArte> getOpere() {
	return opere;
}



public static void setOpere(Map<String, OperaDArte> opere) {
	Museo.opere = opere;
}



public void printListOpera(){ 	// itera le opere
	  Iterator inventarioMuseo = this.opere.values().iterator(); 
	  System.out.println("Lista opere del museo " + this.getNome() + ",  " + this.getIndirizzo() + " :"); 
	     while (inventarioMuseo.hasNext()) { 
	    	 System.out.println(" "+ inventarioMuseo.next()+"\n");
	     }
	
}

public void addOpera(OperaDArte o){
	
	
}

public void removeOpera(){
	
}
@Override
public String toString(){
	return ("Hai creato il Museo \" " + getNome() + " sito presso " + getIndirizzo());
}
}
