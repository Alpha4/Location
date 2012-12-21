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
	
	/** Méthode get
	* @param nom nom du proprietaire recherché
	* @return res proprietaire recherché ou particulier 'vide' si pas trouvé
	*/
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
	
	public Reservation proposition(int nba,int nbe,String nomloc)
	{
		Random rand=new Random();
		List <Logement> proposition=new Vector <Logement>();
		List <Proprietaire> choix=new Vector <Proprietaire>();
		List <Proprietaire> temp=new Vector <Proprietaire>();
		
		// Création d'une liste avec tous les propriétaires pouvant accueillir le groupe
		boolean breakFlag = false;
		for (Proprietaire p : proprios)
		{
			if(p.getDisp>nba+nbe)
			{
				List <Logement> dispo=new Vector <Logement>();				for (Logement l : p.getBiens()) //On parcourt la liste de ses logements				{					if (l.getDispo() == true) //Et on vérifie leur disponibilité					{						dispo.add(l);					}				}				for (Logement l : dispo) //On parcourt la liste des logements disponible				{					List <Logement> meme=new Vector <Logement>(); //On crée une liste avec tous les logements ayant la même adresse					meme.add(dispo.get(l)); //On lui ajoute un premier logement					for (Logement log : dispo) //On parcourt à nouveau la liste des logements du propriétaire					{						if (log.getAdresse == meme.get(0).getAdresse && log.getPrix != meme.get(0).getPrix)						{							//On compare l'adresse et le prix pour ne pas ajouter deux fois le même logement							meme.add(log); // On l'ajoute à la liste						}
						int cat=0;						for (Logement loge : meme) //On parcourt notre liste de logement ayant la même adresse						{							cat += loge.getCapacite; //Pour calculer leur capacité totale							if (cat >= nba+nbe) //Et si cette capacité est supérieur au nombrede personne de la réservation							{								temp.add(p); //On ajoute le propriétaire des logements à notre liste des propriétaires potentiels
								breakFlag = true;							break;							}						}
						if(breakFlag){break;}					}
					if(breakFlag){break;}				}
				if(breakFlag){break;}
			}
			if(breakFlag){break;}
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
			proposition=choisi.getBiens();
		}
		else // on crée une liste contenant les différentes possibilités en essayant d'être au plus proche du nombre de personnes. Mais ce n'est pas le cas (il faudrait pour cela être spur que les logement sont triés par ordre croissant de capacite) Cette fonction ne marche donc pas parfaitement de ce poit de vue.  
		{
			List <Logement> dispo=new Vector <Logement>();
			for (Logement l : choisi.getBiens()) //On parcourt la liste de ses logements			{				if (l.getDispo() == true) //Et on vérifie leur disponibilité				{					dispo.add(l);				}			}
			List <List> propositions=new Vector<List>();			for (Logement l : dispo) //On parcourt la liste des logements disponible			{
				List <Logement> prop=new Vector<Logement>();
				prop.add(l);
				if(l.getCapacite>=nba+nbe)
				{
					propositions.add(prop);
					continue;
				}
				else
				{
					int cat=l.getCapacite(0);					for (Logement log : dispo) //On parcourt à nouveau la liste des logements du propriétaire					{
						if (log.getAdresse == l.getAdresse && log.getPrix != l.getPrix)						{							//On compare l'adresse et le prix pour ne pas ajouter deux fois le même logement							prop.add(log); // On l'ajoute à la liste
							cat+=log.getCapacite();
							if(cat>=nba+nbe)
							{
								propositions.add(prop);
								break;
							}						}						
					}
				}
			}
			proposition=propositions.get(rand.nextInt(propositions.size()));
		}
		return new Reservation(proposition,nomloc,nba,nbe,proposition.get(0).getNom());
	}
}
