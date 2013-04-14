package generated;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Main {
	
	public static void main(String[] args) throws JAXBException {
	    
		//einlesen der Datei
		JAXBContext context = JAXBContext.newInstance("generated");
	    Unmarshaller um = context.createUnmarshaller();
	    Scanner in = new Scanner(System.in);
	    
	    //unmarshalling
	    Rezeptliste rl = (Rezeptliste) um.unmarshal(new File("C:/Users/maX!mum/git/wba2/Phase1/src/aufgabe3d.xml"));
	    
	    //Menueauswahl
	    menue(in, rl, context);
	} 
	
	//Menueaufruf
	public static void menue(Scanner in, Rezeptliste rl, JAXBContext context) throws JAXBException {
		int number_recipes = rl.getRezept().size();
		System.out.println("Bitte waehlen Sie eine der folgenden Optionen:");
		System.out.println("Rezept auswaehlen - 1");
		System.out.println("Kommentar verfassen - 2");
		System.out.println("Schließen - 3");
		System.out.printf("Ihre Wahl: ");
		int choice = in.nextInt();
		
		if (choice == 3)
			System.out.println("Dieses Programm wird sich selbst zerstoeren in 3.. 2.. 1.. ");
		//Rezeptabfrage
		else {
			System.out.printf("Bitte Rezept waehlen: ");
			int recipe_choice = in.nextInt();
			
			if (recipe_choice > number_recipes || recipe_choice < 1) {
				System.out.println("Das ausgewaehlte Rezept gibt es nicht. Bitte versuchen Sie es noch einmal.\n");
				menue(in, rl, context);
			} else {
				Rezept r = rl.getRezept().get(0);
				for(int i = 0; i < number_recipes; i++) {
					if ((i+1) == recipe_choice) {
						r = rl.getRezept().get(i);
						
						//Funktionsaufruf nach gewählter Nummer
						switch (choice) {
						case 1: ausgabe(r, in, rl, context); break;
						case 2: kommentar(r, in, rl, context); break;
						default: System.out.printf("Nochmal versuchen."); menue(in, rl, context); break;
						}
					}
					System.out.println("\n");					
				}
			}
		}
	}
	//Ausgabe
	public static void ausgabe(Rezept r, Scanner in, Rezeptliste rl, JAXBContext context) throws JAXBException {
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		//Titel und Untertitel
		System.out.printf("%s %n%s %n%n", r.titel, r.untertitel);
	   	
		//Zutaten
		System.out.printf("Zutaten:%n");
		for (Zutatentyp ing : r.zutat) {
			System.out.println(ing.getAnzahl() + " " + ing.getEinheit() + " " + ing.getName());
	   	}
		
		//zusaetzliche Informationen
    	System.out.println("\nZubereitung: " + r.zubereitung);
	   	System.out.println("Zubereitungszeit: " + r.zeit.anzahl + " " + r.zeit.einheit);
	   	System.out.println("Schwierigkeitsgrad: " + r.schwierigkeit.level);
	   	
	   	//optionale Informationen
	   	if (r.brennwert != null)
	   		System.out.println("Brennwert: " + r.brennwert.kalorien + " kcal");
	   	
	   	//Kommentare
	   	System.out.println("\nKommentare: ");
	   	List<Kommentar> kommentare = r.getKommentar();
	   	if (kommentare.isEmpty())
	   		System.out.println("Zur Zeit gibt es keine Kommentare zu diesem Rezept");
	   	else {
	   		for (Kommentar k : r.kommentar) {
	   			System.out.println("Von " + k.autor);
	   			System.out.println(k.nachricht);
	   		}
	   	}
	   	System.out.println("--------------------------------------------------------------------------------------------------------------------");
	}
	//Kommentar hinzufuegen
	public static void kommentar(Rezept r, Scanner in, Rezeptliste rl, JAXBContext context) throws JAXBException {
		if (r.kommentar == null) {
			List<Kommentar> kommentar = new ArrayList<Kommentar>();
			r.kommentar = kommentar;
		}
		//Daten einlesen
		System.out.printf("Ihr Name: ");
		String author = in.next();
		in.nextLine();
		System.out.printf("Ihr Kommentar: ");
		String nachricht = in.nextLine();
		
		//Daten einfuegen
		Kommentar k = new Kommentar();
		k.setAutor(author);
		k.setNachricht(nachricht);
		
		r.kommentar.add(k);
		
		//marshalling, Speicherung in XML
	    Marshaller ma = context.createMarshaller();
	    ma.marshal(rl, new File("C:/Users/maX!mum/git/wba2/Phase1/src/aufgabe3d.xml"));	    
	}
}