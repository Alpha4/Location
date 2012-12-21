import java.util.*;
import java.io.*;

/**	Classe : ListeProprio
*	Méthodes :
* 		Constructeur avec saisie des données
* 		
*/
public class ListeProprio implements java.io.Serializable
{
	private List <Proprietaire> proprios;
	
	/** Constructeur
	*	
	*/
	public ListeProprio ()
	{
		this.proprios=new Vector <Proprietaire>();
		static Random rand=new Random();
	}
	
	
	/** Méthode toString retournant les nom et
	* 	chiffres d'affaire des prorpiétaires
	* @see Proprietaire#toString()  
	*/
	public String toString()
	{
		String str="";
		for (Proprietaire p : proprios)
		{
			str=str+p.toString()+"\n";
		}
		return str;
	}
	
	public String toStringLogement()
	{
		String str="Nom|Type|Adresse|Prix\n";
		for (Proprietaire p : proprios)
		{
			str=str+p.toStringLogement()+"\n";
		}
		return str;
	}
	
	public Proprietaire get(String nom)
	{
		Proprietaire res=new Particulier();
		for (Proprietaire p : proprios)
		{
			if (p.getNom()==nom)
			{
				res=p;
			}
		}
		return res;
	}
	
		public void add(Proprietaire prop)
	{
		proprios.add(prop);
	}
	
	/** Méthode serializer
	* 	écrit l'objet dans un fichier  
	*/
	public void serializer()
	{
		try 
		{	
			FileOutputStream fichier = new FileOutputStream("proprios.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fichier);
			oos.writeObject(this);
			oos.flush();
			oos.close();
		}
		catch (java.io.IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public Reservation proposition(int nba,int nbe)
	{
		List <Logement> proposition=new Vector <Logement>();
		List <Proprietaire> choix=new Vector <Proprietaire>();
		List <Proprietaire> temp=new Vector <Proprietaire>();
		
		// Création d'une liste avec tous les propriétaires pouvant accueillir le groupe
		for (Proprietaire p : proprios)
		{
			if(p.getDisp>nba+nbe)
			{
				for() // VERIFICATION DES LOGEMENTS A LA MEME ADRESSE
				temp.add(p);
			}
		}
		
		//Création d'un liste contenant les propriétaires aux plus faibles ratio à 100€ près à partir de la liste temporaire
		
		choix.add(temp.get(0)); // on ajoute le premier proprietaire à la lsite comme premier point de comparaison
		
		int lastmin=choix.get(0).getRatio();// le ratio minimum pour l'instant est le sien
		for (Proprietaire p: temp)
		{
			int actuel = min(lastmin,choix.get(choix.size()).getRatio()); // minimum actuel de la liste
			int test = p.getRatio(); // ratio de p
			if (actuel-test<100) // la différence de ratio entre p et le min est inférieur à 100
			{
				choix.add(p); // on ajoute donc p à la liste
				if (test<actuel)
				{
					lastmin=test; // si le ratio de p est inférieur au minimum il est le nouveau minimum
				}
			}
			else if (actuel-test >100 && test<actuel) // le ratio de p est inférieur de plus de 100€ par rapport au minimum
			{
				choix.clear();// aucun proprietaire de la liste est à moins de 100€ de différence de ratio
				choix.add(p); // on ajoute p à la liste
				lastmin=test; // son ratio est le nouveau minimum
			}
		}
		
		//On tire au sort le proprietaire dans cette liste
		Proprietaire choisi=choix.get(rand.nextInt(choix.size()));
		
		if (choisi instanceof Particulier)
		{
			proposition.add
		}
	}
}
