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
	
	public String toStringLogement()
	{
		String str="";
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
	
	public void serializer()
	{
		try 
		{	
			//Propriétaires
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
}
