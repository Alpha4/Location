import java.util.*;
import java.io.*;
/**
*Projet de TP : Gestion d'un parc de logements 
* @author Aurelien Brisseau et Hippolyte Gandon
* @version 2.4
*/


/*
	Lecture d'un fichier contenant la description des proprio
	Saisie des demandes de location
	modification du CA à la validation
	Affichage réservations avec nom du locataire et prix
	Affichage proprios avec CA

*/
public class Main
{

	public static void serializer(List proprios,List reservations)
	{
		try {
			FileOutputStream fichier = new FileOutputStream("ossau.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fichier);
			oos.writeObject(proprios);
			oos.writeObject(reservations);
			oos.flush();
			oos.close();
		}
		catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void deserializer(List proprios, List reservations) {
		try
		{
			FileInputStream fichier = new FileInputStream("ossau.ser");
			ObjectInputStream ois = new ObjectInputStream(fichier);
			proprios= (List) ois.readObject();
			reservations=(List) ois.readObject();
		} 
		catch (java.io.IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	/* Programme principal*/
	public static void main (String[] args)
	{
		/*Initialisation*/
		Maison a=new Maison("La Davière",50);
		int test=a.calculprix(3,4);
		System.out.println(test);
		Logement b=new Chalet("balbla",500);
		test=b.calculprix(0,0);
		System.out.println(test);
	}
}	
