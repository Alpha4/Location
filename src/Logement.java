import java.util.*;
import java.io.*;

/**	Classe : Logement
*	Méthodes :
*/
public abstract class Logement implements java.io.Serializable
{
	private String type,adresse;
	private int capacite;
	private int prix;
	
	public Logement (String type,int capacite,String adresse,int prix)
	{
		this.type=type;
		this.adresse=adresse;
		this.capacite=capacite;
		this.prix=prix;		
	}
	
	public abstract int calculprix(int nba,int nbe);
	
	public int getPrix()
	{
		return prix;
	}
}
