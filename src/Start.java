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

	/* Programme principal*/
	public static void main (String[] args)
	{
		/*Initialisation*/
		ListeProprio listep=new ListeProprio();
		ListeResa lister=new ListeResa();
		Scanner sc= new Scanner(System.in);
		
		
		/*Création de queqlues particuliers*/
		listep.add(new Particulier("Gandon"));
		listep.add(new Particulier("Brisseau"));
		listep.add(new Particulier("Fantasio"));
		listep.add(new Particulier("Lennon"));
		
		/*Création de queqlues entreprises*/
		listep.add(new Entreprise("EthoCorps"));
		listep.add(new Entreprise("GuudeInc"));
		listep.add(new Entreprise("MonsterCie"));
		
		/*Ajout de logement aux particuliers*/
		listep.get("Gandon").add(new Appartement("12, rue Werner Heisenberg",1750));
		listep.get("Gandon").add(new Appartement("14, rue Néron",150));
		listep.get("Brisseau").add(new Chalet("21, avenue Douglas Adams",250));
		listep.get("Fantasio").add(new Appartement("15, rue ",150));
		listep.get("Lennon").add(new Maison("42, boulevard Bordeciel",500));
		
		/*Ajout de logement aux entreprises*/
		listep.get("EthoCorps").add(new Appartement("1, rue Redstone",200));
		listep.get("EthoCorps").add(new Maison("13, avenue Mindcrack",400));
		listep.get("EthoCorps").add(new Chalet("16, rue Alfred Nobel",500));
		listep.get("GuudeInc").add(new Maison("1, avenue Mindcrack",500));
		listep.get("GuudeInc").add(new Chalet("3, avenue Mindcrack",500));
		listep.get("MonsterCie").add(new Chalet("35, boulevard Bob Wazowski",500));
		listep.get("MonsterCie").add(new Chalet("5, avenue Jacques Sullivan",500));
		
		System.out.println(listep.toString());
		
		/*Création des fichier*/
		listep.serializer();
		lister.serializer();
		}
}	
