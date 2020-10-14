package fr.mds.cours.langageobjet.tp11.utils;

import java.util.ArrayList;
import java.util.List;

public class Conjugateur {
	
	public static List<String> vrbsPrmrGrpes = new ArrayList<>();
	public static List<String> pronoms = new ArrayList<>();
	public static List<String> conjugaison = new ArrayList<>();

	public List<String> getVrbsPrmrGrpe() {
		return vrbsPrmrGrpes;
	}

	public static void setVrbsPrmrGrpe(List<String> vrbsPrmrGrpe) {
		Conjugateur.vrbsPrmrGrpes = vrbsPrmrGrpe;
	}
	
	public List<String> getPronoms() {
		return pronoms;
	}

	public static List<String> getConjugaison() {
		return conjugaison;
	}

//	public Conjugateur() {
//		this.vrbsPrmrGrpes.add("Manger");
//		
//		this.pronoms.add("Je");
//		this.pronoms.add("Tu");
//		this.pronoms.add("Il / Elle");
//		this.pronoms.add("Nous");
//		this.pronoms.add("Vous");
//		this.pronoms.add("Ils / Elles");
//		
//		this.conjugaison.add("e");
//		this.conjugaison.add("es");
//		this.conjugaison.add("e");
//		this.conjugaison.add("ons");
//		this.conjugaison.add("ez");
//		this.conjugaison.add("ent");
//	}
	
	public static void conjugate() {
		for(String vrbsPrmrGrpe : vrbsPrmrGrpes) {
			for(int i = 0; i <pronoms.size() ; i++ ) {
				if(vrbsPrmrGrpe.endsWith("er")) {
					vrbsPrmrGrpe = vrbsPrmrGrpe.substring(0,vrbsPrmrGrpe.length() - 2);
				}
				System.out.println(pronoms.get(i)+ " " + vrbsPrmrGrpe + conjugaison.get(i)); 
			}
		}
	}

	public static void conjugate(String verb) {
		vrbsPrmrGrpes.clear();
		vrbsPrmrGrpes.add(verb);
		conjugate();
		
	}
	
	

	

}
