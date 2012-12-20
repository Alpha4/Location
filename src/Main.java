import java.util.*;
import java.io.*;
/**
*Projet de TP : Gestion d'un parc de logements 
* @author Aurelien Brisseau et Hippolyte Gandon
* @version 1.1
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
		try 
		{
			FileOutputStream fichier = new FileOutputStream("ossau.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fichier);
			oos.writeObject(proprios);
			oos.writeObject(reservations);
			oos.flush();
			oos.close();
		}
		catch (java.io.IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void deserializer(List proprios, List reservations) 
	{
		try
		{
			FileInputStream fichier = new FileInputStream("ossau.ser");
			ObjectInputStream ois = new ObjectInputStream(fichier);
			proprios= (List) ois.readObject();
			reservations=(List) ois.readObject();
		} 
		catch (java.io.IOException e) 
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	/* Programme principal*/
	public static void main (String[] args)
	{
		/*Initialisation*/
		List <Proprietaire> proprios=new Vector <Proprietaire>();
		List <Reservation> reservations=new Vector <Reservation>();
		deserializer(proprios,reservations);
		
		/*Menu*/
		int choix=1;
		do
		{
			System.out.println("*********MENU*********");
			System.out.println("1) Demande de Réservation");
			System.out.println("2) Affichage des réservations en cours");
			System.out.println("3) Affichage des proprétaires (avec leur chiffre d'affaire");
			System.out.println("7) Sortie du programme");
			System.out.print("Choix : ");
			choix=sc.nextInt();
			System.out.println("----------------------");
			switch(choix)
			{				
				case	1 : // Demande de réservation
					System.out.println("LoL two")
					break;
	}
}	
