package fr.mds.cours.langageobjet.tp11;

import fr.mds.cours.langageobjet.tp11.utils.Conjugateur;

import java.util.Scanner;

public class Launcher {
	public static void main(String[] args) {
		Conjugateur.vrbsPrmrGrpes.add("Manger");
		
		Conjugateur.pronoms.add("Je");
		Conjugateur.pronoms.add("Tu");
		Conjugateur.pronoms.add("Il / Elle");
		Conjugateur.pronoms.add("Nous");
		Conjugateur.pronoms.add("Vous");
		Conjugateur.pronoms.add("Ils / Elles");
		
		Conjugateur.conjugaison.add("e");
		Conjugateur.conjugaison.add("es");
		Conjugateur.conjugaison.add("e");
		Conjugateur.conjugaison.add("ons");
		Conjugateur.conjugaison.add("ez");
		Conjugateur.conjugaison.add("ent");
		
		System.out.println(Conjugateur.conjugaison);
		
		Conjugateur.conjugate();
		
		conjugueAvecSaisi();
		 
		
	}	
	
	public static void conjugueAvecSaisi() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Donnez un verb du premier groupe:");
		String verb = keyboard.next();
		
		Conjugateur.conjugate(verb);
		keyboard.close();
	}

}
