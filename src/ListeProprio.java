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
	*	avec saisie des données
	*/
	public ListeProprio ()
	{
		this.proprios=new Vector <Proprietaire>();
	}
	
	public String toString()
	{
		String str="";
		for (Proprietaire p : proprios)
		{
			str=str+p.toString();
		}
		return str;
	}
	
	public Proprietaire get(String nom)
	{
		Proprietaire res=NULL;
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
}
