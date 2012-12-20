import java.util.*;
import java.io.*;
/**
*Classe permettant de créer les données
intiales des propriétaires et réservations 
* @author Aurelien Brisseau et Hippolyte Gandon
* @version 1.0
*/

public class Start
{

	public static void serializer(ListeProprio proprios,ListeResa reservations)
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
	
	public static void deserializer(ListeProprio proprios,ListeResa reservations) 
	{
		try
		{
			FileInputStream fichier = new FileInputStream("ossau.ser");
			ObjectInputStream ois = new ObjectInputStream(fichier);
			proprios= (ListeProprio) ois.readObject();
			reservations=(ListeResa) ois.readObject();
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
		ListeProprio proprios=new ListeProprio();
		ListeResa reservations=new ListeResa();
		Scanner sc= new Scanner(System.in);
		
		/*Menu*/
		int choix=1;
		do
		{
			System.out.println("*********MENU*********");
			System.out.println("1) Créer propriétaire");
			System.out.println("2) Créer et ajouter un logement à un propriétaire");
			System.out.println("7) Sortie du programme");
			System.out.print("Choix : ");
			choix=sc.nextInt();
			System.out.println("----------------------");
			int type=1;
			String nom="";
			switch(choix)
			{				
				case 1:
					do
					{
						System.out.println("Souhaitez vous créer : ");
						System.out.println("1) Un particulier propriétaire");
						System.out.println("2) Une entreprise propriétaire");
						type=sc.nextInt();
						System.out.print("Entrez le nom du nouveau propriétaire : ");
						nom=sc.next();
						switch(type)
						{
							case 1:
								proprios.add(new Particulier(nom));
							break;
							
							case 2:
								proprios.add(new Entreprise(nom));
							break;
						}
					}while (type!=1 && type !=2);					
				break;
				
				case 2:
					do
					{
						System.out.println("Souhaitez vous créer : ");
						System.out.println("1) Un appartement");
						System.out.println("2) Un chalet");
						System.out.println("3) Une maison");
						type=sc.nextInt();
						System.out.print("Entrez l'adresse du logement : ");
						String adresse=sc.next();
						System.out.print("Entrez le prix fixe du logement : ");
						int prix=sc.nextInt();
						System.out.print("Saisissez le nom du propriétaire auquel l'ajouter : ");
						nom=sc.next();
						
						switch(type)
						{
							case 1: //appartement
								proprios.get(nom).add(new Appartement(adresse,prix));
							break;
							
							case 2: //chalet
								proprios.get(nom).add(new Chalet(adresse,prix));
							break;
							
							case 3: //maison
								proprios.get(nom).add(new Maison(adresse,prix));
							break;
						}
					}while (type>0 && type<4);
				break;
			}
		}
		while(choix>0 && choix<7);
	}
}	
