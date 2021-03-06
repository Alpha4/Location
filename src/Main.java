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
	/* Programme principal*/
	public static void main (String[] args)
	{
		/*Initialisation*/
		ListeProprio listep = new ListeProprio();
		ListeResa lister = new ListeResa();
		
		//Lecture des fichiers
		try
		{
			FileInputStream f1 = new FileInputStream("reserv.ser");
			ObjectInputStream ois1 = new ObjectInputStream(f1);
			lister = (ListeResa) ois1.readObject();
		
			FileInputStream f2=new FileInputStream("proprios.ser");
			ObjectInputStream ois2 = new ObjectInputStream(f2);
			listep= (ListeProprio) ois2.readObject();
		}
		catch (java.io.IOException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		Scanner sc= new Scanner(System.in);
		
		/*Menu*/
		int choix=1;
		do
		{
			System.out.println("*********MENU*********");
			System.out.println("1) Demande de Réservation");
			System.out.println("2) Affichage des réservations en cours");
			System.out.println("3) Affichage des proprétaires (avec leur chiffre d'affaire)");
			System.out.println("4) Sortie du programme");
			System.out.print("Choix : ");
			choix=sc.nextInt();
			System.out.println("----------------------");
			switch(choix)
			{				
				case	1 : // Demande de réservation
					System.out.println("Combien d'adultes ?");
					int nba=sc.nextInt();
					System.out.println("Combien d'enfants ?");
					int nbe=sc.nextInt();
					System.out.println("Quel le nom du locataire ?");
					String nomloc=sc.next();
					Reservation r=listep.proposition(nba,nbe,nomloc);
					if (r.getNomprop().equals("vide"))
					{
						System.out.println("Désolé, nous ne pouvons satisfaire votre demande.");
					}
					else
					{
						System.out.println(r.propositionToString());
						System.out.println("Valider ? (oui/non)");
						String ouinon=sc.next();
						if (ouinon.equals("oui"))
						{
							
							lister.add(listep,r);
							System.out.println("Validé.");
						}
						else
						{
							System.out.println("Retour au menu");
						}
					}
				break;
					
				case	2 : //Affichage des réservations en cours
					System.out.println(lister.toString());
				break;
					
				case	3 : //Affichage des propriétaires et leur chiffre d'affaire
					System.out.println("Nom|CA");
					System.out.println(listep.toString());
				break;
				
				default: //on enregistre les changements dans les fichiers
					listep.serializer();
					lister.serializer();
				break;
			}
		}while(choix>0 && choix<4);
	}
}