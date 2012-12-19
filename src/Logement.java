import java.util.Scanner;
import java.util.Random;

/**	Classe : Logement
*	Méthodes :
*/
public abstract class Logement
{
	private String type,adresse;
	private int capacite;
	private int prix;
	
	public Logement (String type,String adresse,int capacite,int prix)
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
